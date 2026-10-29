package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class fj4 {

    /* renamed from: a, reason: collision with root package name */
    private nj4 f8285a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f8286b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8287c = null;

    /* synthetic */ fj4(byte[] bArr) {
    }

    public final fj4 a(nj4 nj4Var) {
        this.f8285a = nj4Var;
        return this;
    }

    public final fj4 b(kw4 kw4Var) {
        this.f8286b = kw4Var;
        return this;
    }

    public final fj4 c(Integer num) {
        this.f8287c = num;
        return this;
    }

    public final gj4 d() {
        kw4 kw4Var;
        hw4 a8;
        nj4 nj4Var = this.f8285a;
        if (nj4Var == null || (kw4Var = this.f8286b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nj4Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (nj4Var.a() && this.f8287c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8285a.a() && this.f8287c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f8285a.f() == mj4.f12281e) {
            a8 = xh4.f18842a;
        } else if (this.f8285a.f() == mj4.f12280d || this.f8285a.f() == mj4.f12279c) {
            a8 = xh4.a(this.f8287c.intValue());
        } else {
            if (this.f8285a.f() != mj4.f12278b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f8285a.f())));
            }
            a8 = xh4.b(this.f8287c.intValue());
        }
        return new gj4(this.f8285a, this.f8286b, a8, this.f8287c, null);
    }
}
