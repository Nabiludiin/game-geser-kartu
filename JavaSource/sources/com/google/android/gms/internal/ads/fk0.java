package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class fk0 extends kk0 {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f8293b;

    /* renamed from: c, reason: collision with root package name */
    final w85 f8294c;

    /* renamed from: d, reason: collision with root package name */
    final w85 f8295d;

    /* renamed from: e, reason: collision with root package name */
    final w85 f8296e;

    /* renamed from: f, reason: collision with root package name */
    final w85 f8297f;

    /* renamed from: g, reason: collision with root package name */
    final w85 f8298g;

    /* renamed from: h, reason: collision with root package name */
    final w85 f8299h;

    /* renamed from: i, reason: collision with root package name */
    final w85 f8300i;

    /* renamed from: j, reason: collision with root package name */
    final w85 f8301j;

    fk0(Context context, com.google.android.gms.common.util.e eVar, v2.p1 p1Var, jk0 jk0Var) {
        this.f8293b = eVar;
        n85 a8 = o85.a(context);
        this.f8294c = a8;
        n85 a9 = o85.a(p1Var);
        this.f8295d = a9;
        this.f8296e = m85.a(xj0.a(a8, a9));
        n85 a10 = o85.a(eVar);
        this.f8297f = a10;
        n85 a11 = o85.a(jk0Var);
        this.f8298g = a11;
        w85 a12 = m85.a(zj0.a(a10, a9, a11));
        this.f8299h = a12;
        bk0 c8 = bk0.c(a10, a12);
        this.f8300i = c8;
        this.f8301j = m85.a(qk0.a(a8, c8));
    }

    @Override // com.google.android.gms.internal.ads.kk0
    final ak0 a() {
        return new ak0(this.f8293b, (yj0) this.f8299h.b());
    }
}
