package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class y82 {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f19415d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f19416e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final g14 f19417f = g14.p(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f19418g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19419a;

    /* renamed from: b, reason: collision with root package name */
    private int f19420b;

    /* renamed from: c, reason: collision with root package name */
    private int f19421c;

    public y82(byte[] bArr, int i7) {
        this.f19419a = bArr;
        this.f19421c = i7;
    }

    private final char s(ByteOrder byteOrder, int i7) {
        w(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f19419a;
            int i8 = this.f19420b + i7;
            return i44.a(bArr[i8], bArr[i8 + 1]);
        }
        byte[] bArr2 = this.f19419a;
        int i9 = this.f19420b + i7;
        return i44.a(bArr2[i9 + 1], bArr2[i9]);
    }

    private final char t(Charset charset, char[] cArr) {
        int u7;
        if (C() >= v(charset) && (u7 = u(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j7 = r0;
                char c8 = (char) j7;
                rx3.e(((long) c8) == j7, "Out of range: %s", j7);
                for (char c9 : cArr) {
                    if (c9 == c8) {
                        this.f19420b += m44.a(u7 & 255);
                        return c8;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int u(Charset charset) {
        int i7;
        int i8;
        int a8;
        rx3.f(f19417f.contains(charset), "Unsupported charset: %s", charset);
        if (C() < v(charset)) {
            int i9 = this.f19420b;
            int i10 = this.f19421c;
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 17 + String.valueOf(i10).length());
            sb.append("position=");
            sb.append(i9);
            sb.append(", limit=");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b8 = this.f19419a[this.f19420b];
            if ((b8 & 128) == 0) {
                i7 = x82.a(b8);
                return (i7 << 8) | i11;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b9 = this.f19419a[this.f19420b];
            if ((b9 & 128) == 0) {
                i8 = 1;
            } else if ((b9 & 224) == 192 && C() >= 2 && x(this.f19419a[this.f19420b + 1])) {
                i8 = 2;
            } else {
                if ((this.f19419a[this.f19420b] & 240) == 224 && C() >= 3) {
                    byte[] bArr = this.f19419a;
                    int i12 = this.f19420b;
                    if (x(bArr[i12 + 1]) && x(bArr[i12 + 2])) {
                        i8 = 3;
                    }
                }
                if ((this.f19419a[this.f19420b] & 248) == 240 && C() >= 4) {
                    byte[] bArr2 = this.f19419a;
                    int i13 = this.f19420b;
                    if (x(bArr2[i13 + 1]) && x(bArr2[i13 + 2]) && x(bArr2[i13 + 3])) {
                        i8 = 4;
                    }
                }
                i8 = 0;
            }
            if (i8 == 1) {
                a8 = x82.a(this.f19419a[this.f19420b]);
            } else if (i8 == 2) {
                byte[] bArr3 = this.f19419a;
                int i14 = this.f19420b;
                a8 = y(0, 0, bArr3[i14], bArr3[i14 + 1]);
            } else {
                if (i8 != 3) {
                    if (i8 == 4) {
                        byte[] bArr4 = this.f19419a;
                        int i15 = this.f19420b;
                        a8 = y(bArr4[i15], bArr4[i15 + 1], bArr4[i15 + 2], bArr4[i15 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f19419a;
                int i16 = this.f19420b;
                a8 = y(0, bArr5[i16] & 15, bArr5[i16 + 1], bArr5[i16 + 2]);
            }
            i11 = i8;
            i7 = a8;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char s7 = s(byteOrder, 0);
            if (!Character.isHighSurrogate(s7) || C() < 4) {
                i7 = s7;
                i11 = 2;
            } else {
                i7 = Character.toCodePoint(s7, s(byteOrder, 2));
                i11 = 4;
            }
        }
        return (i7 << 8) | i11;
    }

    private static int v(Charset charset) {
        rx3.f(f19417f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void w(int i7) {
        if (!f19418g.get() || C() >= i7) {
            return;
        }
        int C = C();
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25 + String.valueOf(C).length());
        sb.append("bytesNeeded= ");
        sb.append(i7);
        sb.append(", bytesLeft=");
        sb.append(C);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static boolean x(byte b8) {
        return (b8 & 192) == 128;
    }

    private static int y(int i7, int i8, int i9, int i10) {
        return m44.e((byte) 0, q44.a(((i7 & 7) << 2) | ((i8 & 48) >> 4)), q44.a(((i9 & 60) >> 2) | ((i8 & 15) << 4)), q44.a((i10 & 63) | ((i9 & 3) << 6)));
    }

    public final void A(byte[] bArr, int i7) {
        this.f19419a = bArr;
        this.f19421c = i7;
        this.f19420b = 0;
    }

    public final void B(int i7) {
        byte[] bArr = this.f19419a;
        if (i7 > bArr.length) {
            this.f19419a = Arrays.copyOf(bArr, i7);
        }
    }

    public final int C() {
        return Math.max(this.f19421c - this.f19420b, 0);
    }

    public final int D() {
        return this.f19421c;
    }

    public final void E(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= this.f19419a.length) {
            z7 = true;
        }
        rx3.a(z7);
        this.f19421c = i7;
    }

    public final int F() {
        return this.f19420b;
    }

    public final void G(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= this.f19421c) {
            z7 = true;
        }
        rx3.a(z7);
        this.f19420b = i7;
    }

    public final byte[] H() {
        return this.f19419a;
    }

    public final int I() {
        return this.f19419a.length;
    }

    public final void J(int i7) {
        G(this.f19420b + i7);
    }

    public final void K(w72 w72Var, int i7) {
        L(w72Var.f18098a, 0, i7);
        w72Var.f(0);
    }

    public final void L(byte[] bArr, int i7, int i8) {
        w(i8);
        System.arraycopy(this.f19419a, this.f19420b, bArr, i7, i8);
        this.f19420b += i8;
    }

    public final int M() {
        w(1);
        return this.f19419a[this.f19420b] & 255;
    }

    public final char N() {
        return s(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int O(Charset charset) {
        if (u(charset) != 0) {
            return m44.a(r3 >>> 8);
        }
        return 1114112;
    }

    public final int P() {
        if (C() >= 3) {
            this.f19420b -= 3;
            return W();
        }
        int i7 = this.f19420b;
        int i8 = this.f19421c;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 17 + String.valueOf(i8).length());
        sb.append("position=");
        sb.append(i7);
        sb.append(", limit=");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int Q() {
        if (C() >= 4) {
            this.f19420b -= 4;
            return b();
        }
        int i7 = this.f19420b;
        int i8 = this.f19421c;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 17 + String.valueOf(i8).length());
        sb.append("position=");
        sb.append(i7);
        sb.append(", limit=");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int R() {
        w(1);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        this.f19420b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int S() {
        w(2);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        this.f19420b = i7 + 2;
        return (bArr[i8] & 255) | (i9 << 8);
    }

    public final int T() {
        w(2);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        this.f19420b = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public final short U() {
        w(2);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        this.f19420b = i7 + 2;
        return (short) ((bArr[i8] & 255) | (i9 << 8));
    }

    public final short V() {
        w(2);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        this.f19420b = i7 + 2;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public final int W() {
        w(3);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f19420b = i10;
        int i11 = bArr[i8] & 255;
        this.f19420b = i7 + 3;
        return (bArr[i10] & 255) | (i9 << 16) | (i11 << 8);
    }

    public final int X() {
        w(3);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f19420b = i10;
        int i11 = bArr[i8] & 255;
        this.f19420b = i7 + 3;
        return (bArr[i10] & 255) | ((i9 << 24) >> 8) | (i11 << 8);
    }

    public final long Y() {
        w(4);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.f19420b = i9;
        long j8 = bArr[i8];
        this.f19420b = i7 + 3;
        long j9 = bArr[i9];
        this.f19420b = i7 + 4;
        return (bArr[r3] & 255) | ((j7 & 255) << 24) | ((j8 & 255) << 16) | ((j9 & 255) << 8);
    }

    public final long a() {
        w(4);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.f19420b = i9;
        long j8 = bArr[i8];
        this.f19420b = i7 + 3;
        long j9 = bArr[i9];
        this.f19420b = i7 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j7) | ((j8 & 255) << 8) | ((j9 & 255) << 16);
    }

    public final int b() {
        w(4);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f19420b = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.f19420b = i12;
        int i13 = bArr[i10] & 255;
        this.f19420b = i7 + 4;
        return (bArr[i12] & 255) | (i9 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int c() {
        w(4);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f19420b = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.f19420b = i12;
        int i13 = bArr[i10] & 255;
        this.f19420b = i7 + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i9 | (i13 << 16);
    }

    public final long d() {
        w(8);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.f19420b = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.f19420b = i10;
        long j9 = bArr[i9];
        int i11 = i7 + 4;
        this.f19420b = i11;
        long j10 = bArr[i10];
        int i12 = i7 + 5;
        this.f19420b = i12;
        long j11 = bArr[i11];
        int i13 = i7 + 6;
        this.f19420b = i13;
        long j12 = bArr[i12];
        this.f19420b = i7 + 7;
        long j13 = bArr[i13];
        this.f19420b = i7 + 8;
        return ((j13 & 255) << 8) | ((j7 & 255) << 56) | ((j8 & 255) << 48) | ((j9 & 255) << 40) | ((j10 & 255) << 32) | ((j11 & 255) << 24) | ((j12 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        w(8);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.f19420b = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.f19420b = i10;
        long j9 = bArr[i9];
        int i11 = i7 + 4;
        this.f19420b = i11;
        long j10 = bArr[i10];
        int i12 = i7 + 5;
        this.f19420b = i12;
        long j11 = bArr[i11];
        int i13 = i7 + 6;
        this.f19420b = i13;
        long j12 = bArr[i12];
        this.f19420b = i7 + 7;
        long j13 = bArr[i13];
        this.f19420b = i7 + 8;
        return ((j13 & 255) << 48) | (j7 & 255) | ((j8 & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((j11 & 255) << 32) | ((j12 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        w(4);
        byte[] bArr = this.f19419a;
        int i7 = this.f19420b;
        int i8 = i7 + 1;
        this.f19420b = i8;
        int i9 = bArr[i7] & 255;
        this.f19420b = i7 + 2;
        int i10 = bArr[i8] & 255;
        this.f19420b = i7 + 4;
        return (i9 << 8) | i10;
    }

    public final int g() {
        return (R() << 21) | (R() << 14) | (R() << 7) | R();
    }

    public final int h() {
        int b8 = b();
        if (b8 >= 0) {
            return b8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(b8);
        throw new IllegalStateException(sb.toString());
    }

    public final int i() {
        int c8 = c();
        if (c8 >= 0) {
            return c8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c8).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(c8);
        throw new IllegalStateException(sb.toString());
    }

    public final long j() {
        long d8 = d();
        if (d8 >= 0) {
            return d8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(d8).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(d8);
        throw new IllegalStateException(sb.toString());
    }

    public final String k(int i7, Charset charset) {
        w(i7);
        byte[] bArr = this.f19419a;
        int i8 = this.f19420b;
        String str = new String(bArr, i8, i7, charset);
        this.f19420b = i8 + i7;
        return str;
    }

    public final String l(int i7) {
        w(i7);
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f19420b;
        int i9 = (i8 + i7) - 1;
        String G = hi2.G(this.f19419a, i8, (i9 >= this.f19421c || this.f19419a[i9] != 0) ? i7 : i7 - 1);
        this.f19420b += i7;
        return G;
    }

    public final String m(char c8) {
        if (C() == 0) {
            return null;
        }
        int i7 = this.f19420b;
        while (i7 < this.f19421c && this.f19419a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f19419a;
        int i8 = this.f19420b;
        String G = hi2.G(bArr, i8, i7 - i8);
        this.f19420b = i7;
        if (i7 < this.f19421c) {
            this.f19420b = i7 + 1;
        }
        return G;
    }

    public final String n(Charset charset) {
        rx3.f(f19417f.contains(charset), "Unsupported charset: %s", charset);
        if (C() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            r();
        }
        int i7 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i7 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i8 = this.f19420b;
        while (true) {
            int i9 = this.f19421c;
            if (i8 >= i9 - (i7 - 1)) {
                i8 = i9;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && hi2.H(this.f19419a[i8])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f19419a;
                if (bArr[i8] == 0 && hi2.H(bArr[i8 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f19419a;
                if (bArr2[i8 + 1] == 0 && hi2.H(bArr2[i8])) {
                    break;
                }
            }
            i8 += i7;
        }
        String k7 = k(i8 - this.f19420b, charset);
        if (this.f19420b != this.f19421c && t(charset, f19415d) == '\r') {
            t(charset, f19416e);
        }
        return k7;
    }

    public final long o() {
        int i7;
        w(1);
        long j7 = this.f19419a[this.f19420b];
        int i8 = 7;
        while (true) {
            i7 = 0;
            if (i8 < 0) {
                break;
            }
            if (((1 << i8) & j7) != 0) {
                i8--;
            } else if (i8 < 6) {
                j7 &= r7 - 1;
                i7 = 7 - i8;
            } else if (i8 == 7) {
                i7 = 1;
            }
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j7);
            throw new NumberFormatException(sb.toString());
        }
        w(i7);
        for (int i9 = 1; i9 < i7; i9++) {
            if ((this.f19419a[this.f19420b + i9] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j7);
                throw new NumberFormatException(sb2.toString());
            }
            j7 = (j7 << 6) | (r3 & 63);
        }
        this.f19420b += i7;
        return j7;
    }

    public final long p() {
        long j7 = 0;
        for (int i7 = 0; i7 < 9; i7++) {
            if (this.f19420b == this.f19421c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long R = R();
            j7 |= (127 & R) << (i7 * 7);
            if ((R & 128) == 0) {
                return j7;
            }
        }
        return j7;
    }

    public final void q() {
        while ((R() & 128) != 0) {
        }
    }

    public final Charset r() {
        if (C() >= 3) {
            byte[] bArr = this.f19419a;
            int i7 = this.f19420b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f19420b = i7 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (C() < 2) {
            return null;
        }
        byte[] bArr2 = this.f19419a;
        int i8 = this.f19420b;
        byte b8 = bArr2[i8];
        if (b8 == -2) {
            if (bArr2[i8 + 1] != -1) {
                return null;
            }
            this.f19420b = i8 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b8 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.f19420b = i8 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void z(int i7) {
        byte[] bArr = this.f19419a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        A(bArr, i7);
    }

    public y82() {
        this.f19419a = hi2.f9536b;
    }

    public y82(int i7) {
        this.f19419a = new byte[i7];
        this.f19421c = i7;
    }

    public y82(byte[] bArr) {
        this.f19419a = bArr;
        this.f19421c = bArr.length;
    }
}
