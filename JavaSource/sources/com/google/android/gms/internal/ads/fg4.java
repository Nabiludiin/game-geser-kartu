package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: MyApplication */
final class fg4 {

    /* renamed from: d, reason: collision with root package name */
    static final fg4 f8246d;

    /* renamed from: a, reason: collision with root package name */
    final BigInteger f8247a;

    /* renamed from: b, reason: collision with root package name */
    final BigInteger f8248b;

    /* renamed from: c, reason: collision with root package name */
    final BigInteger f8249c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        f8246d = new fg4(bigInteger, bigInteger, BigInteger.ZERO);
    }

    fg4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f8247a = bigInteger;
        this.f8248b = bigInteger2;
        this.f8249c = bigInteger3;
    }

    final boolean a() {
        return this.f8249c.equals(BigInteger.ZERO);
    }
}
