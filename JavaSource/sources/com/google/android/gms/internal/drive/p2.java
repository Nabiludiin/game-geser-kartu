package com.google.android.gms.internal.drive;

import java.util.ListIterator;

final class p2 implements ListIterator {

    /* renamed from: q, reason: collision with root package name */
    private ListIterator f20693q;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ int f20694r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ o2 f20695s;

    p2(o2 o2Var, int i7) {
        t0 t0Var;
        this.f20695s = o2Var;
        this.f20694r = i7;
        t0Var = o2Var.f20692q;
        this.f20693q = t0Var.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f20693q.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20693q.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f20693q.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20693q.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f20693q.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20693q.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
