package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class u14 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: q, reason: collision with root package name */
    final List f16539q;

    /* renamed from: r, reason: collision with root package name */
    final hx3 f16540r;

    u14(List list, hx3 hx3Var) {
        list.getClass();
        this.f16539q = list;
        this.f16540r = hx3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f16540r.apply(this.f16539q.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f16539q.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new t14(this, this.f16539q.listIterator(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        return this.f16540r.apply(this.f16539q.remove(i7));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        this.f16539q.subList(i7, i8).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16539q.size();
    }
}
