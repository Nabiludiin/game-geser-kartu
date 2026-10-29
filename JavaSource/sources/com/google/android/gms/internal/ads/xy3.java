package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class xy3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f19305q;

    /* renamed from: r, reason: collision with root package name */
    Collection f19306r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ yy3 f19307s;

    xy3(yy3 yy3Var) {
        Objects.requireNonNull(yy3Var);
        this.f19307s = yy3Var;
        this.f19305q = yy3Var.f19918s.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19305q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f19305q.next();
        this.f19306r = (Collection) entry.getValue();
        return this.f19307s.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        rx3.i(this.f19306r != null, "no calls to next() since the last call to remove()");
        this.f19305q.remove();
        int size = this.f19306r.size();
        lz3 lz3Var = this.f19307s.f19919t;
        lz3Var.u(lz3Var.s() - size);
        this.f19306r.clear();
        this.f19306r = null;
    }
}
