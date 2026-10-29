package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class w extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f20760b = Logger.getLogger(w.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f20761c = r2.r();

    /* renamed from: a, reason: collision with root package name */
    y f20762a;

    static class a extends w {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f20763d;

        /* renamed from: e, reason: collision with root package name */
        private final int f20764e;

        /* renamed from: f, reason: collision with root package name */
        private final int f20765f;

        /* renamed from: g, reason: collision with root package name */
        private int f20766g;

        a(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i8) | i8) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)));
            }
            this.f20763d = bArr;
            this.f20764e = 0;
            this.f20766g = 0;
            this.f20765f = i8;
        }

        private final void B0(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.f20763d, this.f20766g, i8);
                this.f20766g += i8;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), Integer.valueOf(i8)), e8);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void F(int i7, int i8) {
            z0((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void H(int i7, i iVar) {
            F(1, 3);
            a0(2, i7);
            h(3, iVar);
            F(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void I(int i7, boolean z7) {
            F(i7, 0);
            P(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void J(i1 i1Var) {
            z0(i1Var.b());
            i1Var.a(this);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void P(byte b8) {
            try {
                byte[] bArr = this.f20763d;
                int i7 = this.f20766g;
                this.f20766g = i7 + 1;
                bArr[i7] = b8;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void Q(int i7, int i8) {
            F(i7, 0);
            y0(i8);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void R(int i7, long j7) {
            F(i7, 1);
            r0(j7);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final int T() {
            return this.f20765f - this.f20766g;
        }

        @Override // com.google.android.gms.internal.drive.h
        public final void a(byte[] bArr, int i7, int i8) {
            B0(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void a0(int i7, int i8) {
            F(i7, 0);
            z0(i8);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void e0(int i7, int i8) {
            F(i7, 5);
            n(i8);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void g(int i7, long j7) {
            F(i7, 0);
            n0(j7);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void h(int i7, i iVar) {
            F(i7, 2);
            l(iVar);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void i(int i7, i1 i1Var) {
            F(1, 3);
            a0(2, i7);
            F(3, 2);
            J(i1Var);
            F(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.w
        final void j(int i7, i1 i1Var, u1 u1Var) {
            F(i7, 2);
            c cVar = (c) i1Var;
            int e8 = cVar.e();
            if (e8 == -1) {
                e8 = u1Var.a(cVar);
                cVar.f(e8);
            }
            z0(e8);
            u1Var.b(i1Var, this.f20762a);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void k(int i7, String str) {
            F(i7, 2);
            o0(str);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void l(i iVar) {
            z0(iVar.size());
            iVar.i(this);
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void n(int i7) {
            try {
                byte[] bArr = this.f20763d;
                int i8 = this.f20766g;
                int i9 = i8 + 1;
                this.f20766g = i9;
                bArr[i8] = (byte) i7;
                int i10 = i8 + 2;
                this.f20766g = i10;
                bArr[i9] = (byte) (i7 >> 8);
                int i11 = i8 + 3;
                this.f20766g = i11;
                bArr[i10] = (byte) (i7 >> 16);
                this.f20766g = i8 + 4;
                bArr[i11] = (byte) (i7 >>> 24);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void n0(long j7) {
            if (w.f20761c && T() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f20763d;
                    int i7 = this.f20766g;
                    this.f20766g = i7 + 1;
                    r2.i(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f20763d;
                int i8 = this.f20766g;
                this.f20766g = i8 + 1;
                r2.i(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f20763d;
                    int i9 = this.f20766g;
                    this.f20766g = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), 1), e8);
                }
            }
            byte[] bArr4 = this.f20763d;
            int i10 = this.f20766g;
            this.f20766g = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void o0(String str) {
            int i7 = this.f20766g;
            try {
                int q7 = w.q(str.length() * 3);
                int q8 = w.q(str.length());
                if (q8 != q7) {
                    z0(t2.a(str));
                    this.f20766g = t2.b(str, this.f20763d, this.f20766g, T());
                    return;
                }
                int i8 = i7 + q8;
                this.f20766g = i8;
                int b8 = t2.b(str, this.f20763d, i8, T());
                this.f20766g = i7;
                z0((b8 - i7) - q8);
                this.f20766g = b8;
            } catch (w2 e8) {
                this.f20766g = i7;
                m(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new b(e9);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void r0(long j7) {
            try {
                byte[] bArr = this.f20763d;
                int i7 = this.f20766g;
                int i8 = i7 + 1;
                this.f20766g = i8;
                bArr[i7] = (byte) j7;
                int i9 = i7 + 2;
                this.f20766g = i9;
                bArr[i8] = (byte) (j7 >> 8);
                int i10 = i7 + 3;
                this.f20766g = i10;
                bArr[i9] = (byte) (j7 >> 16);
                int i11 = i7 + 4;
                this.f20766g = i11;
                bArr[i10] = (byte) (j7 >> 24);
                int i12 = i7 + 5;
                this.f20766g = i12;
                bArr[i11] = (byte) (j7 >> 32);
                int i13 = i7 + 6;
                this.f20766g = i13;
                bArr[i12] = (byte) (j7 >> 40);
                int i14 = i7 + 7;
                this.f20766g = i14;
                bArr[i13] = (byte) (j7 >> 48);
                this.f20766g = i7 + 8;
                bArr[i14] = (byte) (j7 >> 56);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void y0(int i7) {
            if (i7 >= 0) {
                z0(i7);
            } else {
                n0(i7);
            }
        }

        @Override // com.google.android.gms.internal.drive.w
        public final void z0(int i7) {
            if (!w.f20761c || g.a() || T() < 5) {
                while ((i7 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f20763d;
                        int i8 = this.f20766g;
                        this.f20766g = i8 + 1;
                        bArr[i8] = (byte) ((i7 & 127) | 128);
                        i7 >>>= 7;
                    } catch (IndexOutOfBoundsException e8) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20766g), Integer.valueOf(this.f20765f), 1), e8);
                    }
                }
                byte[] bArr2 = this.f20763d;
                int i9 = this.f20766g;
                this.f20766g = i9 + 1;
                bArr2[i9] = (byte) i7;
                return;
            }
            if ((i7 & (-128)) == 0) {
                byte[] bArr3 = this.f20763d;
                int i10 = this.f20766g;
                this.f20766g = i10 + 1;
                r2.i(bArr3, i10, (byte) i7);
                return;
            }
            byte[] bArr4 = this.f20763d;
            int i11 = this.f20766g;
            this.f20766g = i11 + 1;
            r2.i(bArr4, i11, (byte) (i7 | 128));
            int i12 = i7 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr5 = this.f20763d;
                int i13 = this.f20766g;
                this.f20766g = i13 + 1;
                r2.i(bArr5, i13, (byte) i12);
                return;
            }
            byte[] bArr6 = this.f20763d;
            int i14 = this.f20766g;
            this.f20766g = i14 + 1;
            r2.i(bArr6, i14, (byte) (i12 | 128));
            int i15 = i7 >>> 14;
            if ((i15 & (-128)) == 0) {
                byte[] bArr7 = this.f20763d;
                int i16 = this.f20766g;
                this.f20766g = i16 + 1;
                r2.i(bArr7, i16, (byte) i15);
                return;
            }
            byte[] bArr8 = this.f20763d;
            int i17 = this.f20766g;
            this.f20766g = i17 + 1;
            r2.i(bArr8, i17, (byte) (i15 | 128));
            int i18 = i7 >>> 21;
            if ((i18 & (-128)) == 0) {
                byte[] bArr9 = this.f20763d;
                int i19 = this.f20766g;
                this.f20766g = i19 + 1;
                r2.i(bArr9, i19, (byte) i18);
                return;
            }
            byte[] bArr10 = this.f20763d;
            int i20 = this.f20766g;
            this.f20766g = i20 + 1;
            r2.i(bArr10, i20, (byte) (i18 | 128));
            byte[] bArr11 = this.f20763d;
            int i21 = this.f20766g;
            this.f20766g = i21 + 1;
            r2.i(bArr11, i21, (byte) (i7 >>> 28));
        }
    }

    public static class b extends IOException {
        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.w.b.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private w() {
    }

    public static int A(int i7, float f8) {
        return o(i7) + 4;
    }

    static int B(int i7, i1 i1Var, u1 u1Var) {
        return o(i7) + b(i1Var, u1Var);
    }

    public static int C(int i7, String str) {
        return o(i7) + p0(str);
    }

    public static int D(i iVar) {
        int size = iVar.size();
        return q(size) + size;
    }

    public static w E(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int K(int i7, i iVar) {
        int o7 = o(i7);
        int size = iVar.size();
        return o7 + q(size) + size;
    }

    static int L(int i7, i1 i1Var, u1 u1Var) {
        int o7 = o(i7) << 1;
        c cVar = (c) i1Var;
        int e8 = cVar.e();
        if (e8 == -1) {
            e8 = u1Var.a(cVar);
            cVar.f(e8);
        }
        return o7 + e8;
    }

    public static int M(int i7, boolean z7) {
        return o(i7) + 1;
    }

    public static int N(i1 i1Var) {
        int b8 = i1Var.b();
        return q(b8) + b8;
    }

    public static int O(byte[] bArr) {
        int length = bArr.length;
        return q(length) + length;
    }

    public static int W(int i7, long j7) {
        return o(i7) + t0(j7);
    }

    public static int X(int i7, i iVar) {
        return (o(1) << 1) + h0(2, i7) + K(3, iVar);
    }

    public static int Y(i1 i1Var) {
        return i1Var.b();
    }

    public static int Z(boolean z7) {
        return 1;
    }

    static int b(i1 i1Var, u1 u1Var) {
        c cVar = (c) i1Var;
        int e8 = cVar.e();
        if (e8 == -1) {
            e8 = u1Var.a(cVar);
            cVar.f(e8);
        }
        return q(e8) + e8;
    }

    public static int b0(int i7, long j7) {
        return o(i7) + t0(j7);
    }

    public static int d0(int i7, long j7) {
        return o(i7) + t0(x0(j7));
    }

    public static int f0(int i7, int i8) {
        return o(i7) + p(i8);
    }

    public static int g0(int i7, long j7) {
        return o(i7) + 8;
    }

    public static int h0(int i7, int i8) {
        return o(i7) + q(i8);
    }

    public static int i0(int i7, long j7) {
        return o(i7) + 8;
    }

    public static int j0(int i7, int i8) {
        return o(i7) + q(v(i8));
    }

    public static int k0(int i7, int i8) {
        return o(i7) + 4;
    }

    public static int l0(int i7, int i8) {
        return o(i7) + 4;
    }

    public static int m0(int i7, int i8) {
        return o(i7) + p(i8);
    }

    public static int o(int i7) {
        return q(i7 << 3);
    }

    public static int p(int i7) {
        if (i7 >= 0) {
            return q(i7);
        }
        return 10;
    }

    public static int p0(String str) {
        int length;
        try {
            length = t2.a(str);
        } catch (w2 unused) {
            length = str.getBytes(m0.f20655a).length;
        }
        return q(length) + length;
    }

    public static int q(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int r(int i7) {
        return q(v(i7));
    }

    public static int s(int i7) {
        return 4;
    }

    public static int s0(long j7) {
        return t0(j7);
    }

    public static int t(int i7) {
        return 4;
    }

    public static int t0(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int u(int i7) {
        return p(i7);
    }

    public static int u0(long j7) {
        return t0(x0(j7));
    }

    private static int v(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static int v0(long j7) {
        return 8;
    }

    public static int w(int i7) {
        return q(i7);
    }

    public static int w0(long j7) {
        return 8;
    }

    public static int x(double d8) {
        return 8;
    }

    private static long x0(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static int y(float f8) {
        return 4;
    }

    public static int z(int i7, double d8) {
        return o(i7) + 8;
    }

    public final void A0(int i7) {
        z0(v(i7));
    }

    public abstract void F(int i7, int i8);

    public final void G(int i7, long j7) {
        g(i7, x0(j7));
    }

    public abstract void H(int i7, i iVar);

    public abstract void I(int i7, boolean z7);

    public abstract void J(i1 i1Var);

    public abstract void P(byte b8);

    public abstract void Q(int i7, int i8);

    public abstract void R(int i7, long j7);

    public final void S(boolean z7) {
        P(z7 ? (byte) 1 : (byte) 0);
    }

    public abstract int T();

    public final void U() {
        if (T() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void a0(int i7, int i8);

    public final void c(double d8) {
        r0(Double.doubleToRawLongBits(d8));
    }

    public final void c0(int i7, int i8) {
        a0(i7, v(i8));
    }

    public final void d(float f8) {
        n(Float.floatToRawIntBits(f8));
    }

    public final void e(int i7, double d8) {
        R(i7, Double.doubleToRawLongBits(d8));
    }

    public abstract void e0(int i7, int i8);

    public final void f(int i7, float f8) {
        e0(i7, Float.floatToRawIntBits(f8));
    }

    public abstract void g(int i7, long j7);

    public abstract void h(int i7, i iVar);

    public abstract void i(int i7, i1 i1Var);

    abstract void j(int i7, i1 i1Var, u1 u1Var);

    public abstract void k(int i7, String str);

    public abstract void l(i iVar);

    final void m(String str, w2 w2Var) {
        f20760b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) w2Var);
        byte[] bytes = str.getBytes(m0.f20655a);
        try {
            z0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new b(e9);
        }
    }

    public abstract void n(int i7);

    public abstract void n0(long j7);

    public abstract void o0(String str);

    public final void q0(long j7) {
        n0(x0(j7));
    }

    public abstract void r0(long j7);

    public abstract void y0(int i7);

    public abstract void z0(int i7);
}
