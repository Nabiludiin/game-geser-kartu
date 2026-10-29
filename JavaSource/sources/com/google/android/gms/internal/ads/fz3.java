package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: MyApplication */
class fz3 extends yy3 implements SortedMap {

    /* renamed from: u, reason: collision with root package name */
    SortedSet f8556u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ lz3 f8557v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz3(lz3 lz3Var, SortedMap sortedMap) {
        super(lz3Var, sortedMap);
        Objects.requireNonNull(lz3Var);
        this.f8557v = lz3Var;
    }

    SortedSet c() {
        return new gz3(this.f8557v, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // com.google.android.gms.internal.ads.yy3, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f8556u;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c8 = c();
        this.f8556u = c8;
        return c8;
    }

    SortedMap e() {
        return (SortedMap) this.f19918s;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new fz3(this.f8557v, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new fz3(this.f8557v, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new fz3(this.f8557v, e().tailMap(obj));
    }
}
