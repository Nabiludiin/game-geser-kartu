package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class fz2 implements f3.a, qb1, z91, w91, na1, uc1, px2, pi1 {

    /* renamed from: q, reason: collision with root package name */
    private final i23 f8547q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f8548r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f8549s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f8550t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f8551u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f8552v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f8553w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f8554x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private fz2 f8555y = null;

    public fz2(i23 i23Var) {
        this.f8547q = i23Var;
    }

    public final void B(rh0 rh0Var) {
        this.f8553w.set(rh0Var);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.a();
        } else {
            hx2.a(this.f8551u, az2.f5408a);
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.b();
            return;
        }
        AtomicReference atomicReference = this.f8550t;
        hx2.a(atomicReference, wy2.f18473a);
        hx2.a(this.f8551u, yy2.f19917a);
        hx2.a(atomicReference, ty2.f16490a);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.c();
        } else {
            hx2.a(this.f8551u, bz2.f6134a);
        }
    }

    @Override // f3.a
    public final void d() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.d();
        } else {
            hx2.a(this.f8548r, ez2.f7891a);
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.e();
        } else {
            hx2.a(this.f8551u, cz2.f6863a);
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.f();
        } else {
            hx2.a(this.f8549s, xy2.f19304a);
            hx2.a(this.f8551u, dz2.f7360a);
        }
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void h(final s2.i5 i5Var) {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.h(i5Var);
        } else {
            hx2.a(this.f8554x, new gx2() { // from class: com.google.android.gms.internal.ads.ry2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((s2.q2) obj).f8(s2.i5.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.px2
    public final void j(px2 px2Var) {
        this.f8555y = (fz2) px2Var;
    }

    public final void k(ri0 ri0Var) {
        this.f8549s.set(ri0Var);
    }

    public final void n(ni0 ni0Var) {
        this.f8550t.set(ni0Var);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(final s2.x2 x2Var) {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.o(x2Var);
            return;
        }
        final int i7 = x2Var.f26259q;
        AtomicReference atomicReference = this.f8549s;
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.sy2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((ri0) obj).A(s2.x2.this);
            }
        });
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.jy2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((ri0) obj).B(i7);
            }
        });
        hx2.a(this.f8551u, new gx2() { // from class: com.google.android.gms.internal.ads.ky2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((xh0) obj).P(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final void q(final s2.x2 x2Var) {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.q(x2Var);
            return;
        }
        AtomicReference atomicReference = this.f8550t;
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.py2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((ni0) obj).q3(s2.x2.this);
            }
        });
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.qy2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((ni0) obj).F(s2.x2.this.f26259q);
            }
        });
    }

    public final void s(f3.a aVar) {
        this.f8548r.set(aVar);
    }

    public final void t(s2.q2 q2Var) {
        this.f8554x.set(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(final qh0 qh0Var, final String str, final String str2) {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.u(qh0Var, str, str2);
            return;
        }
        hx2.a(this.f8550t, new gx2() { // from class: com.google.android.gms.internal.ads.ly2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                qh0 qh0Var2 = qh0.this;
                ((ni0) obj).V3(new hj0(qh0Var2.b(), qh0Var2.d()));
            }
        });
        hx2.a(this.f8552v, new gx2() { // from class: com.google.android.gms.internal.ads.my2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                qh0 qh0Var2 = qh0.this;
                ((si0) obj).D2(new hj0(qh0Var2.b(), qh0Var2.d()), str, str2);
            }
        });
        hx2.a(this.f8551u, new gx2() { // from class: com.google.android.gms.internal.ads.ny2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((xh0) obj).Q5(qh0.this);
            }
        });
        hx2.a(this.f8553w, new gx2() { // from class: com.google.android.gms.internal.ads.oy2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((rh0) obj).D2(qh0.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.v();
            return;
        }
        this.f8547q.b();
        hx2.a(this.f8550t, uy2.f17264a);
        hx2.a(this.f8551u, zy2.f20525a);
    }

    public final void x(xh0 xh0Var) {
        this.f8551u.set(xh0Var);
    }

    public final void y(si0 si0Var) {
        this.f8552v.set(si0Var);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        fz2 fz2Var = this.f8555y;
        if (fz2Var != null) {
            fz2Var.z();
        } else {
            hx2.a(this.f8550t, vy2.f17920a);
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
    }
}
