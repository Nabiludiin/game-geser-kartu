package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class re4 extends ne4 {
    public re4(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.ne4
    final int[] a(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        le4.a(iArr2, le4.e(this.f12723a, iArr));
        iArr2[12] = i7;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.ne4
    final int b() {
        return 24;
    }
}
