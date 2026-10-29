package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
final class h05 {
    h05() {
    }

    public static final List a(Object obj, long j7) {
        b05 b05Var = (b05) f25.v(obj, j7);
        if (b05Var.a()) {
            return b05Var;
        }
        int size = b05Var.size();
        b05 F = b05Var.F(size == 0 ? 10 : size + size);
        f25.w(obj, j7, F);
        return F;
    }
}
