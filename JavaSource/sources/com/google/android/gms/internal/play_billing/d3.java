package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class d3 extends g3 {

    /* renamed from: t, reason: collision with root package name */
    private final int f21513t;

    d3(byte[] bArr, int i7, int i8) {
        super(bArr);
        i3.k(0, i8, bArr.length);
        this.f21513t = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.g3, com.google.android.gms.internal.play_billing.i3
    public final byte c(int i7) {
        int i8 = this.f21513t;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f21534s[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.gms.internal.play_billing.g3, com.google.android.gms.internal.play_billing.i3
    final byte e(int i7) {
        return this.f21534s[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.g3, com.google.android.gms.internal.play_billing.i3
    public final int g() {
        return this.f21513t;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    protected final int n() {
        return 0;
    }
}
