package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: MyApplication */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f8630a = new y82(10);

    private final boolean b(n2 n2Var, int i7) {
        int i8;
        int i9 = 0;
        do {
            int i10 = i9 % 10;
            if (i10 == 0) {
                if (i9 != 0) {
                    y82 y82Var = this.f8630a;
                    System.arraycopy(y82Var.H(), 10, y82Var.H(), 0, 9);
                }
                i8 = 0;
            } else {
                i8 = i10;
            }
            int i11 = i9 != 0 ? 1 : 10;
            try {
                y82 y82Var2 = this.f8630a;
                int i12 = i10 + 10;
                n2Var.u(y82Var2.H(), i12 - i11, i11);
                y82Var2.G(i8);
                y82Var2.E(i12);
                if (y82Var2.P() == 4801587) {
                    return true;
                }
                if (j3.a(y82Var2.Q()) != -1) {
                    return false;
                }
                if (i9 == 0) {
                    y82Var2.B(20);
                }
                i9++;
            } catch (EOFException unused) {
            }
        } while (i9 <= i7);
        return false;
    }

    public final le a(n2 n2Var, z5 z5Var, int i7) {
        le leVar = null;
        int i8 = 0;
        while (b(n2Var, i7)) {
            y82 y82Var = this.f8630a;
            int F = y82Var.F();
            y82Var.J(6);
            int g8 = y82Var.g();
            int i9 = g8 + 10;
            if (leVar == null) {
                byte[] bArr = new byte[i9];
                System.arraycopy(y82Var.H(), F, bArr, 0, 10);
                n2Var.u(bArr, 10, g8);
                leVar = c6.a(bArr, i9, z5Var, new n5());
            } else {
                n2Var.P(g8);
            }
            i8 += i9;
        }
        n2Var.k();
        n2Var.P(i8);
        return leVar;
    }
}
