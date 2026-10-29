package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: MyApplication */
final class sy4 extends uy4 {

    /* renamed from: g, reason: collision with root package name */
    private final Iterable f15879g;

    /* renamed from: h, reason: collision with root package name */
    private final Iterator f15880h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f15881i;

    /* renamed from: j, reason: collision with root package name */
    private int f15882j;

    /* renamed from: k, reason: collision with root package name */
    private int f15883k;

    /* renamed from: l, reason: collision with root package name */
    private int f15884l;

    /* renamed from: m, reason: collision with root package name */
    private int f15885m;

    /* renamed from: n, reason: collision with root package name */
    private int f15886n;

    /* renamed from: o, reason: collision with root package name */
    private long f15887o;

    /* renamed from: p, reason: collision with root package name */
    private long f15888p;

    /* renamed from: q, reason: collision with root package name */
    private long f15889q;

    /* synthetic */ sy4(Iterable iterable, int i7, boolean z7, byte[] bArr) {
        super(null);
        this.f15884l = Integer.MAX_VALUE;
        this.f15882j = i7;
        this.f15879g = iterable;
        this.f15880h = iterable.iterator();
        this.f15886n = 0;
        if (i7 != 0) {
            I();
            return;
        }
        this.f15881i = c05.f6205c;
        this.f15887o = 0L;
        this.f15888p = 0L;
        this.f15889q = 0L;
    }

    private final void H() {
        if (!this.f15880h.hasNext()) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        I();
    }

