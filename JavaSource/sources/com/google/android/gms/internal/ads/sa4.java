package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class sa4 {

    /* renamed from: a, reason: collision with root package name */
    private ab4 f15524a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f15525b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f15526c = null;

    /* synthetic */ sa4(byte[] bArr) {
    }

    public final sa4 a(ab4 ab4Var) {
        this.f15524a = ab4Var;
        return this;
    }

    public final sa4 b(kw4 kw4Var) {
        this.f15525b = kw4Var;
        return this;
    }

    public final sa4 c(Integer num) {
        this.f15526c = num;
        return this;
    }

    public final ta4 d() {
        kw4 kw4Var;
        hw4 b8;
        ab4 ab4Var = this.f15524a;
        if (ab4Var == null || (kw4Var = this.f15525b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ab4Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ab4Var.a() && this.f15526c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f15524a.a() && this.f15526c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f15524a.d() == za4.f20107d) {
            b8 = xh4.f18842a;
        } else if (this.f15524a.d() == za4.f20106c) {
            b8 = xh4.a(this.f15526c.intValue());
        } else {
            if (this.f15524a.d() != za4.f20105b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f15524a.d())));
            }
            b8 = xh4.b(this.f15526c.intValue());
        }
        return new ta4(this.f15524a, this.f15525b, b8, this.f15526c, null);
    }
}
