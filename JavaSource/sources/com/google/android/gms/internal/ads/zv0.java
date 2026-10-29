package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class zv0 implements bv2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f20360a;

    /* renamed from: b, reason: collision with root package name */
    final w85 f20361b;

    /* renamed from: c, reason: collision with root package name */
    final w85 f20362c;

    /* renamed from: d, reason: collision with root package name */
    final w85 f20363d;

    /* renamed from: e, reason: collision with root package name */
    final w85 f20364e;

    /* renamed from: f, reason: collision with root package name */
    final w85 f20365f;

    /* renamed from: g, reason: collision with root package name */
    final w85 f20366g;

    zv0(tv0 tv0Var, Context context, String str) {
        this.f20360a = tv0Var;
        n85 a8 = o85.a(context);
        this.f20361b = a8;
        n85 a9 = o85.a(str);
        this.f20362c = a9;
        w85 w85Var = tv0Var.f16452v1;
        ux2 c8 = ux2.c(a8, w85Var, tv0Var.f16455w1);
        this.f20363d = c8;
        w85 a10 = m85.a(zv2.a(w85Var));
        this.f20364e = a10;
        w85 w85Var2 = tv0Var.f16396d;
        w85 w85Var3 = tv0Var.Y;
        y03 a11 = y03.a();
        w85 w85Var4 = tv0Var.f16420l;
        w85 a12 = m85.a(bw2.a(a8, w85Var2, w85Var3, c8, a10, a11, w85Var4));
        this.f20365f = a12;
        this.f20366g = m85.a(iw2.a(w85Var3, a8, a9, a12, a10, w85Var4, tv0Var.f16429o));
    }

    @Override // com.google.android.gms.internal.ads.bv2
    public final hw2 a() {
        return (hw2) this.f20366g.b();
    }
}
