package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ch4 extends b84 {

    /* renamed from: a, reason: collision with root package name */
    private final ri4 f6437a;

    public ch4(ri4 ri4Var, w84 w84Var) {
        e(ri4Var, w84Var);
        this.f6437a = ri4Var;
    }

    private static void e(ri4 ri4Var, w84 w84Var) {
        int i7 = ah4.f4973b[ri4Var.c().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final s84 a() {
        ri4 ri4Var = this.f6437a;
        return new bh4(ri4Var.g(), ri4Var.d(), null);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f6437a.f();
    }

    public final ri4 c(w84 w84Var) {
        ri4 ri4Var = this.f6437a;
        e(ri4Var, w84Var);
        return ri4Var;
    }

    public final hw4 d() {
        ri4 ri4Var = this.f6437a;
        if (ri4Var.d().equals(uo4.RAW)) {
            return hw4.a(new byte[0]);
        }
        if (ri4Var.d().equals(uo4.TINK)) {
            return xh4.b(ri4Var.f().intValue());
        }
        if (ri4Var.d().equals(uo4.LEGACY) || ri4Var.d().equals(uo4.CRUNCHY)) {
            return xh4.a(ri4Var.f().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
