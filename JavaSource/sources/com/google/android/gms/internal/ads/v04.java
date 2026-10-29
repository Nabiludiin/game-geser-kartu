package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class v04 extends w04 {

    /* renamed from: t, reason: collision with root package name */
    final transient int f17343t;

    /* renamed from: u, reason: collision with root package name */
    final transient int f17344u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ w04 f17345v;

    v04(w04 w04Var, int i7, int i8) {
        Objects.requireNonNull(w04Var);
        this.f17345v = w04Var;
        this.f17343t = i7;
        this.f17344u = i8;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final Object[] e() {
        return this.f17345v.e();
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int g() {
        return this.f17345v.g() + this.f17343t;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        rx3.m(i7, this.f17344u, "index");
        return this.f17345v.get(i7 + this.f17343t);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int h() {
        return this.f17345v.g() + this.f17343t + this.f17344u;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: l */
    public final w04 subList(int i7, int i8) {
        rx3.o(i7, i8, this.f17344u);
        int i9 = this.f17343t;
        return this.f17345v.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17344u;
    }

    @Override // com.google.android.gms.internal.ads.w04, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
