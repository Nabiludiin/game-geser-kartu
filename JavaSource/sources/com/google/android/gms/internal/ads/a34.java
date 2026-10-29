package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
final class a34 extends e34 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Set f4712q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Set f4713r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a34(Set set, Set set2) {
        super(null);
        this.f4712q = set;
        this.f4713r = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j34 iterator() {
        return new z24(this, this.f4712q, this.f4713r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4712q.contains(obj) && this.f4713r.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4712q.containsAll(collection) && this.f4713r.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.e34
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.e34
    final int g() {
        return Math.min(e34.h(this.f4712q), e34.h(this.f4713r));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f4713r, this.f4712q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f4712q.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f4713r.contains(it.next())) {
                i7++;
            }
        }
        return i7;
    }
}
