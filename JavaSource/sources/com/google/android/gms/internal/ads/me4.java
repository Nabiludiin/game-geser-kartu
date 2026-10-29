package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class me4 extends ne4 {
    public me4(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.ne4
    public final int[] a(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        le4.a(iArr2, this.f12723a);
        iArr2[12] = i7;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.ne4
    public final int b() {
        return 12;
    }
}
