package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: MyApplication */
final class dz3 extends gz3 implements NavigableSet {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ lz3 f7361t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz3(lz3 lz3Var, NavigableMap navigableMap) {
        super(lz3Var, navigableMap);
        Objects.requireNonNull(lz3Var);
        this.f7361t = lz3Var;
    }

    @Override // com.google.android.gms.internal.ads.gz3
    final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f4705q);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4705q)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new dz3(this.f7361t, ((NavigableMap) ((SortedMap) this.f4705q)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4705q)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.gz3, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4705q)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4705q)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return p14.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return p14.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.gz3, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.gz3, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new dz3(this.f7361t, ((NavigableMap) ((SortedMap) this.f4705q)).headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new dz3(this.f7361t, ((NavigableMap) ((SortedMap) this.f4705q)).subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new dz3(this.f7361t, ((NavigableMap) ((SortedMap) this.f4705q)).tailMap(obj, z7));
    }
}
