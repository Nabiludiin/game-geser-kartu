package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class wy4 extends az4 {

    /* renamed from: e, reason: collision with root package name */
    final byte[] f18475e;

    /* renamed from: f, reason: collision with root package name */
    final int f18476f;

    /* renamed from: g, reason: collision with root package name */
    int f18477g;

    /* renamed from: h, reason: collision with root package name */
    int f18478h;

    wy4(int i7) {
        super(null);
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i7, 20)];
        this.f18475e = bArr;
        this.f18476f = bArr.length;
    }

    final void E(byte b8) {
        byte[] bArr = this.f18475e;
        int i7 = this.f18477g;
        bArr[i7] = b8;
        this.f18477g = i7 + 1;
        this.f18478h++;
    }

    final void F(int i7) {
        boolean z7;
        z7 = az4.f5413c;
        if (!z7) {
            while ((i7 & (-128)) != 0) {
                byte[] bArr = this.f18475e;
                int i8 = this.f18477g;
                this.f18477g = i8 + 1;
                bArr[i8] = (byte) (i7 | 128);
                this.f18478h++;
                i7 >>>= 7;
            }
            byte[] bArr2 = this.f18475e;
            int i9 = this.f18477g;
            this.f18477g = i9 + 1;
            bArr2[i9] = (byte) i7;
            this.f18478h++;
            return;
        }
        long j7 = this.f18477g;
        while ((i7 & (-128)) != 0) {
            byte[] bArr3 = this.f18475e;
            int i10 = this.f18477g;
            this.f18477g = i10 + 1;
            f25.x(bArr3, i10, (byte) (i7 | 128));
            i7 >>>= 7;
        }
        byte[] bArr4 = this.f18475e;
        int i11 = this.f18477g;
        this.f18477g = i11 + 1;
        f25.x(bArr4, i11, (byte) i7);
        this.f18478h += (int) (this.f18477g - j7);
    }

    final void G(long j7) {
        boolean z7;
        z7 = az4.f5413c;
        if (z7) {
            long j8 = this.f18477g;
            while (true) {
                int i7 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr = this.f18475e;
                    int i8 = this.f18477g;
                    this.f18477g = i8 + 1;
                    f25.x(bArr, i8, (byte) i7);
                    this.f18478h += (int) (this.f18477g - j8);
                    return;
                }
                byte[] bArr2 = this.f18475e;
                int i9 = this.f18477g;
                this.f18477g = i9 + 1;
                f25.x(bArr2, i9, (byte) (i7 | 128));
                j7 >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr3 = this.f18475e;
                    int i11 = this.f18477g;
                    this.f18477g = i11 + 1;
                    bArr3[i11] = (byte) i10;
                    this.f18478h++;
                    return;
                }
                byte[] bArr4 = this.f18475e;
                int i12 = this.f18477g;
                this.f18477g = i12 + 1;
                bArr4[i12] = (byte) (i10 | 128);
                this.f18478h++;
                j7 >>>= 7;
            }
        }
    }

    final void H(int i7) {
        int i8 = this.f18477g;
        byte[] bArr = this.f18475e;
        bArr[i8] = (byte) i7;
        bArr[i8 + 1] = (byte) (i7 >> 8);
        bArr[i8 + 2] = (byte) (i7 >> 16);
        bArr[i8 + 3] = (byte) (i7 >> 24);
        this.f18477g = i8 + 4;
        this.f18478h += 4;
    }

    final void I(long j7) {
        int i7 = this.f18477g;
        byte[] bArr = this.f18475e;
        bArr[i7] = (byte) j7;
        bArr[i7 + 1] = (byte) (j7 >> 8);
        bArr[i7 + 2] = (byte) (j7 >> 16);
        bArr[i7 + 3] = (byte) (j7 >> 24);
        bArr[i7 + 4] = (byte) (j7 >> 32);
        bArr[i7 + 5] = (byte) (j7 >> 40);
        bArr[i7 + 6] = (byte) (j7 >> 48);
        bArr[i7 + 7] = (byte) (j7 >> 56);
        this.f18477g = i7 + 8;
        this.f18478h += 8;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final int n() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
