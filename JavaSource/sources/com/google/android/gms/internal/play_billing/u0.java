package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: MyApplication */
final class u0 extends n0 {

    /* renamed from: s, reason: collision with root package name */
    private final transient m0 f21751s;

    /* renamed from: t, reason: collision with root package name */
    private final transient j0 f21752t;

    u0(m0 m0Var, j0 j0Var) {
        this.f21751s = m0Var;
        this.f21752t = j0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int c(Object[] objArr, int i7) {
        return this.f21752t.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21751s.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.n0, com.google.android.gms.internal.play_billing.g0
    public final j0 h() {
        return this.f21752t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f21752t.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21751s.size();
    }
}
