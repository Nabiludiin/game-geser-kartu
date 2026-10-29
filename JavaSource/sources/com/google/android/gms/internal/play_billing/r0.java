package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* compiled from: MyApplication */
final class r0 extends j0 {

    /* renamed from: v, reason: collision with root package name */
    static final j0 f21723v = new r0(new Object[0], 0);

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f21724t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f21725u;

    r0(Object[] objArr, int i7) {
        this.f21724t = objArr;
        this.f21725u = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, com.google.android.gms.internal.play_billing.g0
    final int c(Object[] objArr, int i7) {
        Object[] objArr2 = this.f21724t;
        int i8 = this.f21725u;
        System.arraycopy(objArr2, 0, objArr, 0, i8);
        return i8;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int e() {
        return this.f21725u;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        w.a(i7, this.f21725u, "index");
        Object obj = this.f21724t[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final Object[] j() {
        return this.f21724t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21725u;
    }
}
