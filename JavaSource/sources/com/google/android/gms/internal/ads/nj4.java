package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class nj4 extends fk4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f12760a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12761b;

    /* renamed from: c, reason: collision with root package name */
    private final mj4 f12762c;

    /* synthetic */ nj4(int i7, int i8, mj4 mj4Var, byte[] bArr) {
        this.f12760a = i7;
        this.f12761b = i8;
        this.f12762c = mj4Var;
    }

    public static lj4 b() {
        return new lj4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f12762c != mj4.f12281e;
    }

    public final int c() {
        return this.f12760a;
    }

    public final int d() {
        return this.f12761b;
    }

    public final int e() {
        mj4 mj4Var = this.f12762c;
        if (mj4Var == mj4.f12281e) {
            return this.f12761b;
        }
        if (mj4Var == mj4.f12278b || mj4Var == mj4.f12279c || mj4Var == mj4.f12280d) {
            return this.f12761b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nj4)) {
            return false;
        }
        nj4 nj4Var = (nj4) obj;
        return nj4Var.f12760a == this.f12760a && nj4Var.e() == e() && nj4Var.f12762c == this.f12762c;
    }

    public final mj4 f() {
        return this.f12762c;
    }

    public final int hashCode() {
        return Objects.hash(nj4.class, Integer.valueOf(this.f12760a), Integer.valueOf(this.f12761b), this.f12762c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12762c);
        int length = valueOf.length();
        int i7 = this.f12761b;
        int length2 = String.valueOf(i7).length();
        int i8 = this.f12760a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i8).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte tags, and ");
        sb.append(i8);
        sb.append("-byte key)");
        return sb.toString();
    }
}
