package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class od2 extends nd2 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f13298a;

    /* renamed from: b, reason: collision with root package name */
    private final d91 f13299b;

    /* renamed from: c, reason: collision with root package name */
    private final gg1 f13300c;

    /* renamed from: d, reason: collision with root package name */
    private final yd2 f13301d;

    /* renamed from: e, reason: collision with root package name */
    private final pa2 f13302e;

    od2(gu0 gu0Var, d91 d91Var, gg1 gg1Var, yd2 yd2Var, pa2 pa2Var) {
        this.f13298a = gu0Var;
        this.f13299b = d91Var;
        this.f13300c = gg1Var;
        this.f13301d = yd2Var;
        this.f13302e = pa2Var;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    protected final a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var) {
        d91 d91Var = this.f13299b;
        d91Var.b(w03Var);
        d91Var.c(bundle);
        d91Var.d(new w81(o03Var, c03Var, this.f13301d));
        if (((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue()) {
            d91Var.g(this.f13302e);
        }
        t11 s7 = this.f13298a.s();
        s7.b(d91Var.e());
        s7.c(this.f13300c);
        w51 a8 = s7.a().a();
        return a8.c(a8.b());
    }
}
