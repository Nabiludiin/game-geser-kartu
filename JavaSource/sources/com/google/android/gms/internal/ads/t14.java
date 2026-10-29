package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class t14 extends i34 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u14 f15945r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t14(u14 u14Var, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(u14Var);
        this.f15945r = u14Var;
    }

    @Override // com.google.android.gms.internal.ads.h34
    final Object b(Object obj) {
        return this.f15945r.f16540r.apply(obj);
    }
}
