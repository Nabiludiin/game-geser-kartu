package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class t24 extends g14 {

    /* renamed from: s, reason: collision with root package name */
    private final transient z04 f15953s;

    /* renamed from: t, reason: collision with root package name */
    private final transient w04 f15954t;

    t24(z04 z04Var, w04 w04Var) {
        this.f15953s = z04Var;
        this.f15954t = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return this.f15954t.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15953s.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final w04 i() {
        return this.f15954t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f15954t.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        return this.f15954t.k(objArr, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15953s.size();
    }
}
