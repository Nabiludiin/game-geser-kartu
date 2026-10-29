package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

final class r0 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private Iterator f20711q;

    public r0(Iterator it) {
        this.f20711q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20711q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f20711q.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20711q.remove();
    }
}
