package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class yv2 implements z91, bc1, px2, u2.c0, uc1, na1, pi1 {

    /* renamed from: q, reason: collision with root package name */
    private final i23 f19817q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f19818r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f19819s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f19820t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f19821u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f19822v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f19823w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private yv2 f19824x = null;

    public yv2(i23 i23Var) {
        this.f19817q = i23Var;
    }

    public static yv2 a(yv2 yv2Var) {
        yv2 yv2Var2 = new yv2(yv2Var.f19817q);
        yv2Var2.f19824x = yv2Var;
        return yv2Var2;
    }

    @Override // u2.c0
    public final void H2() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.H2();
        } else {
            hx2.a(this.f19822v, kv2.f11272a);
        }
    }

    @Override // u2.c0
    public final void V5(final int i7) {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.V5(i7);
        } else {
            hx2.a(this.f19822v, new gx2() { // from class: com.google.android.gms.internal.ads.qv2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((u2.c0) obj).V5(i7);
                }
            });
        }
    }

    public final void b(et etVar) {
        this.f19818r.set(etVar);
    }

    public final void c(ht htVar) {
        this.f19820t.set(htVar);
    }

    public final void d(u2.c0 c0Var) {
        this.f19822v.set(c0Var);
    }

    public final void e(s2.q2 q2Var) {
        this.f19823w.set(q2Var);
    }

    public final void f(final bt btVar) {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.f(btVar);
        } else {
            hx2.a(this.f19818r, new gx2() { // from class: com.google.android.gms.internal.ads.nv2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((et) obj).B6(bt.this);
                }
            });
        }
    }

    @Override // u2.c0
    public final void g() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.g();
            return;
        }
        hx2.a(this.f19822v, mv2.f12450a);
        AtomicReference atomicReference = this.f19820t;
        hx2.a(atomicReference, uv2.f17010a);
        hx2.a(atomicReference, vv2.f17860a);
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void h(final s2.i5 i5Var) {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.h(i5Var);
        } else {
            hx2.a(this.f19823w, new gx2() { // from class: com.google.android.gms.internal.ads.sv2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((s2.q2) obj).f8(s2.i5.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.px2
    public final void j(px2 px2Var) {
        this.f19824x = (yv2) px2Var;
    }

    @Override // com.google.android.gms.internal.ads.bc1
    public final void k() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.k();
        } else {
            hx2.a(this.f19821u, jv2.f10790a);
        }
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(final s2.x2 x2Var) {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.o(x2Var);
            return;
        }
        AtomicReference atomicReference = this.f19818r;
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.ov2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((et) obj).u0(s2.x2.this);
            }
        });
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.pv2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((et) obj).R(s2.x2.this.f26259q);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final void q(final s2.x2 x2Var) {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.q(x2Var);
        } else {
            hx2.a(this.f19820t, new gx2() { // from class: com.google.android.gms.internal.ads.rv2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((ht) obj).T0(s2.x2.this);
                }
            });
        }
    }

    public final void r() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.r();
            return;
        }
        this.f19817q.b();
        hx2.a(this.f19819s, tv2.f16466a);
        hx2.a(this.f19820t, xv2.f19188a);
    }

    @Override // u2.c0
    public final void t7() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.t7();
        } else {
            hx2.a(this.f19822v, lv2.f11832a);
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        yv2 yv2Var = this.f19824x;
        if (yv2Var != null) {
            yv2Var.z();
        } else {
            hx2.a(this.f19820t, wv2.f18443a);
        }
    }

    @Override // u2.c0
    public final void C7() {
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
    }

    @Override // u2.c0
    public final void M5() {
    }

    @Override // u2.c0
    public final void P4() {
    }

    @Override // u2.c0
    public final void T5() {
    }

    @Override // u2.c0
    public final void Z4() {
    }

    @Override // u2.c0
    public final void a4() {
    }

    @Override // u2.c0
    public final void v3() {
    }
}
