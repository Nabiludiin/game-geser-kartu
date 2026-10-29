package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: MyApplication */
class gz3 extends bz3 implements SortedSet {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ lz3 f9262s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gz3(lz3 lz3Var, SortedMap sortedMap) {
        super(lz3Var, sortedMap);
        Objects.requireNonNull(lz3Var);
        this.f9262s = lz3Var;
    }

    SortedMap c() {
        return (SortedMap) this.f4705q;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new gz3(this.f9262s, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new gz3(this.f9262s, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new gz3(this.f9262s, c().tailMap(obj));
    }
}
