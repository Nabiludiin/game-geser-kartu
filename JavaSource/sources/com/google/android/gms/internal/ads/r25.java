package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class r25 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Iterator f14715q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Iterator f14716r;

    r25(Iterator it) {
        this.f14716r = it;
        this.f14715q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14715q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new t25((Map.Entry) this.f14716r.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
