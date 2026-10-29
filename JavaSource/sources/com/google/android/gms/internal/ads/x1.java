package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class x1 {
    public static void a(long j7, y82 y82Var, a4[] a4VarArr) {
        int i7;
        while (true) {
            if (y82Var.C() <= 1) {
                return;
            }
            int c8 = c(y82Var);
            int c9 = c(y82Var);
            int F = y82Var.F() + c9;
            if (c9 == -1 || c9 > y82Var.C()) {
                gv1.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                F = y82Var.D();
            } else if (c8 == 4 && c9 >= 8) {
                int R = y82Var.R();
                int S = y82Var.S();
                if (S == 49) {
                    i7 = y82Var.b();
                    S = 49;
                } else {
                    i7 = 0;
                }
                int R2 = y82Var.R();
                if (S == 47) {
                    y82Var.J(1);
                    S = 47;
                }
                boolean z7 = R == 181 && (S == 49 || S == 47) && R2 == 3;
                if (S == 49) {
                    z7 &= i7 == 1195456820;
                }
                if (z7) {
                    b(j7, y82Var, a4VarArr);
                }
            }
            y82Var.G(F);
        }
    }

    public static void b(long j7, y82 y82Var, a4[] a4VarArr) {
        int R = y82Var.R();
        if ((R & 64) != 0) {
            int i7 = R & 31;
            y82Var.J(1);
            int F = y82Var.F();
            for (a4 a4Var : a4VarArr) {
                int i8 = i7 * 3;
                y82Var.G(F);
                a4Var.e(y82Var, i8);
                rx3.h(j7 != -9223372036854775807L);
                a4Var.a(j7, 1, i8, 0, null);
            }
        }
    }

    private static int c(y82 y82Var) {
        int i7 = 0;
        while (y82Var.C() != 0) {
            int R = y82Var.R();
            i7 += R;
            if (R != 255) {
                return i7;
            }
        }
        return -1;
    }
}
