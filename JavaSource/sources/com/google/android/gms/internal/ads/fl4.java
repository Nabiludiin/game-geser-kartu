package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class fl4 implements r84 {
    private fl4(r84 r84Var, uo4 uo4Var, byte[] bArr) {
    }

    public static r84 a(ch4 ch4Var) {
        byte[] c8;
        ri4 c9 = ch4Var.c(z74.a());
        r84 r84Var = (r84) pg4.a().c(c9.g(), r84.class).a(c9.b());
        uo4 d8 = c9.d();
        int ordinal = d8.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    c8 = xh4.f18842a.c();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            c8 = xh4.a(ch4Var.b().intValue()).c();
        } else {
            c8 = xh4.b(ch4Var.b().intValue()).c();
        }
        return new fl4(r84Var, d8, c8);
    }
}
