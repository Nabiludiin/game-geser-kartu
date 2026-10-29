package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MyApplication */
final class w14 extends AbstractSequentialList implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final List f17987q;

    /* renamed from: r, reason: collision with root package name */
    final hx3 f17988r;

    w14(List list, hx3 hx3Var) {
        list.getClass();
        this.f17987q = list;
        this.f17988r = hx3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f17987q.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new v14(this, this.f17987q.listIterator(i7));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        this.f17987q.subList(i7, i8).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17987q.size();
    }
}
