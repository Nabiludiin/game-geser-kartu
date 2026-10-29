package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class iw0 implements dz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Long f10232a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10233b;

    /* renamed from: c, reason: collision with root package name */
    private final tv0 f10234c;

    /* renamed from: d, reason: collision with root package name */
    private final kw0 f10235d;

    iw0(tv0 tv0Var, kw0 kw0Var, Long l7, String str) {
        this.f10234c = tv0Var;
        this.f10235d = kw0Var;
        this.f10232a = l7;
        this.f10233b = str;
    }

    @Override // com.google.android.gms.internal.ads.dz1
    public final oz1 a() {
        long longValue = this.f10232a.longValue();
        kw0 kw0Var = this.f10235d;
        return pz1.a(longValue, kw0Var.c(), kw0Var.a(), this.f10234c, this.f10233b);
    }

    @Override // com.google.android.gms.internal.ads.dz1
    public final sz1 b() {
        long longValue = this.f10232a.longValue();
        kw0 kw0Var = this.f10235d;
        return tz1.a(longValue, kw0Var.c(), kw0Var.a(), this.f10234c, this.f10233b);
    }
}
