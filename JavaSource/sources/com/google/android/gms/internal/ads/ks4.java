package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ks4 extends us4 {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f11224g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    private final int f11225a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f11226b;

    /* renamed from: c, reason: collision with root package name */
    private final js4 f11227c;

    /* renamed from: d, reason: collision with root package name */
    private final is4 f11228d;

    /* renamed from: e, reason: collision with root package name */
    private final is4 f11229e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11230f;

    /* synthetic */ ks4(int i7, BigInteger bigInteger, js4 js4Var, is4 is4Var, is4 is4Var2, int i8, byte[] bArr) {
        this.f11225a = i7;
        this.f11226b = bigInteger;
        this.f11227c = js4Var;
        this.f11228d = is4Var;
        this.f11229e = is4Var2;
        this.f11230f = i8;
    }

    public static hs4 b() {
        return new hs4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f11227c != js4.f10743e;
    }

    public final int c() {
        return this.f11225a;
    }

    public final BigInteger d() {
        return this.f11226b;
    }

    public final js4 e() {
        return this.f11227c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ks4)) {
            return false;
        }
        ks4 ks4Var = (ks4) obj;
        return ks4Var.f11225a == this.f11225a && Objects.equals(ks4Var.f11226b, this.f11226b) && Objects.equals(ks4Var.f11227c, this.f11227c) && Objects.equals(ks4Var.f11228d, this.f11228d) && Objects.equals(ks4Var.f11229e, this.f11229e) && ks4Var.f11230f == this.f11230f;
    }

    public final is4 f() {
        return this.f11228d;
    }

    public final is4 g() {
        return this.f11229e;
    }

    public final int h() {
        return this.f11230f;
    }

    public final int hashCode() {
        return Objects.hash(ks4.class, Integer.valueOf(this.f11225a), this.f11226b, this.f11227c, this.f11228d, this.f11229e, Integer.valueOf(this.f11230f));
    }

    public final String toString() {
        BigInteger bigInteger = this.f11226b;
        is4 is4Var = this.f11229e;
        is4 is4Var2 = this.f11228d;
        String valueOf = String.valueOf(this.f11227c);
        String valueOf2 = String.valueOf(is4Var2);
        String valueOf3 = String.valueOf(is4Var);
        String valueOf4 = String.valueOf(bigInteger);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i7 = this.f11230f;
        int length4 = String.valueOf(i7).length();
        int length5 = valueOf4.length();
        int i8 = this.f11225a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i8).length() + 13);
        sb.append("RSA SSA PSS Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", signature hashType: ");
        sb.append(valueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(valueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i7);
        sb.append(", publicExponent: ");
        sb.append(valueOf4);
        sb.append(", and ");
        sb.append(i8);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
