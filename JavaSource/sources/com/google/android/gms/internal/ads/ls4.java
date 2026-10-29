package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ls4 {

    /* renamed from: a, reason: collision with root package name */
    private os4 f11776a = null;

    /* renamed from: b, reason: collision with root package name */
    private jw4 f11777b = null;

    /* renamed from: c, reason: collision with root package name */
    private jw4 f11778c = null;

    /* renamed from: d, reason: collision with root package name */
    private jw4 f11779d = null;

    /* renamed from: e, reason: collision with root package name */
    private jw4 f11780e = null;

    /* renamed from: f, reason: collision with root package name */
    private jw4 f11781f = null;

    /* renamed from: g, reason: collision with root package name */
    private jw4 f11782g = null;

    /* synthetic */ ls4(byte[] bArr) {
    }

    public final ls4 a(os4 os4Var) {
        this.f11776a = os4Var;
        return this;
    }

    public final ls4 b(jw4 jw4Var, jw4 jw4Var2) {
        this.f11778c = jw4Var;
        this.f11779d = jw4Var2;
        return this;
    }

    public final ls4 c(jw4 jw4Var) {
        this.f11777b = jw4Var;
        return this;
    }

    public final ls4 d(jw4 jw4Var, jw4 jw4Var2) {
        this.f11780e = jw4Var;
        this.f11781f = jw4Var2;
        return this;
    }

    public final ls4 e(jw4 jw4Var) {
        this.f11782g = jw4Var;
        return this;
    }

    public final ms4 f() {
        os4 os4Var = this.f11776a;
        if (os4Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.f11778c == null || this.f11779d == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.f11777b == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.f11780e == null || this.f11781f == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.f11782g == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger d8 = os4Var.f().d();
        BigInteger e8 = this.f11776a.e();
        BigInteger b8 = this.f11778c.b(z74.a());
        BigInteger b9 = this.f11779d.b(z74.a());
        BigInteger b10 = this.f11777b.b(z74.a());
        BigInteger b11 = this.f11780e.b(z74.a());
        BigInteger b12 = this.f11781f.b(z74.a());
        BigInteger b13 = this.f11782g.b(z74.a());
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
            return new ms4(this.f11776a, this.f11778c, this.f11779d, this.f11777b, this.f11780e, this.f11781f, this.f11782g, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
