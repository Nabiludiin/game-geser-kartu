package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class i14 extends g14 {

    /* renamed from: s, reason: collision with root package name */
    private final transient j14 f9806s;

    i14(j14 j14Var) {
        this.f9806s = j14Var;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return new a14(this.f9806s);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            j14 j14Var = this.f9806s;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) j14Var.t().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new a14(this.f9806s);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9806s.f7402u;
    }
}
