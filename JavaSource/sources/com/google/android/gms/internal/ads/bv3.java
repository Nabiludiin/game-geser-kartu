package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class bv3 extends ew3 {

    /* renamed from: a, reason: collision with root package name */
    private String f6021a;

    /* renamed from: b, reason: collision with root package name */
    private String f6022b;

    bv3() {
    }

    @Override // com.google.android.gms.internal.ads.ew3
    public final ew3 a(String str) {
        this.f6021a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ew3
    public final ew3 b(String str) {
        this.f6022b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ew3
    public final fw3 c() {
        return new cv3(this.f6021a, this.f6022b, null);
    }
}
