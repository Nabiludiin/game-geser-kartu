package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ld2 extends nd2 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f11568a;

    /* renamed from: b, reason: collision with root package name */
    private final rl1 f11569b;

    /* renamed from: c, reason: collision with root package name */
    private final d91 f11570c;

    /* renamed from: d, reason: collision with root package name */
    private final gg1 f11571d;

    /* renamed from: e, reason: collision with root package name */
    private final yd2 f11572e;

    /* renamed from: f, reason: collision with root package name */
    private final pa2 f11573f;

    public ld2(gu0 gu0Var, rl1 rl1Var, d91 d91Var, gg1 gg1Var, yd2 yd2Var, pa2 pa2Var) {
        this.f11568a = gu0Var;
        this.f11569b = rl1Var;
        this.f11570c = d91Var;
        this.f11571d = gg1Var;
        this.f11572e = yd2Var;
        this.f11573f = pa2Var;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    protected final a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var) {
        d91 d91Var = this.f11570c;
        d91Var.b(w03Var);
        d91Var.c(bundle);
        d91Var.d(new w81(o03Var, c03Var, this.f11572e));
        if (((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue()) {
            d91Var.g(this.f11573f);
        }
        vl1 w7 = this.f11568a.w();
        w7.e(d91Var.e());
        w7.k(this.f11571d);
        w7.r(this.f11569b);
        w7.n(new e21(null));
        w51 a8 = w7.a().a();
        return a8.c(a8.b());
    }
}
