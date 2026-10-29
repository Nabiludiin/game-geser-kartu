package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: MyApplication */
final class q14 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final Comparator f14211q;

    q14(Comparator comparator) {
        this.f14211q = comparator;
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.f14211q.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q14) {
            return this.f14211q.equals(((q14) obj).f14211q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14211q.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.f14211q.toString().concat(".lexicographical()");
    }
}
