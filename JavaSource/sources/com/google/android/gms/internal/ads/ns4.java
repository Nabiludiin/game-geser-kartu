package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ns4 {

    /* renamed from: a, reason: collision with root package name */
    private ks4 f12889a = null;

    /* renamed from: b, reason: collision with root package name */
    private BigInteger f12890b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f12891c = null;

    /* synthetic */ ns4(byte[] bArr) {
    }

    public final ns4 a(ks4 ks4Var) {
        this.f12889a = ks4Var;
        return this;
    }

    public final ns4 b(BigInteger bigInteger) {
        this.f12890b = bigInteger;
        return this;
    }

    public final ns4 c(Integer num) {
        this.f12891c = num;
        return this;
    }

    public final os4 d() {
        hw4 a8;
        if (this.f12889a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f12890b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        int c8 = this.f12889a.c();
        if (bitLength != c8) {
            StringBuilder sb = new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(c8).length());
            sb.append("Got modulus size ");
            sb.append(bitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(c8);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.f12889a.a() && this.f12891c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f12889a.a() && this.f12891c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f12889a.e() == js4.f10743e) {
            a8 = xh4.f18842a;
        } else if (this.f12889a.e() == js4.f10742d || this.f12889a.e() == js4.f10741c) {
            a8 = xh4.a(this.f12891c.intValue());
        } else {
            if (this.f12889a.e() != js4.f10740b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.f12889a.e())));
            }
            a8 = xh4.b(this.f12891c.intValue());
        }
        return new os4(this.f12889a, this.f12890b, a8, this.f12891c, null);
    }
}
