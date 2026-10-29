package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: MyApplication */
public final class xr4 extends us4 {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f18985e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    private final int f18986a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f18987b;

    /* renamed from: c, reason: collision with root package name */
    private final wr4 f18988c;

    /* renamed from: d, reason: collision with root package name */
    private final vr4 f18989d;

    /* synthetic */ xr4(int i7, BigInteger bigInteger, wr4 wr4Var, vr4 vr4Var, byte[] bArr) {
        this.f18986a = i7;
        this.f18987b = bigInteger;
        this.f18988c = wr4Var;
        this.f18989d = vr4Var;
    }

    public static ur4 b() {
        return new ur4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f18988c != wr4.f18395e;
    }

    public final int c() {
        return this.f18986a;
    }

    public final BigInteger d() {
        return this.f18987b;
    }

    public final wr4 e() {
        return this.f18988c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr4)) {
            return false;
        }
        xr4 xr4Var = (xr4) obj;
        return xr4Var.f18986a == this.f18986a && Objects.equals(xr4Var.f18987b, this.f18987b) && xr4Var.f18988c == this.f18988c && xr4Var.f18989d == this.f18989d;
    }

    public final vr4 f() {
        return this.f18989d;
    }

    public final int hashCode() {
        return Objects.hash(xr4.class, Integer.valueOf(this.f18986a), this.f18987b, this.f18988c, this.f18989d);
    }

    public final String toString() {
        BigInteger bigInteger = this.f18987b;
        vr4 vr4Var = this.f18989d;
        String valueOf = String.valueOf(this.f18988c);
        String valueOf2 = String.valueOf(vr4Var);
        String valueOf3 = String.valueOf(bigInteger);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i7 = this.f18986a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i7).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i7);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
