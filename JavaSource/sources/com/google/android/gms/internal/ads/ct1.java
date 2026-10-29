package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ct1 {

    /* renamed from: a, reason: collision with root package name */
    private final u91 f6610a;

    /* renamed from: b, reason: collision with root package name */
    private final eb1 f6611b;

    /* renamed from: c, reason: collision with root package name */
    private final wb1 f6612c;

    /* renamed from: d, reason: collision with root package name */
    private final nc1 f6613d;

    /* renamed from: e, reason: collision with root package name */
    private final jf1 f6614e;

    /* renamed from: f, reason: collision with root package name */
    private final ni1 f6615f;

    /* renamed from: g, reason: collision with root package name */
    private final rx1 f6616g;

    /* renamed from: h, reason: collision with root package name */
    private final x73 f6617h;

    /* renamed from: i, reason: collision with root package name */
    private final v82 f6618i;

    /* renamed from: j, reason: collision with root package name */
    private final d01 f6619j;

    ct1(u91 u91Var, eb1 eb1Var, wb1 wb1Var, nc1 nc1Var, jf1 jf1Var, ni1 ni1Var, rx1 rx1Var, x73 x73Var, v82 v82Var, d01 d01Var) {
        this.f6610a = u91Var;
        this.f6611b = eb1Var;
        this.f6612c = wb1Var;
        this.f6613d = nc1Var;
        this.f6614e = jf1Var;
        this.f6615f = ni1Var;
        this.f6616g = rx1Var;
        this.f6617h = x73Var;
        this.f6618i = v82Var;
        this.f6619j = d01Var;
    }

    public final void a(dt1 dt1Var, mr0 mr0Var) {
        at1 b8 = dt1Var.b();
        final eb1 eb1Var = this.f6611b;
        Objects.requireNonNull(eb1Var);
        b8.b(this.f6610a, this.f6612c, this.f6613d, this.f6614e, new u2.e() { // from class: com.google.android.gms.internal.ads.bt1
            @Override // u2.e
            public final /* synthetic */ void k() {
                eb1.this.U0();
            }
        }, this.f6615f);
        if (!((Boolean) s2.b0.c().d(uy.ib)).booleanValue() || mr0Var == null || mr0Var.s0() == null) {
            return;
        }
        ot0 s02 = mr0Var.s0();
        d01 d01Var = this.f6619j;
        v82 v82Var = this.f6618i;
        s02.i0(d01Var, v82Var, this.f6617h);
        s02.j0(d01Var, v82Var, this.f6616g);
    }
}
