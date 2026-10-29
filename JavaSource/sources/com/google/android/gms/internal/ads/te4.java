package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class te4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final u74 f16155a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16156b;

    private te4(u74 u74Var, byte[] bArr) {
        this.f16155a = u74Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f16156b = bArr;
    }

    public static u74 b(ch4 ch4Var) {
        byte[] c8;
        ri4 c9 = ch4Var.c(z74.a());
        u74 u74Var = (u74) pg4.a().c(c9.g(), u74.class).a(c9.b());
        uo4 d8 = c9.d();
        int ordinal = d8.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    c8 = xh4.f18842a.c();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(d8)));
                }
            }
            c8 = xh4.a(ch4Var.b().intValue()).c();
        } else {
            c8 = xh4.b(ch4Var.b().intValue()).c();
        }
        return new te4(u74Var, c8);
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f16156b;
        if (bArr3.length == 0) {
            return this.f16155a.a(bArr, bArr2);
        }
        if (ej4.e(bArr3, bArr)) {
            return this.f16155a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
