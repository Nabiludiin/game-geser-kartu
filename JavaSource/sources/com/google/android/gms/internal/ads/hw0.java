package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class hw0 implements cz1 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f9731a;

    /* renamed from: b, reason: collision with root package name */
    private final kw0 f9732b;

    /* renamed from: c, reason: collision with root package name */
    private Long f9733c;

    /* renamed from: d, reason: collision with root package name */
    private String f9734d;

    /* synthetic */ hw0(tv0 tv0Var, kw0 kw0Var, byte[] bArr) {
        this.f9731a = tv0Var;
        this.f9732b = kw0Var;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final dz1 a() {
        v85.c(this.f9733c, Long.class);
        v85.c(this.f9734d, String.class);
        return new iw0(this.f9731a, this.f9732b, this.f9733c, this.f9734d);
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final /* bridge */ /* synthetic */ cz1 c(long j7) {
        this.f9733c = Long.valueOf(j7);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final /* bridge */ /* synthetic */ cz1 v(String str) {
        str.getClass();
        this.f9734d = str;
        return this;
    }
}
