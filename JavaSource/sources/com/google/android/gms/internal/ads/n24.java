package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: MyApplication */
final class n24 extends p24 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    static final n24 f12554q = new n24();

    private n24() {
    }

    @Override // com.google.android.gms.internal.ads.p24
    public final p24 a() {
        return x24.f18524q;
    }

    @Override // com.google.android.gms.internal.ads.p24, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
