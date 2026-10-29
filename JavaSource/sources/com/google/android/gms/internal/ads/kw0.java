package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class kw0 implements mz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11274a;

    /* renamed from: b, reason: collision with root package name */
    private final b70 f11275b;

    /* renamed from: c, reason: collision with root package name */
    private final tv0 f11276c;

    /* renamed from: d, reason: collision with root package name */
    private final kw0 f11277d = this;

    /* renamed from: e, reason: collision with root package name */
    final w85 f11278e;

    /* renamed from: f, reason: collision with root package name */
    final w85 f11279f;

    /* renamed from: g, reason: collision with root package name */
    final w85 f11280g;

    /* renamed from: h, reason: collision with root package name */
    final w85 f11281h;

    kw0(tv0 tv0Var, Context context, b70 b70Var) {
        this.f11276c = tv0Var;
        this.f11274a = context;
        this.f11275b = b70Var;
        n85 a8 = o85.a(this);
        this.f11278e = a8;
        n85 a9 = o85.a(b70Var);
        this.f11279f = a9;
        gz1 c8 = gz1.c(a9);
        this.f11280g = c8;
        this.f11281h = m85.a(iz1.a(a8, c8));
    }

    final fz1 a() {
        return gz1.d(this.f11275b);
    }

    @Override // com.google.android.gms.internal.ads.mz1
    public final hz1 b() {
        return (hz1) this.f11281h.b();
    }

    final /* synthetic */ Context c() {
        return this.f11274a;
    }

    @Override // com.google.android.gms.internal.ads.mz1
    public final cz1 d() {
        return new hw0(this.f11276c, this.f11277d, null);
    }
}
