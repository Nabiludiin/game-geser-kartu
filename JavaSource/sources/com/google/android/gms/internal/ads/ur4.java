package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class ur4 {

    /* renamed from: e, reason: collision with root package name */
    private static final BigInteger f16933e;

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f16934f;

    /* renamed from: a, reason: collision with root package name */
    private Integer f16935a = null;

    /* renamed from: b, reason: collision with root package name */
    private BigInteger f16936b = xr4.f18985e;

    /* renamed from: c, reason: collision with root package name */
    private vr4 f16937c = null;

    /* renamed from: d, reason: collision with root package name */
    private wr4 f16938d = wr4.f18395e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f16933e = valueOf;
        f16934f = valueOf.pow(256);
    }

    /* synthetic */ ur4(byte[] bArr) {
    }

    public final ur4 a(int i7) {
        this.f16935a = Integer.valueOf(i7);
        return this;
    }

    public final ur4 b(BigInteger bigInteger) {
        this.f16936b = bigInteger;
        return this;
    }

    public final ur4 c(wr4 wr4Var) {
        this.f16938d = wr4Var;
        return this;
    }

    public final ur4 d(vr4 vr4Var) {
        this.f16937c = vr4Var;
        return this;
    }

    public final xr4 e() {
        Integer num = this.f16935a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f16936b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f16937c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f16938d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f16935a));
        }
        BigInteger bigInteger = this.f16936b;
        int compareTo = bigInteger.compareTo(xr4.f18985e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f16933e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f16934f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new xr4(this.f16935a.intValue(), this.f16936b, this.f16938d, this.f16937c, null);
    }
}
