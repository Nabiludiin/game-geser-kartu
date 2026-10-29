package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class yp4 {

    /* renamed from: a, reason: collision with root package name */
    private bq4 f19714a = null;

    /* renamed from: b, reason: collision with root package name */
    private zp4 f19715b = null;

    /* renamed from: c, reason: collision with root package name */
    private aq4 f19716c = null;

    /* renamed from: d, reason: collision with root package name */
    private dq4 f19717d = dq4.f7238e;

    /* synthetic */ yp4(byte[] bArr) {
    }

    public final yp4 a(bq4 bq4Var) {
        this.f19714a = bq4Var;
        return this;
    }

    public final yp4 b(zp4 zp4Var) {
        this.f19715b = zp4Var;
        return this;
    }

    public final yp4 c(aq4 aq4Var) {
        this.f19716c = aq4Var;
        return this;
    }

    public final yp4 d(dq4 dq4Var) {
        this.f19717d = dq4Var;
        return this;
    }

    public final eq4 e() {
        bq4 bq4Var = this.f19714a;
        if (bq4Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zp4 zp4Var = this.f19715b;
        if (zp4Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        aq4 aq4Var = this.f19716c;
        if (aq4Var == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        dq4 dq4Var = this.f19717d;
        if (dq4Var == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zp4Var == zp4.f20273c && aq4Var != aq4.f5217b) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zp4Var == zp4.f20274d && aq4Var != aq4.f5218c && aq4Var != aq4.f5219d) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zp4Var != zp4.f20275e || aq4Var == aq4.f5219d) {
            return new eq4(bq4Var, zp4Var, aq4Var, dq4Var, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
