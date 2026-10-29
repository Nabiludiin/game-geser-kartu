package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class d implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Iterator f20865q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Iterator f20866r;

    d(f fVar, Iterator it, Iterator it2) {
        this.f20865q = it;
        this.f20866r = it2;
        Objects.requireNonNull(fVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20865q.hasNext()) {
            return true;
        }
        return this.f20866r.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f20865q;
        if (it.hasNext()) {
            return new v(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f20866r;
        if (it2.hasNext()) {
            return new v((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
