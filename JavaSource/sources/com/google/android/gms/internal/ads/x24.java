package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: MyApplication */
final class x24 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    static final x24 f18524q = new x24();

    private x24() {
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
