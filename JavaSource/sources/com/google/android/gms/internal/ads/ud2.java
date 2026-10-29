package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ud2 extends nd2 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f16718a;

    /* renamed from: b, reason: collision with root package name */
    private final d91 f16719b;

    /* renamed from: c, reason: collision with root package name */
    private final gg1 f16720c;

    /* renamed from: d, reason: collision with root package name */
    private final yd2 f16721d;

    /* renamed from: e, reason: collision with root package name */
    private final p03 f16722e;

    /* renamed from: f, reason: collision with root package name */
    private final pa2 f16723f;

    public ud2(gu0 gu0Var, d91 d91Var, gg1 gg1Var, p03 p03Var, yd2 yd2Var, pa2 pa2Var) {
        this.f16718a = gu0Var;
        this.f16719b = d91Var;
        this.f16720c = gg1Var;
        this.f16722e = p03Var;
        this.f16721d = yd2Var;
        this.f16723f = pa2Var;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    protected final a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var) {
        p03 p03Var;
        d91 d91Var = this.f16719b;
        d91Var.b(w03Var);
        d91Var.c(bundle);
        d91Var.d(new w81(o03Var, c03Var, this.f16721d));
        if (((Boolean) s2.b0.c().d(uy.f17077d4)).booleanValue() && (p03Var = this.f16722e) != null) {
            d91Var.f(p03Var);
        }
        if (((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue()) {
            d91Var.g(this.f16723f);
        }
        rt1 x7 = this.f16718a.x();
        x7.b(d91Var.e());
        x7.c(this.f16720c);
        w51 a8 = x7.a().a();
        return a8.c(a8.b());
    }
}
