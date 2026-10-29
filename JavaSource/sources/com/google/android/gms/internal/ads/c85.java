package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
final class c85 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    int f6319q = 0;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ d85 f6320r;

    c85(d85 d85Var) {
        this.f6320r = d85Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f6319q;
        d85 d85Var = this.f6320r;
        return i7 < d85Var.f6983q.size() || d85Var.f6984r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f6319q;
        d85 d85Var = this.f6320r;
        List list = d85Var.f6983q;
        if (i7 >= list.size()) {
            list.add(d85Var.f6984r.next());
            return next();
        }
        int i8 = this.f6319q;
        this.f6319q = i8 + 1;
        return list.get(i8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
