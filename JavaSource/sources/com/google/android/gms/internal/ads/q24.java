package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class q24 extends w04 {

    /* renamed from: v, reason: collision with root package name */
    static final w04 f14222v = new q24(new Object[0], 0);

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f14223t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f14224u;

    q24(Object[] objArr, int i7) {
        this.f14223t = objArr;
        this.f14224u = i7;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final Object[] e() {
        return this.f14223t;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        rx3.m(i7, this.f14224u, "index");
        Object obj = this.f14223t[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int h() {
        return this.f14224u;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w04, com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        Object[] objArr2 = this.f14223t;
        int i8 = this.f14224u;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14224u;
    }
}
