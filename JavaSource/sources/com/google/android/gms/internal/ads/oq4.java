package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class oq4 extends us4 {

    /* renamed from: a, reason: collision with root package name */
    private final nq4 f13448a;

    private oq4(nq4 nq4Var) {
        this.f13448a = nq4Var;
    }

    public static oq4 b(nq4 nq4Var) {
        return new oq4(nq4Var);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f13448a != nq4.f12849e;
    }

    public final nq4 c() {
        return this.f13448a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oq4) && ((oq4) obj).f13448a == this.f13448a;
    }

    public final int hashCode() {
        return Objects.hash(oq4.class, this.f13448a);
    }

    public final String toString() {
        String obj = this.f13448a.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
