package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ha4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9402b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9403c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final ga4 f9404d;

    /* synthetic */ ha4(int i7, int i8, int i9, ga4 ga4Var, byte[] bArr) {
        this.f9401a = i7;
        this.f9402b = i8;
        this.f9404d = ga4Var;
    }

    public static fa4 b() {
        return new fa4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f9404d != ga4.f8750d;
    }

    public final int c() {
        return this.f9401a;
    }

    public final int d() {
        return this.f9402b;
    }

    public final ga4 e() {
        return this.f9404d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ha4)) {
            return false;
        }
        ha4 ha4Var = (ha4) obj;
        return ha4Var.f9401a == this.f9401a && ha4Var.f9402b == this.f9402b && ha4Var.f9404d == this.f9404d;
    }

    public final int hashCode() {
        return Objects.hash(ha4.class, Integer.valueOf(this.f9401a), Integer.valueOf(this.f9402b), 16, this.f9404d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9404d);
        int length = valueOf.length();
        int i7 = this.f9402b;
        int length2 = String.valueOf(i7).length();
        int length3 = String.valueOf(16).length();
        int i8 = this.f9401a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i8).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i8);
        sb.append("-byte key)");
        return sb.toString();
    }
}
