package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class u24 extends w04 {

    /* renamed from: t, reason: collision with root package name */
    private final transient Object[] f16561t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f16562u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f16563v;

    u24(Object[] objArr, int i7, int i8) {
        this.f16561t = objArr;
        this.f16562u = i7;
        this.f16563v = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        rx3.m(i7, this.f16563v, "index");
        Object obj = this.f16561t[i7 + i7 + this.f16562u];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16563v;
    }
}
