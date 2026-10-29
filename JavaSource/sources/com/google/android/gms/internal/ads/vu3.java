package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class vu3 extends dv3 {

    /* renamed from: a, reason: collision with root package name */
    private String f17781a;

    /* renamed from: b, reason: collision with root package name */
    private String f17782b;

    vu3() {
    }

    @Override // com.google.android.gms.internal.ads.dv3
    public final dv3 a(String str) {
        this.f17781a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.dv3
    public final dv3 b(String str) {
        this.f17782b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.dv3
    public final ev3 c() {
        return new wu3(this.f17781a, this.f17782b, null);
    }
}
