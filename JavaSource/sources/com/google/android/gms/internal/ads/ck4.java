package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ck4 extends fk4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6486a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6487b;

    /* renamed from: c, reason: collision with root package name */
    private final bk4 f6488c;

    /* renamed from: d, reason: collision with root package name */
    private final ak4 f6489d;

    /* synthetic */ ck4(int i7, int i8, bk4 bk4Var, ak4 ak4Var, byte[] bArr) {
        this.f6486a = i7;
        this.f6487b = i8;
        this.f6488c = bk4Var;
        this.f6489d = ak4Var;
    }

    public static zj4 b() {
        return new zj4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f6488c != bk4.f5843e;
    }

    public final int c() {
        return this.f6486a;
    }

    public final int d() {
        return this.f6487b;
    }

    public final int e() {
        bk4 bk4Var = this.f6488c;
        if (bk4Var == bk4.f5843e) {
            return this.f6487b;
        }
        if (bk4Var == bk4.f5840b || bk4Var == bk4.f5841c || bk4Var == bk4.f5842d) {
            return this.f6487b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ck4)) {
            return false;
        }
        ck4 ck4Var = (ck4) obj;
        return ck4Var.f6486a == this.f6486a && ck4Var.e() == e() && ck4Var.f6488c == this.f6488c && ck4Var.f6489d == this.f6489d;
    }

    public final bk4 f() {
        return this.f6488c;
    }

    public final ak4 g() {
        return this.f6489d;
    }

    public final int hashCode() {
        return Objects.hash(ck4.class, Integer.valueOf(this.f6486a), Integer.valueOf(this.f6487b), this.f6488c, this.f6489d);
    }

    public final String toString() {
        ak4 ak4Var = this.f6489d;
        String valueOf = String.valueOf(this.f6488c);
        String valueOf2 = String.valueOf(ak4Var);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i7 = this.f6487b;
        int length3 = String.valueOf(i7).length();
        int i8 = this.f6486a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i8).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte tags, and ");
        sb.append(i8);
        sb.append("-byte key)");
        return sb.toString();
    }
}
