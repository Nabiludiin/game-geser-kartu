package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class eq4 extends us4 {

    /* renamed from: a, reason: collision with root package name */
    private final bq4 f7757a;

    /* renamed from: b, reason: collision with root package name */
    private final zp4 f7758b;

    /* renamed from: c, reason: collision with root package name */
    private final aq4 f7759c;

    /* renamed from: d, reason: collision with root package name */
    private final dq4 f7760d;

    /* synthetic */ eq4(bq4 bq4Var, zp4 zp4Var, aq4 aq4Var, dq4 dq4Var, byte[] bArr) {
        this.f7757a = bq4Var;
        this.f7758b = zp4Var;
        this.f7759c = aq4Var;
        this.f7760d = dq4Var;
    }

    public static yp4 b() {
        return new yp4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f7760d != dq4.f7238e;
    }

    public final bq4 c() {
        return this.f7757a;
    }

    public final zp4 d() {
        return this.f7758b;
    }

    public final aq4 e() {
        return this.f7759c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eq4)) {
            return false;
        }
        eq4 eq4Var = (eq4) obj;
        return eq4Var.f7757a == this.f7757a && eq4Var.f7758b == this.f7758b && eq4Var.f7759c == this.f7759c && eq4Var.f7760d == this.f7760d;
    }

    public final dq4 f() {
        return this.f7760d;
    }

    public final int hashCode() {
        return Objects.hash(eq4.class, this.f7757a, this.f7758b, this.f7759c, this.f7760d);
    }

    public final String toString() {
        String obj = this.f7760d.toString();
        int length = obj.length();
        String obj2 = this.f7759c.toString();
        int length2 = obj2.length();
        String obj3 = this.f7757a.toString();
        int length3 = obj3.length();
        String obj4 = this.f7758b.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + obj4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(obj);
        sb.append(", hashType: ");
        sb.append(obj2);
        sb.append(", encoding: ");
        sb.append(obj3);
        sb.append(", curve: ");
        sb.append(obj4);
        sb.append(")");
        return sb.toString();
    }
}
