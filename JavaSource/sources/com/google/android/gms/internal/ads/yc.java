package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class yc {

    /* renamed from: c, reason: collision with root package name */
    private boolean f19482c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19483d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19484e;

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f19480a = new ef2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f19485f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f19486g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f19487h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f19481b = new y82();

    yc() {
    }

    public static long e(y82 y82Var) {
        int F = y82Var.F();
        if (y82Var.C() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        y82Var.L(bArr, 0, 9);
        y82Var.G(F);
        byte b8 = bArr[0];
        if ((b8 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b9 = bArr[2];
        if ((b9 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[4];
        if ((b10 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j7 = b8;
        long j8 = b9;
        long j9 = (248 & j8) >> 3;
        long j10 = (bArr[1] & 255) << 20;
        long j11 = (j8 & 3) << 13;
        return j11 | j10 | ((j7 & 3) << 28) | (((j7 & 56) >> 3) << 30) | (j9 << 15) | ((bArr[3] & 255) << 5) | ((b10 & 248) >> 3);
    }

    private final int f(n2 n2Var) {
        byte[] bArr = hi2.f9536b;
        int length = bArr.length;
        this.f19481b.A(bArr, 0);
        this.f19482c = true;
        n2Var.k();
        return 0;
    }

    private static final int g(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public final boolean a() {
        return this.f19482c;
    }

    public final ef2 b() {
        return this.f19480a;
    }

    public final int c(n2 n2Var, n3 n3Var) {
        long j7 = -9223372036854775807L;
        if (!this.f19484e) {
            long q7 = n2Var.q();
            int min = (int) Math.min(20000L, q7);
            long j8 = q7 - min;
            if (n2Var.o() != j8) {
                n3Var.f12555a = j8;
                return 1;
            }
            y82 y82Var = this.f19481b;
            y82Var.z(min);
            n2Var.k();
            n2Var.u(y82Var.H(), 0, min);
            int F = y82Var.F();
            int D = y82Var.D() - 4;
            while (true) {
                if (D < F) {
                    break;
                }
                if (g(y82Var.H(), D) == 442) {
                    y82Var.G(D + 4);
                    long e8 = e(y82Var);
                    if (e8 != -9223372036854775807L) {
                        j7 = e8;
                        break;
                    }
                }
                D--;
            }
            this.f19486g = j7;
            this.f19484e = true;
            return 0;
        }
        if (this.f19486g == -9223372036854775807L) {
            f(n2Var);
            return 0;
        }
        if (this.f19483d) {
            long j9 = this.f19485f;
            if (j9 == -9223372036854775807L) {
                f(n2Var);
                return 0;
            }
            ef2 ef2Var = this.f19480a;
            this.f19487h = ef2Var.f(this.f19486g) - ef2Var.e(j9);
            f(n2Var);
            return 0;
        }
        int min2 = (int) Math.min(20000L, n2Var.q());
        if (n2Var.o() != 0) {
            n3Var.f12555a = 0L;
            return 1;
        }
        y82 y82Var2 = this.f19481b;
        y82Var2.z(min2);
        n2Var.k();
        n2Var.u(y82Var2.H(), 0, min2);
        int F2 = y82Var2.F();
        int D2 = y82Var2.D();
        while (true) {
            if (F2 >= D2 - 3) {
                break;
            }
            if (g(y82Var2.H(), F2) == 442) {
                y82Var2.G(F2 + 4);
                long e9 = e(y82Var2);
                if (e9 != -9223372036854775807L) {
                    j7 = e9;
                    break;
                }
            }
            F2++;
        }
        this.f19485f = j7;
        this.f19483d = true;
        return 0;
    }

    public final long d() {
        return this.f19487h;
    }
}
