package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
abstract class iz3 extends AbstractCollection {

    /* renamed from: q, reason: collision with root package name */
    final Object f10270q;

    /* renamed from: r, reason: collision with root package name */
    Collection f10271r;

    /* renamed from: s, reason: collision with root package name */
    final iz3 f10272s;

    /* renamed from: t, reason: collision with root package name */
    final Collection f10273t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ lz3 f10274u;

    iz3(lz3 lz3Var, Object obj, Collection collection, iz3 iz3Var) {
        Objects.requireNonNull(lz3Var);
        this.f10274u = lz3Var;
        this.f10270q = obj;
        this.f10271r = collection;
        this.f10272s = iz3Var;
        this.f10273t = iz3Var == null ? null : iz3Var.f10271r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f10271r.isEmpty();
        boolean add = this.f10271r.add(obj);
        if (add) {
            lz3 lz3Var = this.f10274u;
            lz3Var.u(lz3Var.s() + 1);
            if (isEmpty) {
                e();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f10271r.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f10271r.size();
        lz3 lz3Var = this.f10274u;
        lz3Var.u(lz3Var.s() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        e();
        return true;
    }

    final void b() {
        iz3 iz3Var = this.f10272s;
        if (iz3Var != null) {
            iz3Var.b();
        } else if (this.f10271r.isEmpty()) {
            lz3 lz3Var = this.f10274u;
            lz3Var.q().remove(this.f10270q);
        }
    }

    final void c() {
        iz3 iz3Var = this.f10272s;
        if (iz3Var != null) {
            iz3Var.c();
            if (iz3Var.f10271r != this.f10273t) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f10271r.isEmpty()) {
            lz3 lz3Var = this.f10274u;
            Collection collection = (Collection) lz3Var.q().get(this.f10270q);
            if (collection != null) {
                this.f10271r = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f10271r.clear();
        lz3 lz3Var = this.f10274u;
        lz3Var.u(lz3Var.s() - size);
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f10271r.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f10271r.containsAll(collection);
    }

    final void e() {
        iz3 iz3Var = this.f10272s;
        if (iz3Var != null) {
            iz3Var.e();
            return;
        }
        lz3 lz3Var = this.f10274u;
        lz3Var.q().put(this.f10270q, this.f10271r);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f10271r.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f10271r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new hz3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f10271r.remove(obj);
        if (remove) {
            this.f10274u.u(r0.s() - 1);
            b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f10271r.removeAll(collection);
        if (removeAll) {
            int size2 = this.f10271r.size();
            lz3 lz3Var = this.f10274u;
            lz3Var.u(lz3Var.s() + (size2 - size));
            b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f10271r.retainAll(collection);
        if (retainAll) {
            int size2 = this.f10271r.size();
            lz3 lz3Var = this.f10274u;
            lz3Var.u(lz3Var.s() + (size2 - size));
            b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f10271r.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f10271r.toString();
    }
}
