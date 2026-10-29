package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: MyApplication */
public final class hq4 {

    /* renamed from: a, reason: collision with root package name */
    private eq4 f9618a = null;

    /* renamed from: b, reason: collision with root package name */
    private ECPoint f9619b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f9620c = null;

    /* synthetic */ hq4(byte[] bArr) {
    }

    public final hq4 a(eq4 eq4Var) {
        this.f9618a = eq4Var;
        return this;
    }

    public final hq4 b(ECPoint eCPoint) {
        this.f9619b = eCPoint;
        return this;
    }

    public final hq4 c(Integer num) {
        this.f9620c = num;
        return this;
    }

    public final iq4 d() {
        hw4 a8;
        eq4 eq4Var = this.f9618a;
        if (eq4Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.f9619b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        gg4.a(eCPoint, eq4Var.d().a().getCurve());
        if (this.f9618a.a() && this.f9620c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f9618a.a() && this.f9620c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f9618a.f() == dq4.f7238e) {
            a8 = xh4.f18842a;
        } else if (this.f9618a.f() == dq4.f7237d || this.f9618a.f() == dq4.f7236c) {
            a8 = xh4.a(this.f9620c.intValue());
        } else {
            if (this.f9618a.f() != dq4.f7235b) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.f9618a.f().toString()));
            }
            a8 = xh4.b(this.f9620c.intValue());
        }
        return new iq4(this.f9618a, this.f9619b, a8, this.f9620c, null);
    }
}
