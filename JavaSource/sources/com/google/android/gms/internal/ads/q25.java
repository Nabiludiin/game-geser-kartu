package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
public final class q25 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Iterator f14225q;

    public q25(Iterator it) {
        q6.i.e(it, "delegate");
        this.f14225q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14225q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f14225q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
