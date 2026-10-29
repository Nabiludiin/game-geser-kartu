package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class pw0 implements iy2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f14126a;

    /* renamed from: b, reason: collision with root package name */
    final w85 f14127b;

    /* renamed from: c, reason: collision with root package name */
    final w85 f14128c;

    /* renamed from: d, reason: collision with root package name */
    final w85 f14129d;

    /* renamed from: e, reason: collision with root package name */
    final w85 f14130e;

    /* renamed from: f, reason: collision with root package name */
    final w85 f14131f;

    /* renamed from: g, reason: collision with root package name */
    final w85 f14132g;

    /* renamed from: h, reason: collision with root package name */
    final w85 f14133h;

    pw0(tv0 tv0Var, Context context, String str, s2.g5 g5Var) {
        this.f14126a = tv0Var;
        n85 a8 = o85.a(context);
        this.f14127b = a8;
        n85 a9 = o85.a(g5Var);
        this.f14128c = a9;
        n85 a10 = o85.a(str);
        this.f14129d = a10;
        w85 w85Var = tv0Var.f16429o;
        w85 a11 = m85.a(bi2.a(w85Var));
        this.f14130e = a11;
        w85 a12 = m85.a(gz2.a(tv0Var.f16452v1));
        this.f14131f = a12;
        w85 a13 = m85.a(fy2.a(a8, tv0Var.f16396d, tv0Var.Y, a11, a12, y03.a()));
        this.f14132g = a13;
        this.f14133h = m85.a(ki2.a(a8, a9, a10, a13, a11, a12, tv0Var.f16420l, tv0Var.f16391b0, w85Var));
    }

    @Override // com.google.android.gms.internal.ads.iy2
    public final ji2 a() {
        return (ji2) this.f14133h.b();
    }
}
