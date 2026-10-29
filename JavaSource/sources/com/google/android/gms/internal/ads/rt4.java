package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class rt4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private final v84 f15223a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15224b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f15225c;

    private rt4(v84 v84Var, byte[] bArr, byte[] bArr2) {
        this.f15223a = v84Var;
        this.f15224b = bArr;
        this.f15225c = bArr2;
    }

    public static v84 b(ch4 ch4Var) {
        ri4 c8 = ch4Var.c(z74.a());
        return new rt4((v84) pg4.a().c(c8.g(), v84.class).a(c8.b()), c(c8), d(c8));
    }

    static byte[] c(ri4 ri4Var) {
        int ordinal = ri4Var.d().ordinal();
        if (ordinal == 1) {
            return xh4.b(ri4Var.f().intValue()).c();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return xh4.f18842a.c();
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return xh4.a(ri4Var.f().intValue()).c();
    }

    static byte[] d(ri4 ri4Var) {
        return ri4Var.d().equals(uo4.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f15224b;
        int length = bArr3.length;
        if (length == 0 && this.f15225c.length == 0) {
            this.f15223a.a(bArr, bArr2);
        } else {
            if (!ej4.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f15225c;
            if (bArr4.length != 0) {
                bArr2 = tu4.a(bArr2, bArr4);
            }
            this.f15223a.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
