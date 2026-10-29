package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class gb4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final fb4 f8759a;

    private gb4(fb4 fb4Var) {
        this.f8759a = fb4Var;
    }

    public static gb4 b(fb4 fb4Var) {
        return new gb4(fb4Var);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f8759a != fb4.f8126d;
    }

    public final fb4 c() {
        return this.f8759a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gb4) && ((gb4) obj).f8759a == this.f8759a;
    }

    public final int hashCode() {
        return Objects.hash(gb4.class, this.f8759a);
    }

    public final String toString() {
        String obj = this.f8759a.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
