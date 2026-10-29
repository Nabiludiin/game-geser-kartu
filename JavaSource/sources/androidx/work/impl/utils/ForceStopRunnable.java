package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.b;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import e1.j;
import e1.s;
import f1.f;
import f1.h;
import h1.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.n;
import m1.p;
import m1.q;
import n1.d;

/* compiled from: MyApplication */
public class ForceStopRunnable implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final String f3091t = j.f("ForceStopRunnable");

    /* renamed from: u, reason: collision with root package name */
    private static final long f3092u = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: q, reason: collision with root package name */
    private final Context f3093q;

    /* renamed from: r, reason: collision with root package name */
    private final f1.j f3094r;

    /* renamed from: s, reason: collision with root package name */
    private int f3095s = 0;

    /* compiled from: MyApplication */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f3096a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f3096a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, f1.j jVar) {
        this.f3093q = context.getApplicationContext();
        this.f3094r = jVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i7) {
        return PendingIntent.getBroadcast(context, -1, c(context), i7);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d8 = d(context, b.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f3092u;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d8);
        }
    }

    public boolean a() {
        boolean i7 = l.i(this.f3093q, this.f3094r);
        WorkDatabase o7 = this.f3094r.o();
        q B = o7.B();
        n A = o7.A();
        o7.c();
        try {
            List<p> i8 = B.i();
            boolean z7 = (i8 == null || i8.isEmpty()) ? false : true;
            if (z7) {
                for (p pVar : i8) {
                    B.o(s.ENQUEUED, pVar.f24709a);
                    B.b(pVar.f24709a, -1L);
                }
            }
            A.c();
            o7.r();
            o7.g();
            return z7 || i7;
        } catch (Throwable th) {
            o7.g();
            throw th;
        }
    }

    public void b() {
        boolean a8 = a();
        if (h()) {
            j.c().a(f3091t, "Rescheduling Workers.", new Throwable[0]);
            this.f3094r.s();
            this.f3094r.l().c(false);
        } else if (e()) {
            j.c().a(f3091t, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f3094r.s();
        } else if (a8) {
            j.c().a(f3091t, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f3094r.i(), this.f3094r.o(), this.f3094r.n());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        try {
            PendingIntent d8 = d(this.f3093q, b.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d8 != null) {
                    d8.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f3093q.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                        reason = d.a(historicalProcessExitReasons.get(i7)).getReason();
                        if (reason == 10) {
                            return true;
                        }
                    }
                }
            } else if (d8 == null) {
                g(this.f3093q);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e8) {
            e = e8;
            j.c().h(f3091t, "Ignoring exception", e);
            return true;
        } catch (SecurityException e9) {
            e = e9;
            j.c().h(f3091t, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a i7 = this.f3094r.i();
        if (TextUtils.isEmpty(i7.c())) {
            j.c().a(f3091t, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b8 = n1.j.b(this.f3093q, i7);
        j.c().a(f3091t, String.format("Is default app process = %s", Boolean.valueOf(b8)), new Throwable[0]);
        return b8;
    }

    boolean h() {
        return this.f3094r.l().a();
    }

    public void i(long j7) {
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i7;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f3093q);
                    j.c().a(f3091t, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                        i7 = this.f3095s + 1;
                        this.f3095s = i7;
                        if (i7 >= 3) {
                            j.c().b(f3091t, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            this.f3094r.i().d();
                            throw illegalStateException;
                        }
                        j.c().a(f3091t, String.format("Retrying after %s", Long.valueOf(i7 * 300)), e8);
                        i(this.f3095s * 300);
                    }
                    j.c().a(f3091t, String.format("Retrying after %s", Long.valueOf(i7 * 300)), e8);
                    i(this.f3095s * 300);
                }
            }
        } finally {
            this.f3094r.r();
        }
    }
}
