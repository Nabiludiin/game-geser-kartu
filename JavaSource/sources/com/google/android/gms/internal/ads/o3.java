package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f13172a;

    /* renamed from: b, reason: collision with root package name */
    public final r3 f13173b;

    public o3(r3 r3Var, r3 r3Var2) {
        this.f13172a = r3Var;
        this.f13173b = r3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o3.class == obj.getClass()) {
            o3 o3Var = (o3) obj;
            if (this.f13172a.equals(o3Var.f13172a) && this.f13173b.equals(o3Var.f13173b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13172a.hashCode() * 31) + this.f13173b.hashCode();
    }

    public final String toString() {
        r3 r3Var = this.f13172a;
        r3 r3Var2 = this.f13173b;
        String obj = r3Var.toString();
        String concat = r3Var.equals(r3Var2) ? "" : ", ".concat(r3Var2.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
