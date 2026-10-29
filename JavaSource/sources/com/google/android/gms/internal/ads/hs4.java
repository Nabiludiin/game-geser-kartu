package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class hs4 {

    /* renamed from: g, reason: collision with root package name */
    private static final BigInteger f9674g;

    /* renamed from: h, reason: collision with root package name */
    private static final BigInteger f9675h;

    /* renamed from: a, reason: collision with root package name */
    private Integer f9676a = null;

    /* renamed from: b, reason: collision with root package name */
    private BigInteger f9677b = ks4.f11224g;

    /* renamed from: c, reason: collision with root package name */
    private is4 f9678c = null;

    /* renamed from: d, reason: collision with root package name */
    private is4 f9679d = null;

    /* renamed from: e, reason: collision with root package name */
    private Integer f9680e = null;

    /* renamed from: f, reason: collision with root package name */
    private js4 f9681f = js4.f10743e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f9674g = valueOf;
        f9675h = valueOf.pow(256);
    }

    /* synthetic */ hs4(byte[] bArr) {
    }

    public final hs4 a(int i7) {
        this.f9676a = Integer.valueOf(i7);
        return this;
    }

    public final hs4 b(BigInteger bigInteger) {
        this.f9677b = bigInteger;
        return this;
    }

    public final hs4 c(js4 js4Var) {
        this.f9681f = js4Var;
        return this;
    }

    public final hs4 d(is4 is4Var) {
        this.f9678c = is4Var;
        return this;
    }

    public final hs4 e(is4 is4Var) {
        this.f9679d = is4Var;
        return this;
    }

    public final hs4 f(int i7) {
        if (i7 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i7)));
        }
        this.f9680e = Integer.valueOf(i7);
        return this;
    }

    public final ks4 g() {
        Integer num = this.f9676a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f9677b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f9678c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f9679d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f9681f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f9680e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f9676a, 2048));
        }
        if (this.f9678c != this.f9679d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f9677b;
        int compareTo = bigInteger.compareTo(ks4.f11224g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f9674g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f9675h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new ks4(this.f9676a.intValue(), this.f9677b, this.f9681f, this.f9678c, this.f9679d, this.f9680e.intValue(), null);
    }
}
