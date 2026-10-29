package f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import e1.j;
import e1.m;
import e1.p;
import e1.t;
import h1.l;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: MyApplication */
public class j extends t {

    /* renamed from: j, reason: collision with root package name */
    private static final String f23603j = e1.j.f("WorkManagerImpl");

    /* renamed from: k, reason: collision with root package name */
    private static j f23604k = null;

    /* renamed from: l, reason: collision with root package name */
    private static j f23605l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f23606m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f23607a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.a f23608b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f23609c;

    /* renamed from: d, reason: collision with root package name */
    private o1.a f23610d;

    /* renamed from: e, reason: collision with root package name */
    private List f23611e;

    /* renamed from: f, reason: collision with root package name */
    private d f23612f;

    /* renamed from: g, reason: collision with root package name */
    private n1.h f23613g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23614h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f23615i;

    public j(Context context, androidx.work.a aVar, o1.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.f23183a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (f1.j.f23605l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        f1.j.f23605l = new f1.j(r4, r5, new o1.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        f1.j.f23604k = f1.j.f23605l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = f1.j.f23606m
            monitor-enter(r0)
            f1.j r1 = f1.j.f23604k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            f1.j r2 = f1.j.f23605l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            f1.j r1 = f1.j.f23605l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            f1.j r1 = new f1.j     // Catch: java.lang.Throwable -> L14
            o1.b r2 = new o1.b     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            f1.j.f23605l = r1     // Catch: java.lang.Throwable -> L14
        L30:
            f1.j r4 = f1.j.f23605l     // Catch: java.lang.Throwable -> L14
            f1.j.f23604k = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.j.e(android.content.Context, androidx.work.a):void");
    }

    public static j j() {
        synchronized (f23606m) {
            try {
                j jVar = f23604k;
                if (jVar != null) {
                    return jVar;
                }
                return f23605l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static j k(Context context) {
        j j7;
        synchronized (f23606m) {
            try {
                j7 = j();
                if (j7 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    private void q(Context context, androidx.work.a aVar, o1.a aVar2, WorkDatabase workDatabase, List list, d dVar) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        this.f23607a = applicationContext;
        this.f23608b = aVar;
        this.f23610d = aVar2;
        this.f23609c = workDatabase;
        this.f23611e = list;
        this.f23612f = dVar;
        this.f23613g = new n1.h(workDatabase);
        this.f23614h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        this.f23610d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // e1.t
    public m a(String str) {
        n1.a d8 = n1.a.d(str, this);
        this.f23610d.b(d8);
        return d8.e();
    }

    @Override // e1.t
    public m c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public m f(UUID uuid) {
        n1.a b8 = n1.a.b(uuid, this);
        this.f23610d.b(b8);
        return b8.e();
    }

    public List g(Context context, androidx.work.a aVar, o1.a aVar2) {
        return Arrays.asList(f.a(context, this), new g1.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f23607a;
    }

    public androidx.work.a i() {
        return this.f23608b;
    }

    public n1.h l() {
        return this.f23613g;
    }

    public d m() {
        return this.f23612f;
    }

    public List n() {
        return this.f23611e;
    }

    public WorkDatabase o() {
        return this.f23609c;
    }

    public o1.a p() {
        return this.f23610d;
    }

    public void r() {
        synchronized (f23606m) {
            try {
                this.f23614h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f23615i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f23615i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        l.b(h());
        o().B().u();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f23606m) {
            try {
                this.f23615i = pendingResult;
                if (this.f23614h) {
                    pendingResult.finish();
                    this.f23615i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f23610d.b(new n1.l(this, str, aVar));
    }

    public void w(String str) {
        this.f23610d.b(new n1.m(this, str, true));
    }

    public void x(String str) {
        this.f23610d.b(new n1.m(this, str, false));
    }

    public j(Context context, androidx.work.a aVar, o1.a aVar2, boolean z7) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.c(), z7));
    }

    public j(Context context, androidx.work.a aVar, o1.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        e1.j.e(new j.a(aVar.j()));
        List g8 = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g8, new d(context, aVar, aVar2, workDatabase, g8));
    }
}
