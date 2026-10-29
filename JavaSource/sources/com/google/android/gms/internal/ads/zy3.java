package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
abstract class zy3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f20526q;

    /* renamed from: r, reason: collision with root package name */
    Collection f20527r;

    /* renamed from: s, reason: collision with root package name */
    Iterator f20528s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ lz3 f20529t;

    zy3(lz3 lz3Var) {
        Objects.requireNonNull(lz3Var);
        this.f20529t = lz3Var;
        this.f20526q = lz3Var.q().entrySet().iterator();
        this.f20527r = null;
        this.f20528s = n14.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20526q.hasNext() || this.f20528s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f20528s.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f20526q.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f20527r = collection;
            this.f20528s = collection.iterator();
        }
        return this.f20528s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20528s.remove();
        Collection collection = this.f20527r;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f20526q.remove();
        }
        this.f20529t.u(r0.s() - 1);
    }
}
