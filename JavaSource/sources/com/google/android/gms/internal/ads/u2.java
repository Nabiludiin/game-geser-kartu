package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class u2 {
    public static boolean a(y82 y82Var, z2 z2Var, int i7, t2 t2Var) {
        int F = y82Var.F();
        long Y = y82Var.Y();
        long j7 = Y >>> 16;
        if (j7 != i7) {
            return false;
        }
        boolean z7 = (j7 & 1) == 1;
        long j8 = Y >> 12;
        long j9 = Y >> 8;
        long j10 = Y >> 4;
        long j11 = Y >> 1;
        long j12 = Y & 1;
        int i8 = (int) (j10 & 15);
        if (i8 <= 7) {
            if (i8 != z2Var.f19986g - 1) {
                return false;
            }
        } else if (i8 > 10 || z2Var.f19986g != 2) {
            return false;
        }
        int i9 = (int) (j11 & 7);
        if ((i9 != 0 && i9 != z2Var.f19988i) || j12 == 1 || !d(y82Var, z2Var, z7, t2Var)) {
            return false;
        }
        long j13 = t2Var.f15947a;
        int c8 = c(y82Var, (int) (j8 & 15));
        long j14 = z2Var.f19989j;
        boolean z8 = j14 == 0 || j13 + ((long) c8) >= j14;
        if (c8 == -1) {
            return false;
        }
        if ((!z8 && c8 < z2Var.f19980a) || c8 > z2Var.f19981b) {
            return false;
        }
        int i10 = z2Var.f19984e;
        int i11 = (int) (j9 & 15);
        if (i11 != 0) {
            if (i11 <= 11) {
                if (i11 != z2Var.f19985f) {
                    return false;
                }
            } else if (i11 == 12) {
                if (y82Var.R() * 1000 != i10) {
                    return false;
                }
            } else {
                if (i11 > 14) {
                    return false;
                }
                int S = y82Var.S();
                if (i11 == 14) {
                    S *= 10;
                }
                if (S != i10) {
                    return false;
                }
            }
        }
        if (y82Var.R() != hi2.j(y82Var.H(), F, y82Var.F() - 1, 0)) {
            return false;
        }
        if (y82Var.C() != 0) {
            int M = y82Var.M();
            if ((M & 128) != 0) {
                return false;
            }
            int i12 = (M & f.j.M0) >> 1;
            if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i12);
                gv1.b("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long b(n2 n2Var, z2 z2Var) {
        n2Var.k();
        n2Var.P(1);
        byte[] bArr = new byte[1];
        n2Var.u(bArr, 0, 1);
        int i7 = bArr[0] & 1;
        boolean z7 = 1 == i7;
        n2Var.P(2);
        int i8 = 1 != i7 ? 6 : 7;
        y82 y82Var = new y82(i8);
        y82Var.E(q2.b(n2Var, y82Var.H(), 0, i8));
        n2Var.k();
        t2 t2Var = new t2();
        if (d(y82Var, z2Var, z7, t2Var)) {
            return t2Var.f15947a;
        }
        throw wi.b(null, null);
    }

    public static int c(y82 y82Var, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return y82Var.R() + 1;
            case 7:
                return y82Var.S() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    private static boolean d(y82 y82Var, z2 z2Var, boolean z7, t2 t2Var) {
        try {
            long o7 = y82Var.o();
            if (!z7) {
                o7 *= z2Var.f19981b;
            }
            long j7 = z2Var.f19989j;
            if (j7 != 0 && o7 > j7) {
                return false;
            }
            t2Var.f15947a = o7;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
