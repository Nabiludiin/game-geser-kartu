package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class nz3 extends AbstractCollection {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ oz3 f13112q;

    nz3(oz3 oz3Var) {
        Objects.requireNonNull(oz3Var);
        this.f13112q = oz3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f13112q.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13112q.g(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13112q.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f13112q.h();
    }
}
