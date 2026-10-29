package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class az3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    Map.Entry f5409q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Iterator f5410r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ bz3 f5411s;

    az3(bz3 bz3Var, Iterator it) {
        this.f5410r = it;
        Objects.requireNonNull(bz3Var);
        this.f5411s = bz3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5410r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5410r.next();
        this.f5409q = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        rx3.i(this.f5409q != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f5409q.getValue();
        this.f5410r.remove();
        int size = collection.size();
        lz3 lz3Var = this.f5411s.f6135r;
        lz3Var.u(lz3Var.s() - size);
        collection.clear();
        this.f5409q = null;
    }
}
