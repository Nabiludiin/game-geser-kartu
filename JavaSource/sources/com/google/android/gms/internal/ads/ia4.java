package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ia4 {

    /* renamed from: a, reason: collision with root package name */
    private ra4 f9943a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f9944b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f9945c = null;

    /* synthetic */ ia4(byte[] bArr) {
    }

    public final ia4 a(ra4 ra4Var) {
        this.f9943a = ra4Var;
        return this;
    }

    public final ia4 b(kw4 kw4Var) {
        this.f9944b = kw4Var;
        return this;
    }

    public final ia4 c(Integer num) {
        this.f9945c = num;
        return this;
    }

    public final ja4 d() {
        kw4 kw4Var;
        hw4 b8;
        ra4 ra4Var = this.f9943a;
        if (ra4Var == null || (kw4Var = this.f9944b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ra4Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ra4Var.a() && this.f9945c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f9943a.a() && this.f9945c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f9943a.d() == qa4.f14348d) {
            b8 = xh4.f18842a;
        } else if (this.f9943a.d() == qa4.f14347c) {
            b8 = xh4.a(this.f9945c.intValue());
        } else {
            if (this.f9943a.d() != qa4.f14346b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f9943a.d())));
            }
            b8 = xh4.b(this.f9945c.intValue());
        }
        return new ja4(this.f9943a, this.f9944b, b8, this.f9945c, null);
    }
}
