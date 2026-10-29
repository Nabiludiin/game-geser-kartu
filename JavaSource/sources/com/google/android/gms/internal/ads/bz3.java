package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
class bz3 extends a24 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ lz3 f6135r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bz3(lz3 lz3Var, Map map) {
        super(map);
        Objects.requireNonNull(lz3Var);
        this.f6135r = lz3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        p14.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4705q.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f4705q.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4705q.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.a24, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new az3(this, this.f4705q.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f4705q.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        lz3 lz3Var = this.f6135r;
        lz3Var.u(lz3Var.s() - size);
        return size > 0;
    }
}
