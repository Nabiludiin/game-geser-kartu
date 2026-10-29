package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import e1.j;
import java.util.Collections;
import java.util.List;
import m1.p;
import n1.n;
import n1.r;

/* compiled from: MyApplication */
public class d implements i1.c, f1.b, r.b {

    /* renamed from: z, reason: collision with root package name */
    private static final String f3034z = j.f("DelayMetCommandHandler");

    /* renamed from: q, reason: collision with root package name */
    private final Context f3035q;

    /* renamed from: r, reason: collision with root package name */
    private final int f3036r;

    /* renamed from: s, reason: collision with root package name */
    private final String f3037s;

    /* renamed from: t, reason: collision with root package name */
    private final e f3038t;

    /* renamed from: u, reason: collision with root package name */
    private final i1.d f3039u;

    /* renamed from: x, reason: collision with root package name */
    private PowerManager.WakeLock f3042x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3043y = false;

    /* renamed from: w, reason: collision with root package name */
    private int f3041w = 0;

    /* renamed from: v, reason: collision with root package name */
    private final Object f3040v = new Object();

    d(Context context, int i7, String str, e eVar) {
        this.f3035q = context;
        this.f3036r = i7;
        this.f3038t = eVar;
        this.f3037s = str;
        this.f3039u = new i1.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f3040v) {
            try {
                this.f3039u.e();
                this.f3038t.h().c(this.f3037s);
                PowerManager.WakeLock wakeLock = this.f3042x;
                if (wakeLock != null && wakeLock.isHeld()) {
                    j.c().a(f3034z, String.format("Releasing wakelock %s for WorkSpec %s", this.f3042x, this.f3037s), new Throwable[0]);
                    this.f3042x.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g() {
        synchronized (this.f3040v) {
            try {
                if (this.f3041w < 2) {
                    this.f3041w = 2;
                    j c8 = j.c();
                    String str = f3034z;
                    c8.a(str, String.format("Stopping work for WorkSpec %s", this.f3037s), new Throwable[0]);
                    Intent f8 = b.f(this.f3035q, this.f3037s);
                    e eVar = this.f3038t;
                    eVar.k(new e.b(eVar, f8, this.f3036r));
                    if (this.f3038t.e().g(this.f3037s)) {
                        j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f3037s), new Throwable[0]);
                        Intent e8 = b.e(this.f3035q, this.f3037s);
                        e eVar2 = this.f3038t;
                        eVar2.k(new e.b(eVar2, e8, this.f3036r));
                    } else {
                        j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f3037s), new Throwable[0]);
                    }
                } else {
                    j.c().a(f3034z, String.format("Already stopped work for %s", this.f3037s), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n1.r.b
    public void a(String str) {
        j.c().a(f3034z, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // i1.c
    public void b(List list) {
        g();
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        j.c().a(f3034z, String.format("onExecuted %s, %s", str, Boolean.valueOf(z7)), new Throwable[0]);
        d();
        if (z7) {
            Intent e8 = b.e(this.f3035q, this.f3037s);
            e eVar = this.f3038t;
            eVar.k(new e.b(eVar, e8, this.f3036r));
        }
        if (this.f3043y) {
            Intent a8 = b.a(this.f3035q);
            e eVar2 = this.f3038t;
            eVar2.k(new e.b(eVar2, a8, this.f3036r));
        }
    }

    void e() {
        this.f3042x = n.b(this.f3035q, String.format("%s (%s)", this.f3037s, Integer.valueOf(this.f3036r)));
        j c8 = j.c();
        String str = f3034z;
        c8.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f3042x, this.f3037s), new Throwable[0]);
        this.f3042x.acquire();
        p m7 = this.f3038t.g().o().B().m(this.f3037s);
        if (m7 == null) {
            g();
            return;
        }
        boolean b8 = m7.b();
        this.f3043y = b8;
        if (b8) {
            this.f3039u.d(Collections.singletonList(m7));
        } else {
            j.c().a(str, String.format("No constraints for %s", this.f3037s), new Throwable[0]);
            f(Collections.singletonList(this.f3037s));
        }
    }

    @Override // i1.c
    public void f(List list) {
        if (list.contains(this.f3037s)) {
            synchronized (this.f3040v) {
                try {
                    if (this.f3041w == 0) {
                        this.f3041w = 1;
                        j.c().a(f3034z, String.format("onAllConstraintsMet for %s", this.f3037s), new Throwable[0]);
                        if (this.f3038t.e().j(this.f3037s)) {
                            this.f3038t.h().b(this.f3037s, 600000L, this);
                        } else {
                            d();
                        }
                    } else {
                        j.c().a(f3034z, String.format("Already started work for %s", this.f3037s), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