    private final void I() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f15880h.next();
        this.f15881i = byteBuffer;
        this.f15886n += (int) (this.f15887o - this.f15888p);
        long position = byteBuffer.position();
        this.f15887o = position;
        this.f15888p = position;
        this.f15889q = this.f15881i.limit();
        long A = f25.A(this.f15881i);
        this.f15887o += A;
        this.f15888p += A;
        this.f15889q += A;
    }

    private final void J() {
        int i7 = this.f15882j + this.f15883k;
        this.f15882j = i7;
        int i8 = this.f15884l;
        if (i7 <= i8) {
            this.f15883k = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f15883k = i9;
        this.f15882j = i7 - i9;
    }

    private final void K(byte[] bArr, int i7, int i8) {
        if (i8 > L()) {
            if (i8 > 0) {
                throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i9 = i8;
        while (i9 > 0) {
            if (this.f15889q - this.f15887o == 0) {
                H();
            }
            int min = Math.min(i9, (int) (this.f15889q - this.f15887o));
            long j7 = min;
            f25.y(this.f15887o, bArr, i8 - i9, j7);
            i9 -= min;
            this.f15887o += j7;
        }
    }

    private final int L() {
        return (int) (((this.f15882j - this.f15886n) - this.f15887o) + this.f15888p);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int A() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long B() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int C() {
        return uy4.i(M());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long D() {
        return uy4.j(N());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int E(int i7) {
        if (i7 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int c8 = i7 + c();
        int i8 = this.f15884l;
        if (c8 > i8) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f15884l = c8;
        J();
        return i8;
    }

    public final byte F() {
        if (this.f15889q - this.f15887o == 0) {
            H();
        }
        long j7 = this.f15887o;
        this.f15887o = 1 + j7;
        return f25.z(j7);
    }

    public final void G(int i7) {
        if (i7 >= 0) {
            if (i7 <= ((this.f15882j - this.f15886n) - this.f15887o) + this.f15888p) {
                while (i7 > 0) {
                    if (this.f15889q - this.f15887o == 0) {
                        H();
                    }
                    int min = Math.min(i7, (int) (this.f15889q - this.f15887o));
                    i7 -= min;
                    this.f15887o += min;
                }
                return;
            }
        }
        if (i7 >= 0) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int M() {
        int i7;
        long j7 = this.f15887o;
        if (this.f15889q != j7) {
            long j8 = j7 + 1;
            byte z7 = f25.z(j7);
            if (z7 >= 0) {
                this.f15887o++;
                return z7;
            }
            if (this.f15889q - this.f15887o >= 10) {
                long j9 = 2 + j7;
                int z8 = (f25.z(j8) << 7) ^ z7;
                if (z8 < 0) {
                    i7 = z8 ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int z9 = (f25.z(j9) << 14) ^ z8;
                    if (z9 >= 0) {
                        i7 = z9 ^ 16256;
                    } else {
                        long j11 = 4 + j7;
                        int z10 = z9 ^ (f25.z(j10) << 21);
                        if (z10 < 0) {
                            i7 = (-2080896) ^ z10;
                        } else {
                            j10 = 5 + j7;
                            byte z11 = f25.z(j11);
                            int i8 = (z10 ^ (z11 << 28)) ^ 266354560;
                            if (z11 < 0) {
                                j11 = 6 + j7;
                                if (f25.z(j10) < 0) {
                                    j10 = 7 + j7;
                                    if (f25.z(j11) < 0) {
                                        j11 = 8 + j7;
                                        if (f25.z(j10) < 0) {
                                            j10 = 9 + j7;
                                            if (f25.z(j11) < 0) {
                                                long j12 = j7 + 10;
                                                if (f25.z(j10) >= 0) {
                                                    i7 = i8;
                                                    j9 = j12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j9 = j11;
                    }
                    j9 = j10;
                }
                this.f15887o = j9;
                return i7;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j7;
        long j8;
        long j9 = this.f15887o;
        if (this.f15889q != j9) {
            long j10 = j9 + 1;
            byte z7 = f25.z(j9);
            if (z7 >= 0) {
                this.f15887o++;
                return z7;
            }
            if (this.f15889q - this.f15887o >= 10) {
                long j11 = 2 + j9;
                int z8 = (f25.z(j10) << 7) ^ z7;
                if (z8 < 0) {
                    j7 = z8 ^ (-128);
                } else {
                    long j12 = 3 + j9;
                    int z9 = (f25.z(j11) << 14) ^ z8;
                    if (z9 >= 0) {
                        j7 = z9 ^ 16256;
                    } else {
                        long j13 = 4 + j9;
                        int z10 = z9 ^ (f25.z(j12) << 21);
                        if (z10 < 0) {
                            j7 = (-2080896) ^ z10;
                            j11 = j13;
                        } else {
                            j12 = 5 + j9;
                            long z11 = (f25.z(j13) << 28) ^ z10;
                            if (z11 >= 0) {
                                j7 = 266354560 ^ z11;
                            } else {
                                long j14 = 6 + j9;
                                long z12 = z11 ^ (f25.z(j12) << 35);
                                if (z12 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    long j15 = 7 + j9;
                                    long z13 = z12 ^ (f25.z(j14) << 42);
                                    if (z13 >= 0) {
                                        j7 = 4363953127296L ^ z13;
                                    } else {
                                        j14 = 8 + j9;
                                        z12 = z13 ^ (f25.z(j15) << 49);
                                        if (z12 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            j15 = 9 + j9;
                                            long z14 = (z12 ^ (f25.z(j14) << 56)) ^ 71499008037633920L;
                                            if (z14 < 0) {
                                                long j16 = j9 + 10;
                                                if (f25.z(j15) >= 0) {
                                                    j11 = j16;
                                                    j7 = z14;
                                                }
                                            } else {
                                                j7 = z14;
                                            }
                                        }
                                    }
                                    j11 = j15;
                                }
                                j7 = j8 ^ z12;
                                j11 = j14;
                            }
                        }
                    }
                    j11 = j12;
                }
                this.f15887o = j11;
                return j7;
            }
        }
        return O();
    }

    final long O() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((F() & 128) == 0) {
                return j7;
            }
        }
        throw new e05("CodedInputStream encountered a malformed varint.");
    }

    public final int P() {
        long j7 = this.f15889q;
        long j8 = this.f15887o;
        if (j7 - j8 < 4) {
            int F = F() & 255;
            int F2 = (F() & 255) << 8;
            return F | F2 | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        this.f15887o = 4 + j8;
        int z7 = f25.z(j8) & 255;
        int z8 = (f25.z(1 + j8) & 255) << 8;
        return z7 | z8 | ((f25.z(2 + j8) & 255) << 16) | ((f25.z(j8 + 3) & 255) << 24);
    }

    public final long Q() {
        long j7 = this.f15889q;
        long j8 = this.f15887o;
        if (j7 - j8 < 8) {
            return ((F() & 255) << 56) | (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24) | ((F() & 255) << 32) | ((F() & 255) << 40) | ((F() & 255) << 48);
        }
        this.f15887o = 8 + j8;
        long z7 = f25.z(j8) & 255;
        long z8 = (f25.z(1 + j8) & 255) << 8;
        return z7 | z8 | ((f25.z(j8 + 2) & 255) << 16) | ((f25.z(3 + j8) & 255) << 24) | ((f25.z(j8 + 4) & 255) << 32) | ((f25.z(j8 + 5) & 255) << 40) | ((f25.z(j8 + 6) & 255) << 48) | ((f25.z(j8 + 7) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void a(int i7) {
        this.f15884l = i7;
        J();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean b() {
        return (((long) this.f15886n) + this.f15887o) - this.f15888p == ((long) this.f15882j);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int c() {
        return (int) ((this.f15886n + this.f15887o) - this.f15888p);
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int k() {
        if (b()) {
            this.f15885m = 0;
            return 0;
        }
        int M = M();
        this.f15885m = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        throw new e05("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final void l(int i7) {
        if (this.f15885m != i7) {
            throw new e05("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean m(int i7) {
        int i8 = i7 & 7;
        if (i8 == 0) {
            for (int i9 = 0; i9 < 10; i9++) {
                if (F() >= 0) {
                    return true;
                }
            }
            throw new e05("CodedInputStream encountered a malformed varint.");
        }
        if (i8 == 1) {
            G(8);
            return true;
        }
        if (i8 == 2) {
            G(M());
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
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final float o() {
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long p() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long q() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int r() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final long s() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int t() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final boolean u() {
        return N() != 0;
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String v() {
        int M = M();
        if (M > 0) {
            long j7 = this.f15889q;
            long j8 = this.f15887o;
            long j9 = M;
            if (j9 <= j7 - j8) {
                byte[] bArr = new byte[M];
                f25.y(j8, bArr, 0L, j9);
                String str = new String(bArr, c05.f6203a);
                this.f15887o += j9;
                return str;
            }
        }
        if (M > 0 && M <= L()) {
            byte[] bArr2 = new byte[M];
            K(bArr2, 0, M);
            return new String(bArr2, c05.f6203a);
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final String w() {
        int M = M();
        if (M > 0) {
            long j7 = this.f15889q;
            long j8 = this.f15887o;
            long j9 = M;
            if (j9 <= j7 - j8) {
                String d8 = k25.d(this.f15881i, (int) (j8 - this.f15888p), M);
                this.f15887o += j9;
                return d8;
            }
        }
        if (M >= 0 && M <= L()) {
            byte[] bArr = new byte[M];
            K(bArr, 0, M);
            return k25.e(bArr, 0, M);
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final qy4 x() {
        int M = M();
        if (M > 0) {
            long j7 = this.f15889q;
            long j8 = this.f15887o;
            long j9 = M;
            if (j9 <= j7 - j8) {
                byte[] bArr = new byte[M];
                f25.y(j8, bArr, 0L, j9);
                this.f15887o += j9;
                qy4 qy4Var = qy4.f14669r;
                return new oy4(bArr);
            }
        }
        if (M > 0 && M <= L()) {
            byte[] bArr2 = new byte[M];
            K(bArr2, 0, M);
            qy4 qy4Var2 = qy4.f14669r;
            return new oy4(bArr2);
        }
        if (M == 0) {
            return qy4.f14669r;
        }
        if (M < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int y() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.uy4
    public final int z() {
        return M();
    }
}
