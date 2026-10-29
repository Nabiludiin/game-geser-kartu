package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class qb4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14359a;

    /* renamed from: b, reason: collision with root package name */
    private final pb4 f14360b;

    private qb4(String str, pb4 pb4Var) {
        this.f14359a = str;
        this.f14360b = pb4Var;
    }

    public static qb4 b(String str, pb4 pb4Var) {
        return new qb4(str, pb4Var);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f14360b != pb4.f13792c;
    }

    public final String c() {
        return this.f14359a;
    }

    public final pb4 d() {
        return this.f14360b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qb4)) {
            return false;
        }
        qb4 qb4Var = (qb4) obj;
        return qb4Var.f14359a.equals(this.f14359a) && qb4Var.f14360b.equals(this.f14360b);
    }

    public final int hashCode() {
        return Objects.hash(qb4.class, this.f14359a, this.f14360b);
    }

    public final String toString() {
        String obj = this.f14360b.toString();
        String str = this.f14359a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
