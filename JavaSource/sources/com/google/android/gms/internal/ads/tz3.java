package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MyApplication */
abstract class tz3 extends AbstractCollection {

    /* renamed from: q, reason: collision with root package name */
    final Collection f16515q;

    /* renamed from: r, reason: collision with root package name */
    final sx3 f16516r;

    tz3(Collection collection, sx3 sx3Var) {
        this.f16515q = collection;
        this.f16516r = sx3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        rx3.a(this.f16516r.d(obj));
        return this.f16515q.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rx3.a(this.f16516r.d(it.next()));
        }
        return this.f16515q.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        k14.a(this.f16515q, this.f16516r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (uz3.a(this.f16515q, obj)) {
            return this.f16516r.d(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        sx3 sx3Var = this.f16516r;
        Iterator it = this.f16515q.iterator();
        rx3.k(sx3Var, "predicate");
        int i7 = 0;
        while (it.hasNext()) {
            if (sx3Var.d(it.next())) {
                return i7 == -1;
            }
            i7++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f16515q.iterator();
        it.getClass();
        sx3 sx3Var = this.f16516r;
        sx3Var.getClass();
        return new l14(it, sx3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f16515q.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f16515q.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f16516r.d(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f16515q.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f16516r.d(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f16515q.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f16516r.d(it.next())) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return x14.a(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return x14.a(iterator()).toArray(objArr);
    }
}
