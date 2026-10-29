package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class yr4 {

    /* renamed from: a, reason: collision with root package name */
    private bs4 f19748a = null;

    /* renamed from: b, reason: collision with root package name */
    private jw4 f19749b = null;

    /* renamed from: c, reason: collision with root package name */
    private jw4 f19750c = null;

    /* renamed from: d, reason: collision with root package name */
    private jw4 f19751d = null;

    /* renamed from: e, reason: collision with root package name */
    private jw4 f19752e = null;

    /* renamed from: f, reason: collision with root package name */
    private jw4 f19753f = null;

    /* renamed from: g, reason: collision with root package name */
    private jw4 f19754g = null;

    /* synthetic */ yr4(byte[] bArr) {
    }

    public final yr4 a(bs4 bs4Var) {
        this.f19748a = bs4Var;
        return this;
    }

    public final yr4 b(jw4 jw4Var, jw4 jw4Var2) {
        this.f19750c = jw4Var;
        this.f19751d = jw4Var2;
        return this;
    }

    public final yr4 c(jw4 jw4Var) {
        this.f19749b = jw4Var;
        return this;
    }

    public final yr4 d(jw4 jw4Var, jw4 jw4Var2) {
        this.f19752e = jw4Var;
        this.f19753f = jw4Var2;
        return this;
    }

    public final yr4 e(jw4 jw4Var) {
        this.f19754g = jw4Var;
        return this;
    }

    public final zr4 f() {
        bs4 bs4Var = this.f19748a;
        if (bs4Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.f19750c == null || this.f19751d == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.f19749b == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.f19752e == null || this.f19753f == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.f19754g == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger d8 = bs4Var.f().d();
        BigInteger e8 = this.f19748a.e();
        BigInteger b8 = this.f19750c.b(z74.a());
        BigInteger b9 = this.f19751d.b(z74.a());
        BigInteger b10 = this.f19749b.b(z74.a());
        BigInteger b11 = this.f19752e.b(z74.a());
        BigInteger b12 = this.f19753f.b(z74.a());
        BigInteger b13 = this.f19754g.b(z74.a());
        if (!b8.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!b9.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!b8.multiply(b9).equals(e8)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = b8.subtract(bigInteger);
        BigInteger subtract2 = b9.subtract(bigInteger);
        if (!d8.multiply(b10).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!d8.multiply(b11).mod(subtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!d8.multiply(b12).mod(subtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (b9.multiply(b13).mod(b8).equals(bigInteger)) {
            return new zr4(this.f19748a, this.f19750c, this.f19751d, this.f19749b, this.f19752e, this.f19753f, this.f19754g, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
