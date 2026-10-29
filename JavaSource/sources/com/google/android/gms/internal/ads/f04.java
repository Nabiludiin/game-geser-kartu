package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: MyApplication */
final class f04 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final Comparator f7945q;

    f04(Comparator comparator) {
        this.f7945q = comparator;
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7945q.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f04) {
            return this.f7945q.equals(((f04) obj).f7945q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7945q.hashCode();
    }

    public final String toString() {
        return this.f7945q.toString();
    }
}
