package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class i0 extends j0 {

    /* renamed from: t, reason: collision with root package name */
    final transient int f21561t;

    /* renamed from: u, reason: collision with root package name */
    final transient int f21562u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ j0 f21563v;

    i0(j0 j0Var, int i7, int i8) {
        Objects.requireNonNull(j0Var);
        this.f21563v = j0Var;
        this.f21561t = i7;
        this.f21562u = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int e() {
        return this.f21563v.g() + this.f21561t + this.f21562u;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int g() {
        return this.f21563v.g() + this.f21561t;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        w.a(i7, this.f21562u, "index");
        return this.f21563v.get(i7 + this.f21561t);
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final Object[] j() {
        return this.f21563v.j();
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    /* renamed from: k */
    public final j0 subList(int i7, int i8) {
        w.d(i7, i8, this.f21562u);
        int i9 = this.f21561t;
        return this.f21563v.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21562u;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
