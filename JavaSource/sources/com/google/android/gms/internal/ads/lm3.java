package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lm3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11655a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f11656b;

    /* renamed from: c, reason: collision with root package name */
    private int f11657c;

    public lm3(byte[] bArr) {
        for (int i7 = 0; i7 < 256; i7++) {
            this.f11655a[i7] = (byte) i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr2 = this.f11655a;
            byte b8 = bArr2[i9];
            i8 = (i8 + b8 + bArr[i9 % bArr.length]) & 255;
            bArr2[i9] = bArr2[i8];
            bArr2[i8] = b8;
        }
        this.f11656b = 0;
        this.f11657c = 0;
    }

    public final void a(byte[] bArr) {
        int i7 = this.f11656b;
        int i8 = this.f11657c;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr2 = this.f11655a;
            i7 = (i7 + 1) & 255;
            byte b8 = bArr2[i7];
            i8 = (i8 + b8) & 255;
            bArr2[i7] = bArr2[i8];
            bArr2[i8] = b8;
            bArr[i9] = (byte) (bArr2[(bArr2[i7] + b8) & 255] ^ bArr[i9]);
        }
        this.f11656b = i7;
        this.f11657c = i8;
    }
}
