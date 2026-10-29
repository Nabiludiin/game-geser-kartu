package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ed4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final dd4 f7569a;

    private ed4(dd4 dd4Var) {
        this.f7569a = dd4Var;
    }

    public static ed4 b(dd4 dd4Var) {
        return new ed4(dd4Var);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f7569a != dd4.f7065d;
    }

    public final dd4 c() {
        return this.f7569a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ed4) && ((ed4) obj).f7569a == this.f7569a;
    }

    public final int hashCode() {
        return Objects.hash(ed4.class, this.f7569a);
    }

    public final String toString() {
        String obj = this.f7569a.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
