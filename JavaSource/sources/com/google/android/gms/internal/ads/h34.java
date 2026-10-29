package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
abstract class h34 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f9302q;

    h34(Iterator it) {
        it.getClass();
        this.f9302q = it;
    }

    abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9302q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f9302q.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9302q.remove();
    }
}
