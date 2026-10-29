package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class d0 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f22018q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ e0 f22019r;

    d0(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f22019r = e0Var;
        this.f22018q = e0Var.S0().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f22018q.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22018q.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
