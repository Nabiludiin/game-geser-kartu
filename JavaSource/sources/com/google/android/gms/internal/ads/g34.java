package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class g34 extends g14 {

    /* renamed from: s, reason: collision with root package name */
    final transient Object f8633s;

    g34(Object obj) {
        obj.getClass();
        this.f8633s = obj;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return new o14(this.f8633s);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8633s.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.g14, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8633s.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final w04 i() {
        return w04.n(this.f8633s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new o14(this.f8633s);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        objArr[i7] = this.f8633s;
        return i7 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f8633s.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append("[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
