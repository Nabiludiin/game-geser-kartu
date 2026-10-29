package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: MyApplication */
final class y24 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final p24 f19345q;

    y24(p24 p24Var) {
        this.f19345q = p24Var;
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19345q.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y24) {
            return this.f19345q.equals(((y24) obj).f19345q);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19345q.hashCode();
    }

    public final String toString() {
        return this.f19345q.toString().concat(".reverse()");
    }
}
