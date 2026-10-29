package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: MyApplication */
public final class sl0 {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f15668a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f15669b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f15668a.toString();
        this.f15668a = this.f15668a.add(BigInteger.ONE);
        this.f15669b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f15669b;
    }
}
