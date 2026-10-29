package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: MyApplication */
public final class tj5 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16227a;

    /* renamed from: b, reason: collision with root package name */
    private final vj5 f16228b;

    public tj5(Handler handler, vj5 vj5Var) {
        this.f16227a = vj5Var == null ? null : handler;
        this.f16228b = vj5Var;
    }

    public final void a(final hv4 hv4Var) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.n(hv4Var);
                }
            });
        }
    }

    public final void b(final String str, final long j7, final long j8) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.o(str, j7, j8);
                }
            });
        }
    }

    public final void c(final eq5 eq5Var, final iw4 iw4Var) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.p(eq5Var, iw4Var);
                }
            });
        }
    }

    public final void d(final long j7) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.q(j7);
                }
            });
        }
    }

    public final void e(final int i7, final long j7, final long j8) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.lj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.r(i7, j7, j8);
                }
            });
        }
    }

    public final void f(final String str) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.s(str);
                }
            });
        }
    }

    public final void g(final hv4 hv4Var) {
        hv4Var.a();
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.t(hv4Var);
                }
            });
        }
    }

    public final void h(final boolean z7) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.oj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.u(z7);
                }
            });
        }
    }

    public final void i(final Exception exc) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.v(exc);
                }
            });
        }
    }

    public final void j(final Exception exc) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.w(exc);
                }
            });
        }
    }

    public final void k(final wj5 wj5Var) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.x(wj5Var);
                }
            });
        }
    }

    public final void l(final wj5 wj5Var) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hj5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.y(wj5Var);
                }
            });
        }
    }

    public final void m(final int i7) {
        Handler handler = this.f16227a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ij5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    tj5.this.z(i7);
                }
            });
        }
    }

    final /* synthetic */ void n(hv4 hv4Var) {
        String str = hi2.f9535a;
        this.f16228b.V0(hv4Var);
    }

    final /* synthetic */ void o(String str, long j7, long j8) {
        String str2 = hi2.f9535a;
        this.f16228b.L0(str, j7, j8);
    }

    final /* synthetic */ void p(eq5 eq5Var, iw4 iw4Var) {
        String str = hi2.f9535a;
        this.f16228b.N0(eq5Var, iw4Var);
    }

    final /* synthetic */ void q(long j7) {
        String str = hi2.f9535a;
        this.f16228b.M0(j7);
    }

    final /* synthetic */ void r(int i7, long j7, long j8) {
        String str = hi2.f9535a;
        this.f16228b.W0(i7, j7, j8);
    }

    final /* synthetic */ void s(String str) {
        String str2 = hi2.f9535a;
        this.f16228b.K0(str);
    }

    final /* synthetic */ void t(hv4 hv4Var) {
        hv4Var.a();
        String str = hi2.f9535a;
        this.f16228b.S0(hv4Var);
    }

    final /* synthetic */ void u(boolean z7) {
        String str = hi2.f9535a;
        this.f16228b.R0(z7);
    }

    final /* synthetic */ void v(Exception exc) {
        String str = hi2.f9535a;
        this.f16228b.Q0(exc);
    }

    final /* synthetic */ void w(Exception exc) {
        String str = hi2.f9535a;
        this.f16228b.O0(exc);
    }

    final /* synthetic */ void x(wj5 wj5Var) {
        String str = hi2.f9535a;
        this.f16228b.T0(wj5Var);
    }

    final /* synthetic */ void y(wj5 wj5Var) {
        String str = hi2.f9535a;
        this.f16228b.U0(wj5Var);
    }

    final /* synthetic */ void z(int i7) {
        String str = hi2.f9535a;
        this.f16228b.P0(i7);
    }
}
