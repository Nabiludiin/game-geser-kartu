package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: MyApplication */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f19322a;

    /* renamed from: b, reason: collision with root package name */
    private final z0 f19323b;

    public y0(Handler handler, z0 z0Var) {
        if (z0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f19322a = handler;
        this.f19323b = z0Var;
    }

    public final void a(final hv4 hv4Var) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.k(hv4Var);
                }
            });
        }
    }

    public final void b(final String str, final long j7, final long j8) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.o0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.l(str, j7, j8);
                }
            });
        }
    }

    public final void c(final eq5 eq5Var, final iw4 iw4Var) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.p0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.m(eq5Var, iw4Var);
                }
            });
        }
    }

    public final void d(final int i7, final long j7) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.q0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.n(i7, j7);
                }
            });
        }
    }

    public final void e(final long j7, final int i7) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.r0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.o(j7, i7);
                }
            });
        }
    }

    public final void f(final te0 te0Var) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.s0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.p(te0Var);
                }
            });
        }
    }

    public final void g(final Object obj) {
        Handler handler = this.f19322a;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.q(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void h(final String str) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.u0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.r(str);
                }
            });
        }
    }

    public final void i(final hv4 hv4Var) {
        hv4Var.a();
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.s(hv4Var);
                }
            });
        }
    }

    public final void j(final Exception exc) {
        Handler handler = this.f19322a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y0.this.t(exc);
                }
            });
        }
    }

    final /* synthetic */ void k(hv4 hv4Var) {
        String str = hi2.f9535a;
        this.f19323b.e0(hv4Var);
    }

    final /* synthetic */ void l(String str, long j7, long j8) {
        String str2 = hi2.f9535a;
        this.f19323b.h0(str, j7, j8);
    }

    final /* synthetic */ void m(eq5 eq5Var, iw4 iw4Var) {
        String str = hi2.f9535a;
        this.f19323b.j0(eq5Var, iw4Var);
    }

    final /* synthetic */ void n(int i7, long j7) {
        String str = hi2.f9535a;
        this.f19323b.b0(i7, j7);
    }

    final /* synthetic */ void o(long j7, int i7) {
        String str = hi2.f9535a;
        this.f19323b.c0(j7, i7);
    }

    final /* synthetic */ void p(te0 te0Var) {
        String str = hi2.f9535a;
        this.f19323b.f0(te0Var);
    }

    final /* synthetic */ void q(Object obj, long j7) {
        String str = hi2.f9535a;
        this.f19323b.i0(obj, j7);
    }

    final /* synthetic */ void r(String str) {
        String str2 = hi2.f9535a;
        this.f19323b.a0(str);
    }

    final /* synthetic */ void s(hv4 hv4Var) {
        hv4Var.a();
        String str = hi2.f9535a;
        this.f19323b.d0(hv4Var);
    }

    final /* synthetic */ void t(Exception exc) {
        String str = hi2.f9535a;
        this.f19323b.g0(exc);
    }
}
