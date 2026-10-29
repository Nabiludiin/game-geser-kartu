package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class wc implements v1 {

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f18185a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f18186b = new y82();

    /* synthetic */ wc(ef2 ef2Var, byte[] bArr) {
        this.f18185a = ef2Var;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final t1 a(n2 n2Var, long j7) {
        int h8;
        long o7 = n2Var.o();
        int min = (int) Math.min(20000L, n2Var.q() - o7);
        y82 y82Var = this.f18186b;
        y82Var.z(min);
        n2Var.u(y82Var.H(), 0, min);
        int i7 = -1;
        int i8 = -1;
        long j8 = -9223372036854775807L;
        while (y82Var.C() >= 4) {
            if (xc.h(y82Var.H(), y82Var.F()) != 442) {
                y82Var.J(1);
            } else {
                y82Var.J(4);
                long e8 = yc.e(y82Var);
                if (e8 != -9223372036854775807L) {
                    long e9 = this.f18185a.e(e8);
                    if (e9 > j7) {
                        return j8 == -9223372036854775807L ? t1.a(e9, o7) : t1.c(o7 + i8);
                    }
                    if (100000 + e9 > j7) {
                        return t1.c(o7 + y82Var.F());
                    }
                    i8 = y82Var.F();
                    j8 = e9;
                }
                int D = y82Var.D();
                if (y82Var.C() >= 10) {
                    y82Var.J(9);
                    int R = y82Var.R() & 7;
                    if (y82Var.C() >= R) {
                        y82Var.J(R);
                        if (y82Var.C() >= 4) {
                            if (xc.h(y82Var.H(), y82Var.F()) == 443) {
                                y82Var.J(4);
                                int S = y82Var.S();
                                if (y82Var.C() < S) {
                                    y82Var.G(D);
                                } else {
                                    y82Var.J(S);
                                }
                            }
                            while (true) {
                                if (y82Var.C() < 4 || (h8 = xc.h(y82Var.H(), y82Var.F())) == 442 || h8 == 441 || (h8 >>> 8) != 1) {
                                    break;
                                }
                                y82Var.J(4);
                                if (y82Var.C() < 2) {
                                    y82Var.G(D);
                                    break;
                                }
                                y82Var.G(Math.min(y82Var.D(), y82Var.F() + y82Var.S()));
                            }
                        } else {
                            y82Var.G(D);
                        }
                    } else {
                        y82Var.G(D);
                    }
                } else {
                    y82Var.G(D);
                }
                i7 = y82Var.F();
            }
        }
        return j8 != -9223372036854775807L ? t1.b(j8, o7 + i7) : t1.f15934d;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final void b() {
        byte[] bArr = hi2.f9536b;
        int length = bArr.length;
        this.f18186b.A(bArr, 0);
    }
}
