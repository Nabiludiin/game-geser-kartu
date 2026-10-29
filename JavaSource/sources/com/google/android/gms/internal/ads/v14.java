package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class v14 extends i34 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w14 f17355r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v14(w14 w14Var, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(w14Var);
        this.f17355r = w14Var;
    }

    @Override // com.google.android.gms.internal.ads.h34
    final Object b(Object obj) {
        return this.f17355r.f17988r.apply(obj);
    }
}
