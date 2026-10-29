package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class q94 {

    /* renamed from: a, reason: collision with root package name */
    private z94 f14321a = null;

    /* renamed from: b, reason: collision with root package name */
    private kw4 f14322b = null;

    /* renamed from: c, reason: collision with root package name */
    private kw4 f14323c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f14324d = null;

    /* synthetic */ q94(byte[] bArr) {
    }

    public final q94 a(z94 z94Var) {
        this.f14321a = z94Var;
        return this;
    }

    public final q94 b(kw4 kw4Var) {
        this.f14322b = kw4Var;
        return this;
    }

    public final q94 c(kw4 kw4Var) {
        this.f14323c = kw4Var;
        return this;
    }

    public final q94 d(Integer num) {
        this.f14324d = num;
        return this;
    }

    public final r94 e() {
        hw4 b8;
        z94 z94Var = this.f14321a;
        if (z94Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        kw4 kw4Var = this.f14322b;
        if (kw4Var == null || this.f14323c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (z94Var.c() != kw4Var.d()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (z94Var.d() != this.f14323c.d()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f14321a.a() && this.f14324d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f14321a.a() && this.f14324d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f14321a.g() == y94.f19432d) {
            b8 = xh4.f18842a;
        } else if (this.f14321a.g() == y94.f19431c) {
            b8 = xh4.a(this.f14324d.intValue());
        } else {
            if (this.f14321a.g() != y94.f19430b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f14321a.g())));
            }
            b8 = xh4.b(this.f14324d.intValue());
        }
        return new r94(this.f14321a, this.f14322b, this.f14323c, b8, this.f14324d, null);
    }
}
