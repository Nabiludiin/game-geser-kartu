package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class ew0 implements qw2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7843a;

    /* renamed from: b, reason: collision with root package name */
    private final s2.g5 f7844b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7845c;

    /* renamed from: d, reason: collision with root package name */
    private final tv0 f7846d;

    /* renamed from: e, reason: collision with root package name */
    final w85 f7847e;

    /* renamed from: f, reason: collision with root package name */
    final w85 f7848f;

    /* renamed from: g, reason: collision with root package name */
    final w85 f7849g;

    /* renamed from: h, reason: collision with root package name */
    final w85 f7850h;

    /* renamed from: i, reason: collision with root package name */
    final w85 f7851i;

    /* renamed from: j, reason: collision with root package name */
    final w85 f7852j;

    ew0(tv0 tv0Var, Context context, String str, s2.g5 g5Var) {
        this.f7846d = tv0Var;
        this.f7843a = context;
        this.f7844b = g5Var;
        this.f7845c = str;
        n85 a8 = o85.a(context);
        this.f7847e = a8;
        n85 a9 = o85.a(g5Var);
        this.f7848f = a9;
        w85 a10 = m85.a(bi2.a(tv0Var.f16429o));
        this.f7849g = a10;
        w85 a11 = m85.a(gi2.a());
        this.f7850h = a11;
        w85 a12 = m85.a(nf1.a());
        this.f7851i = a12;
        this.f7852j = m85.a(ow2.a(a8, tv0Var.f16396d, a9, tv0Var.Y, a10, a11, y03.a(), a12));
    }

    @Override // com.google.android.gms.internal.ads.qw2
    public final eh2 a() {
        nw2 nw2Var = (nw2) this.f7852j.b();
        ai2 ai2Var = (ai2) this.f7849g.b();
        tv0 tv0Var = this.f7846d;
        w85 w85Var = tv0Var.f16429o;
        return new eh2(this.f7843a, this.f7844b, this.f7845c, nw2Var, ai2Var, ev0.d(tv0Var.J()), (rx1) w85Var.b());
    }
}
