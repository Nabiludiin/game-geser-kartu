package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public abstract class m9 {
    public static void a(n9 n9Var, r9 r9Var, th1 th1Var) {
        for (int i7 = 0; i7 < n9Var.a(); i7++) {
            long b8 = n9Var.b(i7);
            List c8 = n9Var.c(b8);
            if (!c8.isEmpty()) {
                if (i7 == n9Var.a() - 1) {
                    throw new IllegalStateException();
                }
                long b9 = n9Var.b(i7 + 1) - n9Var.b(i7);
                if (b9 > 0) {
                    th1Var.d(new k9(c8, b8, b9));
                }
            }
        }
    }
}
