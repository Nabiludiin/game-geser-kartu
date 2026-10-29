package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class r24 extends w04 {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ s24 f14714t;

    r24(s24 s24Var) {
        Objects.requireNonNull(s24Var);
        this.f14714t = s24Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        s24 s24Var = this.f14714t;
        rx3.m(i7, s24Var.D(), "index");
        int i8 = i7 + i7;
        Object obj = s24Var.C()[i8];
        Objects.requireNonNull(obj);
        Object obj2 = s24Var.C()[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14714t.D();
    }
}
