package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class ty4 extends uy4 {

    /* renamed from: g, reason: collision with root package name */
    private final InputStream f16493g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f16494h;

    /* renamed from: i, reason: collision with root package name */
    private int f16495i;

    /* renamed from: j, reason: collision with root package name */
    private int f16496j;

    /* renamed from: k, reason: collision with root package name */
    private int f16497k;

    /* renamed from: l, reason: collision with root package name */
    private int f16498l;

    /* renamed from: m, reason: collision with root package name */
    private int f16499m;

    /* renamed from: n, reason: collision with root package name */
    private int f16500n;

    /* synthetic */ ty4(InputStream inputStream, int i7, byte[] bArr) {
        super(null);
        this.f16500n = Integer.MAX_VALUE;
        byte[] bArr2 = c05.f6204b;
        this.f16493g = inputStream;
        this.f16494h = new byte[4096];
        this.f16495i = 0;
        this.f16497k = 0;
        this.f16499m = 0;
    }

    private final void H() {
        int i7 = this.f16495i + this.f16496j;
        this.f16495i = i7;
        int i8 = this.f16499m + i7;
        int i9 = this.f16500n;
        if (i8 <= i9) {
            this.f16496j = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f16496j = i10;
        this.f16495i = i7 - i10;
    }

    private final void I(int i7) {
        if (J(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f16499m) - this.f16497k) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new e05("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean J(int i7) {
        int i8 = this.f16497k;
        int i9 = i8 + i7;
        int i10 = this.f16495i;
        if (i9 <= i10) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i7);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i11 = this.f16499m;
        if (i7 > (Integer.MAX_VALUE - i11) - i8 || i11 + i8 + i7 > this.f16500n) {
            return false;
        }
        if (i8 > 0) {
            if (i10 > i8) {
                byte[] bArr = this.f16494h;
                System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
            }
            i11 = this.f16499m + i8;
            this.f16499m = i11;
            i10 = this.f16495i - i8;
            this.f16495i = i10;
            this.f16497k = 0;
        }
        try {
            int read = this.f16493g.read(this.f16494h, i10, Math.min(4096 - i10, (Integer.MAX_VALUE - i11) - i10));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.f16495i += read;
                H();
                return this.f16495i >= i7 || J(i7);
            }
            String valueOf = String.valueOf(this.f16493g.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + String.valueOf(read).length() + 41);
            sb2.append(valueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(read);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (e05 e8) {
            e8.a();
            throw e8;
        }
    }

    private final byte[] K(int i7, boolean z7) {
        byte[] L = L(i7);
        if (L != null) {
            return L;
        }
        int i8 = this.f16497k;
        int i9 = this.f16495i;
        int i10 = i9 - i8;
        this.f16499m += i9;
        this.f16497k = 0;
        this.f16495i = 0;
        List<byte[]> M = M(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f16494h, i8, bArr, 0, i10);
        for (byte[] bArr2 : M) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    private final byte[] L(int i7) {
        if (i7 == 0) {
            return c05.f6204b;
        }
        int i8 = this.f16499m;
        int i9 = this.f16497k;
        int i10 = i8 + i9 + i7;
        if ((-2147483647) + i10 > 0) {
            throw new e05("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f16500n;
        if (i10 > i11) {
            G((i11 - i8) - i9);
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = this.f16495i - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096) {
            try {
                if (i13 > this.f16493g.available()) {
                    return null;
                }
            } catch (e05 e8) {
                e8.a();
                throw e8;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f16494h, this.f16497k, bArr, 0, i12);
        this.f16499m += this.f16495i;
        this.f16497k = 0;
        this.f16495i = 0;
        while (i12 < i7) {
            try {
                int read = this.f16493g.read(bArr, i12, i7 - i12);
                if (read == -1) {
                    throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f16499m += read;
                i12 += read;
            } catch (e05 e9) {
                e9.a();
                throw e9;
            }
        }
        return bArr;
    }

    private final List M(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f16493g.read(bArr, i8, min - i8);
                if (read == -1) {
                    throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f16499m += read;
                i8 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int A() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long B() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int C() {
        return uy4.i(N());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long D() {
        return uy4.j(O());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int E(int i7) {
        if (i7 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = i7 + this.f16499m + this.f16497k;
        if (i8 < 0) {
            throw new e05("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.f16500n;
        if (i8 > i9) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f16500n = i8;
        H();
        return i9;
    }

    public final byte F() {
        if (this.f16497k == this.f16495i) {
            I(1);
        }
        byte[] bArr = this.f16494h;
        int i7 = this.f16497k;
        this.f16497k = i7 + 1;
        return bArr[i7];
    }

    public final void G(int i7) {
        int i8 = this.f16495i;
        int i9 = this.f16497k;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f16497k = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f16499m;
        int i12 = i11 + i9;
        int i13 = this.f16500n;
        if (i12 + i7 > i13) {
            G((i13 - i11) - i9);
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f16499m = i12;
        this.f16495i = 0;
        this.f16497k = 0;
        while (i10 < i7) {
            try {
                long j7 = i7 - i10;
                try {
                    long skip = this.f16493g.skip(j7);
                    if (skip < 0 || skip > j7) {
                        String valueOf = String.valueOf(this.f16493g.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i10 += (int) skip;
                    }
                } catch (e05 e8) {
                    e8.a();
                    throw e8;
                }
            } catch (Throwable th) {
                this.f16499m += i10;
                H();
                throw th;
            }
        }
        this.f16499m += i10;
        H();
        if (i10 >= i7) {
            return;
        }
        int i14 = this.f16495i;
        int i15 = i14 - this.f16497k;
        this.f16497k = i14;
        I(1);
        while (true) {
            int i16 = i7 - i15;
            int i17 = this.f16495i;
            if (i16 <= i17) {
                this.f16497k = i16;
                return;
            } else {
                i15 += i17;
                this.f16497k = i17;
                I(1);
            }
        }
    }

    public final int N() {
        int i7;
        int i8 = this.f16497k;
        int i9 = this.f16495i;
        if (i9 != i8) {
            byte[] bArr = this.f16494h;
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f16497k = i10;
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
                this.f16497k = i11;
                return i7;
            }
        }
        return (int) P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long O() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ty4.O():long");
    }

    final long P() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((F() & 128) == 0) {
                return j7;
            }
        }
        throw new e05("CodedInputStream encountered a malformed varint.");
    }

    public final int Q() {
        int i7 = this.f16497k;
        if (this.f16495i - i7 < 4) {
            I(4);
            i7 = this.f16497k;
        }
        byte[] bArr = this.f16494h;
        this.f16497k = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final long R() {
        int i7 = this.f16497k;
        if (this.f16495i - i7 < 8) {
            I(8);
            i7 = this.f16497k;
        }
        byte[] bArr = this.f16494h;
        this.f16497k = i7 + 8;
        long j7 = bArr[i7];
        long j8 = bArr[i7 + 2];
        long j9 = bArr[i7 + 3];
        return ((bArr[i7 + 6] & 255) << 48) | (j7 & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void a(int i7) {
        this.f16500n = i7;
        H();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean b() {
        return this.f16497k == this.f16495i && !J(1);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int c() {
        return this.f16499m + this.f16497k;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int k() {
        if (b()) {
            this.f16498l = 0;
            return 0;
        }
        int N = N();
        this.f16498l = N;
        if ((N >>> 3) != 0) {
            return N;
        }
        throw new e05("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void l(int i7) {
        if (this.f16498l != i7) {
            throw new e05("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean m(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.f16495i - this.f16497k < 10) {
                while (i9 < 10) {
                    if (F() < 0) {
                        i9++;
                    }
                }
                throw new e05("CodedInputStream encountered a malformed varint.");
            }
            while (i9 < 10) {
                byte[] bArr = this.f16494h;
                int i10 = this.f16497k;
                this.f16497k = i10 + 1;
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
            G(N());
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
        return Double.longBitsToDouble(R());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final float o() {
        return Float.intBitsToFloat(Q());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long p() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long q() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int r() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long s() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean u() {
        return O() != 0;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String v() {
        int N = N();
        if (N > 0) {
            int i7 = this.f16495i;
            int i8 = this.f16497k;
            if (N <= i7 - i8) {
                String str = new String(this.f16494h, i8, N, c05.f6203a);
                this.f16497k += N;
                return str;
            }
        }
        if (N == 0) {
            return "";
        }
        if (N < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (N > this.f16495i) {
            return new String(K(N, false), c05.f6203a);
        }
        I(N);
        String str2 = new String(this.f16494h, this.f16497k, N, c05.f6203a);
        this.f16497k += N;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String w() {
        byte[] K;
        int N = N();
        int i7 = this.f16497k;
        int i8 = this.f16495i;
        if (N <= i8 - i7 && N > 0) {
            K = this.f16494h;
            this.f16497k = i7 + N;
        } else {
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i7 = 0;
            if (N <= i8) {
                I(N);
                K = this.f16494h;
                this.f16497k = N;
            } else {
                K = K(N, false);
            }
        }
        return k25.e(K, i7, N);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final qy4 x() {
        int N = N();
        int i7 = this.f16495i;
        int i8 = this.f16497k;
        if (N <= i7 - i8 && N > 0) {
            qy4 s7 = qy4.s(this.f16494h, i8, N);
            this.f16497k += N;
            return s7;
        }
        if (N == 0) {
            return qy4.f14669r;
        }
        if (N < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] L = L(N);
        if (L != null) {
            return qy4.s(L, 0, L.length);
        }
        int i9 = this.f16497k;
        int i10 = this.f16495i;
        int i11 = i10 - i9;
        this.f16499m += i10;
        this.f16497k = 0;
        this.f16495i = 0;
        List<byte[]> M = M(N - i11);
        byte[] bArr = new byte[N];
        System.arraycopy(this.f16494h, i9, bArr, 0, i11);
        for (byte[] bArr2 : M) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        qy4 qy4Var = qy4.f14669r;
        return new oy4(bArr);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int y() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int z() {
        return N();
    }
}
