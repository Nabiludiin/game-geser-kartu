package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: MyApplication */
public final class fq4 {

    /* renamed from: a, reason: collision with root package name */
    private iq4 f8414a = null;

    /* renamed from: b, reason: collision with root package name */
    private jw4 f8415b = null;

    /* synthetic */ fq4(byte[] bArr) {
    }

    public final fq4 a(iq4 iq4Var) {
        this.f8414a = iq4Var;
        return this;
    }

    public final fq4 b(jw4 jw4Var) {
        this.f8415b = jw4Var;
        return this;
    }

    public final gq4 c() {
        iq4 iq4Var = this.f8414a;
        if (iq4Var == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        jw4 jw4Var = this.f8415b;
        if (jw4Var == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger b8 = jw4Var.b(z74.a());
        ECPoint e8 = iq4Var.e();
        zp4 d8 = iq4Var.f().d();
        BigInteger order = d8.a().getOrder();
        if (b8.signum() <= 0 || b8.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (gg4.d(b8, d8.a()).equals(e8)) {
            return new gq4(this.f8414a, this.f8415b, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
