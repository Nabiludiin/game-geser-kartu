package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
class hz3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f9771q;

    /* renamed from: r, reason: collision with root package name */
    final Collection f9772r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ iz3 f9773s;

    hz3(iz3 iz3Var) {
        Objects.requireNonNull(iz3Var);
        this.f9773s = iz3Var;
        Collection collection = iz3Var.f10271r;
        this.f9772r = collection;
        this.f9771q = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void b() {
        iz3 iz3Var = this.f9773s;
        iz3Var.c();
        if (iz3Var.f10271r != this.f9772r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.f9771q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.f9771q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9771q.remove();
        iz3 iz3Var = this.f9773s;
        iz3Var.f10274u.u(r1.s() - 1);
        iz3Var.b();
    }

    hz3(iz3 iz3Var, Iterator it) {
        Objects.requireNonNull(iz3Var);
        this.f9773s = iz3Var;
        this.f9772r = iz3Var.f10271r;
        this.f9771q = it;
    }
}
