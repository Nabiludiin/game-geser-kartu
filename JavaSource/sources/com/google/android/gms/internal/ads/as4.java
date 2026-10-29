package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class as4 {

    /* renamed from: a, reason: collision with root package name */
    private xr4 f5274a = null;

    /* renamed from: b, reason: collision with root package name */
    private BigInteger f5275b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f5276c = null;

    /* synthetic */ as4(byte[] bArr) {
    }

    public final as4 a(xr4 xr4Var) {
        this.f5274a = xr4Var;
        return this;
    }

    public final as4 b(BigInteger bigInteger) {
        this.f5275b = bigInteger;
        return this;
    }

    public final as4 c(Integer num) {
        this.f5276c = num;
        return this;
    }

    public final bs4 d() {
        hw4 a8;
        if (this.f5274a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f5275b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        int c8 = this.f5274a.c();
        if (bitLength != c8) {
            StringBuilder sb = new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(c8).length());
            sb.append("Got modulus size ");
            sb.append(bitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(c8);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.f5274a.a() && this.f5276c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f5274a.a() && this.f5276c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f5274a.e() == wr4.f18395e) {
            a8 = xh4.f18842a;
        } else if (this.f5274a.e() == wr4.f18394d || this.f5274a.e() == wr4.f18393c) {
            a8 = xh4.a(this.f5276c.intValue());
        } else {
            if (this.f5274a.e() != wr4.f18392b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.f5274a.e())));
            }
            a8 = xh4.b(this.f5276c.intValue());
        }
        return new bs4(this.f5274a, this.f5275b, a8, this.f5276c, null);
    }
}
