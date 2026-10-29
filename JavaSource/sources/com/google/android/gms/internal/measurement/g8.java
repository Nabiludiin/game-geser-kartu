package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: MyApplication */
final class g8 extends d9 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20976a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.k f20977b;

    g8(Context context, y4.k kVar) {
        this.f20976a = context;
        this.f20977b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.d9
    final Context a() {
        return this.f20976a;
    }

    @Override // com.google.android.gms.internal.measurement.d9
    final y4.k b() {
        return this.f20977b;
    }

    public final boolean equals(Object obj) {
        y4.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d9) {
            d9 d9Var = (d9) obj;
            if (this.f20976a.equals(d9Var.a()) && ((kVar = this.f20977b) != null ? kVar.equals(d9Var.b()) : d9Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f20976a.hashCode() ^ 1000003;
        y4.k kVar = this.f20977b;
        return (hashCode * 1000003) ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        String obj = this.f20976a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f20977b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
