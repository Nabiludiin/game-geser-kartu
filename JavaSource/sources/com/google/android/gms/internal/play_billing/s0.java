package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class s0 extends j0 {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ t0 f21732t;

    s0(t0 t0Var) {
        Objects.requireNonNull(t0Var);
        this.f21732t = t0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8;
        Object[] objArr;
        Object[] objArr2;
        t0 t0Var = this.f21732t;
        i8 = t0Var.f21745u;
        w.a(i7, i8, "index");
        objArr = t0Var.f21744t;
        int i9 = i7 + i7;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        objArr2 = t0Var.f21744t;
        Object obj2 = objArr2[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.f21732t.f21745u;
        return i7;
    }
}
