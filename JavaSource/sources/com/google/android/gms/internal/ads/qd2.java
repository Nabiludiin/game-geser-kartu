package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: MyApplication */
public final class qd2 extends nd2 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f14388a;

    /* renamed from: b, reason: collision with root package name */
    private final d91 f14389b;

    /* renamed from: c, reason: collision with root package name */
    private final gg2 f14390c;

    /* renamed from: d, reason: collision with root package name */
    private final gg1 f14391d;

    /* renamed from: e, reason: collision with root package name */
    private final rl1 f14392e;

    /* renamed from: f, reason: collision with root package name */
    private final ed1 f14393f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f14394g;

    /* renamed from: h, reason: collision with root package name */
    private final lf1 f14395h;

    /* renamed from: i, reason: collision with root package name */
    private final yd2 f14396i;

    /* renamed from: j, reason: collision with root package name */
    private final pa2 f14397j;

    public qd2(gu0 gu0Var, d91 d91Var, gg2 gg2Var, gg1 gg1Var, rl1 rl1Var, ed1 ed1Var, ViewGroup viewGroup, lf1 lf1Var, yd2 yd2Var, pa2 pa2Var) {
        this.f14388a = gu0Var;
        this.f14389b = d91Var;
        this.f14390c = gg2Var;
        this.f14391d = gg1Var;
        this.f14392e = rl1Var;
        this.f14393f = ed1Var;
        this.f14394g = viewGroup;
        this.f14395h = lf1Var;
        this.f14396i = yd2Var;
        this.f14397j = pa2Var;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    protected final a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var) {
        d91 d91Var = this.f14389b;
        d91Var.b(w03Var);
        d91Var.c(bundle);
        d91Var.d(new w81(o03Var, c03Var, this.f14396i));
        if (((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue()) {
            d91Var.g(this.f14397j);
        }
        m31 q7 = this.f14388a.q();
        q7.i(d91Var.e());
        q7.p(this.f14391d);
        q7.d(this.f14390c);
        q7.q(this.f14392e);
        q7.l(new j41(this.f14393f, this.f14395h));
        q7.j(new e21(this.f14394g));
        w51 b8 = q7.a().b();
        return b8.c(b8.b());
    }
}
