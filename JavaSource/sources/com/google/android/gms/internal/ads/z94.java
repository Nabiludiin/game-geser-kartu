package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class z94 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final int f20083a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20084b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20085c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20086d;

    /* renamed from: e, reason: collision with root package name */
    private final y94 f20087e;

    /* renamed from: f, reason: collision with root package name */
    private final x94 f20088f;

    /* synthetic */ z94(int i7, int i8, int i9, int i10, y94 y94Var, x94 x94Var, byte[] bArr) {
        this.f20083a = i7;
        this.f20084b = i8;
        this.f20085c = i9;
        this.f20086d = i10;
        this.f20087e = y94Var;
        this.f20088f = x94Var;
    }

    public static w94 b() {
        return new w94(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f20087e != y94.f19432d;
    }

    public final int c() {
        return this.f20083a;
    }

    public final int d() {
        return this.f20084b;
    }

    public final int e() {
        return this.f20086d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z94)) {
            return false;
        }
        z94 z94Var = (z94) obj;
        return z94Var.f20083a == this.f20083a && z94Var.f20084b == this.f20084b && z94Var.f20085c == this.f20085c && z94Var.f20086d == this.f20086d && z94Var.f20087e == this.f20087e && z94Var.f20088f == this.f20088f;
    }

    public final int f() {
        return this.f20085c;
    }

    public final y94 g() {
        return this.f20087e;
    }

    public final x94 h() {
        return this.f20088f;
    }

    public final int hashCode() {
        return Objects.hash(z94.class, Integer.valueOf(this.f20083a), Integer.valueOf(this.f20084b), Integer.valueOf(this.f20085c), Integer.valueOf(this.f20086d), this.f20087e, this.f20088f);
    }

    public final String toString() {
        x94 x94Var = this.f20088f;
        String valueOf = String.valueOf(this.f20087e);
        String valueOf2 = String.valueOf(x94Var);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i7 = this.f20085c;
        int length3 = String.valueOf(i7).length();
        int i8 = this.f20086d;
        int length4 = String.valueOf(i8).length();
        int i9 = this.f20083a;
        int length5 = String.valueOf(i9).length();
        int i10 = this.f20084b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i10).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte IV, and ");
        sb.append(i8);
        sb.append("-byte tags, and ");
        sb.append(i9);
        sb.append("-byte AES key, and ");
        sb.append(i10);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
