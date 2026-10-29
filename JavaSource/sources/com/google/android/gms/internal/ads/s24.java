package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class s24 extends g14 {

    /* renamed from: s, reason: collision with root package name */
    private final transient z04 f15439s;

    /* renamed from: t, reason: collision with root package name */
    private final transient Object[] f15440t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f15441u;

    s24(z04 z04Var, Object[] objArr, int i7, int i8) {
        this.f15439s = z04Var;
        this.f15440t = objArr;
        this.f15441u = i8;
    }

    final /* synthetic */ Object[] C() {
        return this.f15440t;
    }

    final /* synthetic */ int D() {
        return this.f15441u;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15439s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        return i().k(objArr, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15441u;
    }

    @Override // com.google.android.gms.internal.ads.g14
    final w04 v() {
        return new r24(this);
    }
}
