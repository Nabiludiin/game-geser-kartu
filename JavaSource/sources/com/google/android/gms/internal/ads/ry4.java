package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class ry4 extends uy4 {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f15389g;

    /* renamed from: h, reason: collision with root package name */
    private int f15390h;

    /* renamed from: i, reason: collision with root package name */
    private int f15391i;

    /* renamed from: j, reason: collision with root package name */
    private int f15392j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15393k;

    /* renamed from: l, reason: collision with root package name */
    private int f15394l;

    /* renamed from: m, reason: collision with root package name */
    private int f15395m;

    /* synthetic */ ry4(byte[] bArr, int i7, int i8, boolean z7, byte[] bArr2) {
        super(null);
        this.f15395m = Integer.MAX_VALUE;
        this.f15389g = bArr;
        this.f15390h = i8 + i7;
        this.f15392j = i7;
        this.f15393k = i7;
    }

    private final void H() {
        int i7 = this.f15390h + this.f15391i;
        this.f15390h = i7;
        int i8 = i7 - this.f15393k;
        int i9 = this.f15395m;
        if (i8 <= i9) {
            this.f15391i = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f15391i = i10;
        this.f15390h = i7 - i10;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int A() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long B() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int C() {
        return uy4.i(I());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long D() {
        return uy4.j(J());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int E(int i7) {
        if (i7 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = i7 + (this.f15392j - this.f15393k);
        if (i8 < 0) {
            throw new e05("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.f15395m;
        if (i8 > i9) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f15395m = i8;
        H();
        return i9;
    }

    public final byte F() {
        int i7 = this.f15392j;
        if (i7 == this.f15390h) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f15389g;
        this.f15392j = i7 + 1;
        return bArr[i7];
    }

    public final void G(int i7) {
        if (i7 >= 0) {
            int i8 = this.f15390h;
            int i9 = this.f15392j;
            if (i7 <= i8 - i9) {
                this.f15392j = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int I() {
        int i7;
        int i8 = this.f15392j;
        int i9 = this.f15390h;
        if (i9 != i8) {
            byte[] bArr = this.f15389g;
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f15392j = i10;
                return b8;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b8;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b9 = bArr[i15];
                            int i17 = (i16 ^ (b9 << 28)) ^ 266354560;
                            if (b9 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f15392j = i11;
                return i7;
            }
        }
        return (int) K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ry4.J():long");
    }

    final long K() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((F() & 128) == 0) {
                return j7;
            }
        }
        throw new e05("CodedInputStream encountered a malformed varint.");
    }

    public final int L() {
        int i7 = this.f15392j;
        if (this.f15390h - i7 < 4) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f15389g;
        this.f15392j = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final long M() {
        int i7 = this.f15392j;
        if (this.f15390h - i7 < 8) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f15389g;
        this.f15392j = i7 + 8;
        long j7 = bArr[i7];
        long j8 = bArr[i7 + 2];
        long j9 = bArr[i7 + 3];
        return ((bArr[i7 + 6] & 255) << 48) | (j7 & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void a(int i7) {
        this.f15395m = i7;
        H();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean b() {
        return this.f15392j == this.f15390h;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int c() {
        return this.f15392j - this.f15393k;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int k() {
        if (b()) {
            this.f15394l = 0;
            return 0;
        }
        int I = I();
        this.f15394l = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new e05("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void l(int i7) {
        if (this.f15394l != i7) {
            throw new e05("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean m(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.f15390h - this.f15392j < 10) {
                while (i9 < 10) {
                    if (F() < 0) {
                        i9++;
                    }
                }
                throw new e05("CodedInputStream encountered a malformed varint.");
            }
            while (i9 < 10) {
                byte[] bArr = this.f15389g;
                int i10 = this.f15392j;
                this.f15392j = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw new e05("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i8 == 1) {
            G(8);
            return true;
        }
        if (i8 == 2) {
            G(I());
            return true;
        }
        if (i8 == 3) {
            h();
            l(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i8 == 4) {
            g();
            return false;
        }
        if (i8 != 5) {
            throw new d05("Protocol message tag had invalid wire type.");
        }
        G(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final double n() {
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final float o() {
        return Float.intBitsToFloat(L());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int r() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long s() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean u() {
        return J() != 0;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String v() {
        int I = I();
        if (I > 0) {
            int i7 = this.f15390h;
            int i8 = this.f15392j;
            if (I <= i7 - i8) {
                String str = new String(this.f15389g, i8, I, c05.f6203a);
                this.f15392j += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String w() {
        int I = I();
        if (I > 0) {
            int i7 = this.f15390h;
            int i8 = this.f15392j;
            if (I <= i7 - i8) {
                String e8 = k25.e(this.f15389g, i8, I);
                this.f15392j += I;
                return e8;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I <= 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final qy4 x() {
        int I = I();
        if (I > 0) {
            int i7 = this.f15390h;
            int i8 = this.f15392j;
            if (I <= i7 - i8) {
                qy4 s7 = qy4.s(this.f15389g, i8, I);
                this.f15392j += I;
                return s7;
            }
        }
        if (I == 0) {
            return qy4.f14669r;
        }
        if (I > 0) {
            int i9 = this.f15390h;
            int i10 = this.f15392j;
            if (I <= i9 - i10) {
                int i11 = I + i10;
                this.f15392j = i11;
                byte[] copyOfRange = Arrays.copyOfRange(this.f15389g, i10, i11);
                qy4 qy4Var = qy4.f14669r;
                return new oy4(copyOfRange);
            }
        }
        if (I <= 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int y() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int z() {
        return I();
    }
}
