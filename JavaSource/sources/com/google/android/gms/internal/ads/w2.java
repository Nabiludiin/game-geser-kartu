package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class w2 {
    public static le a(n2 n2Var, boolean z7) {
        le a8 = new g3().a(n2Var, z7 ? null : c6.f6269a, 0);
        if (a8 == null || a8.a() == 0) {
            return null;
        }
        return a8;
    }

    public static boolean b(n2 n2Var, v2 v2Var) {
        n2Var.k();
        w72 w72Var = new w72(new byte[4], 4);
        n2Var.u(w72Var.f18098a, 0, 4);
        boolean i7 = w72Var.i();
        int j7 = w72Var.j(7);
        int j8 = w72Var.j(24) + 4;
        if (j7 == 0) {
            byte[] bArr = new byte[38];
            n2Var.s(bArr, 0, 38);
            v2Var.f17362a = new z2(bArr, 4);
            return i7;
        }
        z2 z2Var = v2Var.f17362a;
        if (z2Var == null) {
            throw new IllegalArgumentException();
        }
        if (j7 == 3) {
            y82 y82Var = new y82(j8);
            n2Var.s(y82Var.H(), 0, j8);
            v2Var.f17362a = z2Var.e(c(y82Var));
            return i7;
        }
        if (j7 == 4) {
            y82 y82Var2 = new y82(j8);
            n2Var.s(y82Var2.H(), 0, j8);
            y82Var2.J(4);
            v2Var.f17362a = new z2(z2Var.f19980a, z2Var.f19981b, z2Var.f19982c, z2Var.f19983d, z2Var.f19984e, z2Var.f19986g, z2Var.f19987h, z2Var.f19989j, z2Var.f19990k, z2Var.d(g4.c(Arrays.asList(g4.b(y82Var2, false, false).f6916a))));
            return i7;
        }
        if (j7 != 6) {
            n2Var.B(j8);
            return i7;
        }
        y82 y82Var3 = new y82(j8);
        n2Var.s(y82Var3.H(), 0, j8);
        y82Var3.J(4);
        v2Var.f17362a = new z2(z2Var.f19980a, z2Var.f19981b, z2Var.f19982c, z2Var.f19983d, z2Var.f19984e, z2Var.f19986g, z2Var.f19987h, z2Var.f19989j, z2Var.f19990k, z2Var.d(new le(w04.n(q5.b(y82Var3)))));
        return i7;
    }

    public static y2 c(y82 y82Var) {
        y82Var.J(1);
        int W = y82Var.W();
        long F = y82Var.F();
        long j7 = W;
        int i7 = W / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long d8 = y82Var.d();
            if (d8 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = d8;
            jArr2[i8] = y82Var.d();
            y82Var.J(2);
            i8++;
        }
        y82Var.J((int) ((F + j7) - y82Var.F()));
        return new y2(jArr, jArr2);
    }
}
