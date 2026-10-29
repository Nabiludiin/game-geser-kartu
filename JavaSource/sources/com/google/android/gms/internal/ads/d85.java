package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public final class d85 extends AbstractList {

    /* renamed from: s, reason: collision with root package name */
    private static final e85 f6982s = e85.b(d85.class);

    /* renamed from: q, reason: collision with root package name */
    final List f6983q;

    /* renamed from: r, reason: collision with root package name */
    final Iterator f6984r;

    public d85(List list, Iterator it) {
        this.f6983q = list;
        this.f6984r = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        List list = this.f6983q;
        if (list.size() > i7) {
            return list.get(i7);
        }
        Iterator it = this.f6984r;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new c85(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        e85 e85Var = f6982s;
        e85Var.a("potentially expensive size() call");
        e85Var.a("blowup running");
        while (true) {
            Iterator it = this.f6984r;
            if (!it.hasNext()) {
                return this.f6983q.size();
            }
            this.f6983q.add(it.next());
        }
    }
}
