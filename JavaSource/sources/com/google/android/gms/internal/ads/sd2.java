package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class sd2 extends nd2 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f15563a;

    /* renamed from: b, reason: collision with root package name */
    private final d91 f15564b;

    /* renamed from: c, reason: collision with root package name */
    private final gg2 f15565c;

    /* renamed from: d, reason: collision with root package name */
    private final gg1 f15566d;

    /* renamed from: e, reason: collision with root package name */
    private final yd2 f15567e;

    /* renamed from: f, reason: collision with root package name */
    private final pa2 f15568f;

    public sd2(gu0 gu0Var, d91 d91Var, gg2 gg2Var, gg1 gg1Var, yd2 yd2Var, pa2 pa2Var) {
        this.f15563a = gu0Var;
        this.f15564b = d91Var;
        this.f15565c = gg2Var;
        this.f15566d = gg1Var;
        this.f15567e = yd2Var;
        this.f15568f = pa2Var;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    protected final a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var) {
        d91 d91Var = this.f15564b;
        d91Var.b(w03Var);
        d91Var.c(bundle);
        d91Var.d(new w81(o03Var, c03Var, this.f15567e));
        if (((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue()) {
            d91Var.g(this.f15568f);
        }
        zk1 u7 = this.f15563a.u();
        u7.f(d91Var.e());
        u7.m(this.f15566d);
        u7.t(this.f15565c);
        w51 b8 = u7.a().b();
        return b8.c(b8.b());
    }
}
