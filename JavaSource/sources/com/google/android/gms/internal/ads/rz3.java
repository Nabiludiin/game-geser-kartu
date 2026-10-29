package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: MyApplication */
final class rz3 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final hx3 f15401q;

    /* renamed from: r, reason: collision with root package name */
    final p24 f15402r;

    rz3(hx3 hx3Var, p24 p24Var) {
        this.f15401q = hx3Var;
        this.f15402r = p24Var;
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        hx3 hx3Var = this.f15401q;
        return this.f15402r.compare(hx3Var.apply(obj), hx3Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rz3) {
            rz3 rz3Var = (rz3) obj;
            if (this.f15401q.equals(rz3Var.f15401q) && this.f15402r.equals(rz3Var.f15402r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15401q, this.f15402r);
    }

    public final String toString() {
        String obj = this.f15402r.toString();
        int length = obj.length();
        String obj2 = this.f15401q.toString();
        StringBuilder sb = new StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
