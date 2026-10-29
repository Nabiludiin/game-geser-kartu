package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class aa4 {

    /* renamed from: a, reason: collision with root package name */
    private ha4 f4848a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f4849b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4850c = null;

    /* synthetic */ aa4(byte[] bArr) {
    }

    public final aa4 a(ha4 ha4Var) {
        this.f4848a = ha4Var;
        return this;
    }

    public final aa4 b(kw4 kw4Var) {
        this.f4849b = kw4Var;
        return this;
    }

    public final aa4 c(Integer num) {
        this.f4850c = num;
        return this;
    }

    public final ba4 d() {
        kw4 kw4Var;
        hw4 b8;
        ha4 ha4Var = this.f4848a;
        if (ha4Var == null || (kw4Var = this.f4849b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ha4Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ha4Var.a() && this.f4850c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f4848a.a() && this.f4850c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f4848a.e() == ga4.f8750d) {
            b8 = xh4.f18842a;
        } else if (this.f4848a.e() == ga4.f8749c) {
            b8 = xh4.a(this.f4850c.intValue());
        } else {
            if (this.f4848a.e() != ga4.f8748b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f4848a.e())));
            }
            b8 = xh4.b(this.f4850c.intValue());
        }
        return new ba4(this.f4848a, this.f4849b, b8, this.f4850c, null);
    }
}
