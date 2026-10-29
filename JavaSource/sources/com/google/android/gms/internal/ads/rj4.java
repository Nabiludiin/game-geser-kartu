package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class rj4 {

    /* renamed from: a, reason: collision with root package name */
    private ck4 f14956a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f14957b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f14958c = null;

    /* synthetic */ rj4(byte[] bArr) {
    }

    public final rj4 a(ck4 ck4Var) {
        this.f14956a = ck4Var;
        return this;
    }

    public final rj4 b(kw4 kw4Var) {
        this.f14957b = kw4Var;
        return this;
    }

    public final rj4 c(Integer num) {
        this.f14958c = num;
        return this;
    }

    public final sj4 d() {
        kw4 kw4Var;
        hw4 a8;
        ck4 ck4Var = this.f14956a;
        if (ck4Var == null || (kw4Var = this.f14957b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ck4Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ck4Var.a() && this.f14958c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f14956a.a() && this.f14958c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f14956a.f() == bk4.f5843e) {
            a8 = xh4.f18842a;
        } else if (this.f14956a.f() == bk4.f5842d || this.f14956a.f() == bk4.f5841c) {
            a8 = xh4.a(this.f14958c.intValue());
        } else {
            if (this.f14956a.f() != bk4.f5840b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f14956a.f())));
            }
            a8 = xh4.b(this.f14958c.intValue());
        }
        return new sj4(this.f14956a, this.f14957b, a8, this.f14958c, null);
    }
}
