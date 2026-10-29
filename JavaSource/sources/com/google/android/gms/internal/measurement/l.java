package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: MyApplication */
final class l implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Iterator f21084q;

    l(Iterator it) {
        this.f21084q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21084q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new v((String) this.f21084q.next());
    }
}
