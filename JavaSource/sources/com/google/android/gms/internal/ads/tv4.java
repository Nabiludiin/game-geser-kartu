package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class tv4 implements il4 {

    /* renamed from: a, reason: collision with root package name */
    final il4 f16468a;

    /* renamed from: b, reason: collision with root package name */
    final il4 f16469b;

    /* synthetic */ tv4(il4 il4Var, il4 il4Var2, byte[] bArr) {
        this.f16468a = il4Var;
        this.f16469b = il4Var2;
    }

    @Override // com.google.android.gms.internal.ads.il4
    public final byte[] a(byte[] bArr, int i7) {
        return bArr.length <= 64 ? this.f16468a.a(bArr, i7) : this.f16469b.a(bArr, i7);
    }
}
