package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class b14 extends j34 {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f5494q;

    /* renamed from: r, reason: collision with root package name */
    Iterator f5495r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ e14 f5496s;

    b14(e14 e14Var) {
        Objects.requireNonNull(e14Var);
        this.f5496s = e14Var;
        this.f5494q = ((w04) e14Var.f7401t.values()).listIterator(0);
        this.f5495r = m14.f12022t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5495r.hasNext() || this.f5494q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5495r.hasNext()) {
            this.f5495r = ((s04) this.f5494q.next()).c();
        }
        return this.f5495r.next();
    }
}
