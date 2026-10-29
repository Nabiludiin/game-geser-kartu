package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ky4 extends oy4 {

    /* renamed from: t, reason: collision with root package name */
    private final int f11296t;

    /* renamed from: u, reason: collision with root package name */
    private final int f11297u;

    ky4(byte[] bArr, int i7, int i8) {
        super(bArr);
        qy4.c(i7, i7 + i8, bArr.length);
        this.f11296t = i7;
        this.f11297u = i8;
    }

    @Override // com.google.android.gms.internal.ads.oy4
    protected final int C() {
        return this.f11296t;
    }

    @Override // com.google.android.gms.internal.ads.oy4, com.google.android.gms.internal.ads.qy4
    public final byte e(int i7) {
        qy4.z(i7, this.f11297u);
        return this.f13555s[this.f11296t + i7];
    }

    @Override // com.google.android.gms.internal.ads.oy4, com.google.android.gms.internal.ads.qy4
    final byte g(int i7) {
        return this.f13555s[this.f11296t + i7];
    }

    @Override // com.google.android.gms.internal.ads.oy4, com.google.android.gms.internal.ads.qy4
    public final int h() {
        return this.f11297u;
    }

    @Override // com.google.android.gms.internal.ads.oy4, com.google.android.gms.internal.ads.qy4
    protected final void j(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f13555s, this.f11296t + i7, bArr, i8, i9);
    }
}
