package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class hd {

    /* renamed from: c, reason: collision with root package name */
    private boolean f9442c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9443d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9444e;

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f9440a = new ef2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f9445f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f9446g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f9447h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f9441b = new y82();

    hd(int i7) {
    }

    private final int e(n2 n2Var) {
        byte[] bArr = hi2.f9536b;
        int length = bArr.length;
        this.f9441b.A(bArr, 0);
        this.f9442c = true;
        n2Var.k();
        return 0;
    }

    public final boolean a() {
        return this.f9442c;
    }

    public final int b(n2 n2Var, n3 n3Var, int i7) {
        if (i7 <= 0) {
            e(n2Var);
            return 0;
        }
        long j7 = -9223372036854775807L;
        if (this.f9444e) {
            if (this.f9446g == -9223372036854775807L) {
                e(n2Var);
                return 0;
            }
            if (this.f9443d) {
                long j8 = this.f9445f;
                if (j8 == -9223372036854775807L) {
                    e(n2Var);
                    return 0;
                }
                ef2 ef2Var = this.f9440a;
                this.f9447h = ef2Var.f(this.f9446g) - ef2Var.e(j8);
                e(n2Var);
                return 0;
            }
            int min = (int) Math.min(112800L, n2Var.q());
            if (n2Var.o() != 0) {
                n3Var.f12555a = 0L;
                return 1;
            }
            y82 y82Var = this.f9441b;
            y82Var.z(min);
            n2Var.k();
            n2Var.u(y82Var.H(), 0, min);
            int F = y82Var.F();
            int D = y82Var.D();
            while (true) {
                if (F >= D) {
                    break;
                }
                if (y82Var.H()[F] == 71) {
                    long b8 = sd.b(y82Var, F, i7);
                    if (b8 != -9223372036854775807L) {
                        j7 = b8;
                        break;
                    }
                }
                F++;
            }
            this.f9445f = j7;
            this.f9443d = true;
            return 0;
        }
        long q7 = n2Var.q();
        int min2 = (int) Math.min(112800L, q7);
        long j9 = q7 - min2;
        if (n2Var.o() != j9) {
            n3Var.f12555a = j9;
            return 1;
        }
        y82 y82Var2 = this.f9441b;
        y82Var2.z(min2);
        n2Var.k();
        n2Var.u(y82Var2.H(), 0, min2);
        int F2 = y82Var2.F();
        int D2 = y82Var2.D();
        int i8 = D2 - 188;
        while (true) {
            if (i8 < F2) {
                break;
            }
            byte[] H = y82Var2.H();
            int i9 = -4;
            int i10 = 0;
            while (true) {
                if (i9 > 4) {
                    break;
                }
                int i11 = (i9 * 188) + i8;
                if (i11 < F2 || i11 >= D2 || H[i11] != 71) {
                    i10 = 0;
                } else {
                    i10++;
                    if (i10 == 5) {
                        long b9 = sd.b(y82Var2, i8, i7);
                        if (b9 != -9223372036854775807L) {
                            j7 = b9;
                            break;
                        }
                    }
                }
                i9++;
            }
            i8--;
        }
        this.f9446g = j7;
        this.f9444e = true;
        return 0;
    }

    public final long c() {
        return this.f9447h;
    }

    public final ef2 d() {
        return this.f9440a;
    }
}
