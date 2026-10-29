package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: MyApplication */
public class p25 implements Collection {

    /* renamed from: q, reason: collision with root package name */
    private final Collection f13643q;

    public p25(Collection collection) {
        q6.i.e(collection, "delegate");
        this.f13643q = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f13643q.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        q6.i.e(collection, "elements");
        return this.f13643q.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13643q.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new q25(this.f13643q.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.f13643q.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return q6.d.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        return q6.d.b(this, objArr);
    }
}
