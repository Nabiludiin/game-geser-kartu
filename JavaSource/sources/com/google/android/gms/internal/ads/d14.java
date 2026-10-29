package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class d14 extends s04 {

    /* renamed from: r, reason: collision with root package name */
    private final transient e14 f6909r;

    d14(e14 e14Var) {
        this.f6909r = e14Var;
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return new b14(this.f6909r);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6909r.g(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new b14(this.f6909r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        k34 listIterator = ((w04) this.f6909r.f7401t.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i7 = ((s04) listIterator.next()).k(objArr, i7);
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6909r.f7402u;
    }
}
