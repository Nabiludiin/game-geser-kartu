package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class gi4 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private final Iterator f8938q;

    /* renamed from: r, reason: collision with root package name */
    private final Iterator f8939r;

    /* synthetic */ gi4(Iterator it, Iterator it2, byte[] bArr) {
        this.f8938q = it;
        this.f8939r = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8938q.hasNext() || this.f8939r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f8938q;
        return it.hasNext() ? it.next() : this.f8939r.next();
    }
}
