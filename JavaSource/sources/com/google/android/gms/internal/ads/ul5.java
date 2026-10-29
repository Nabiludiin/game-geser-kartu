package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
public final class ul5 implements lk5 {
    protected ul5(tl5 tl5Var) {
    }

    protected static int a(int i7, int i8, int i9) {
        return m44.a(((i7 * i8) * i9) / 1000000);
    }

    protected static final int b(int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = 250000;
        if (i9 == 0) {
            int a8 = a(250000, i11, i10);
            int a9 = a(750000, i11, i10);
            String str = hi2.f9535a;
            return Math.max(a8, Math.min(i7 * 4, a9));
        }
        if (i9 == 1) {
            return m44.a((c(i8) * 50000000) / 1000000);
        }
        if (i8 == 5) {
            i13 = 500000;
        } else if (i8 == 8) {
            i13 = 1000000;
            i8 = 8;
        }
        return m44.a((i13 * (i12 != -1 ? e44.b(i12, 8, RoundingMode.CEILING) : c(i8))) / 1000000);
    }

    private static int c(int i7) {
        int f8 = q2.f(i7);
        rx3.h(f8 != -2147483647);
        return f8;
    }
}
