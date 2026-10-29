package com.google.android.gms.internal.drive;

import java.util.Iterator;

final class q2 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private Iterator f20708q;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ o2 f20709r;

    q2(o2 o2Var) {
        t0 t0Var;
        this.f20709r = o2Var;
        t0Var = o2Var.f20692q;
        this.f20708q = t0Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20708q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f20708q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
