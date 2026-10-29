package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
class yy3 extends c24 {

    /* renamed from: s, reason: collision with root package name */
    final transient Map f19918s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ lz3 f19919t;

    yy3(lz3 lz3Var, Map map) {
        Objects.requireNonNull(lz3Var);
        this.f19919t = lz3Var;
        this.f19918s = map;
    }

    @Override // com.google.android.gms.internal.ads.c24
    protected final Set a() {
        return new wy3(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.f19919t.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        lz3 lz3Var = this.f19919t;
        if (this.f19918s == lz3Var.q()) {
            lz3Var.e();
        } else {
            p14.b(new xy3(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f19918s;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f19918s.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) d24.a(this.f19918s, obj);
        if (collection == null) {
            return null;
        }
        return this.f19919t.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f19918s.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f19919t.i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f19918s.remove(obj);
        if (collection == null) {
            return null;
        }
        lz3 lz3Var = this.f19919t;
        Collection l7 = lz3Var.l();
        l7.addAll(collection);
        lz3Var.u(lz3Var.s() - collection.size());
        collection.clear();
        return l7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19918s.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f19918s.toString();
    }
}
