package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: MyApplication */
final class x83 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ e93 f18666q;

    x83(e93 e93Var) {
        Objects.requireNonNull(e93Var);
        this.f18666q = e93Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        v83 v83Var = (v83) obj;
        v83 v83Var2 = (v83) obj2;
        Object a8 = v83Var2.a();
        e93 e93Var = this.f18666q;
        int compare = Double.compare(e93.d(e93Var.s(a8)), e93.d(e93Var.s(v83Var.a())));
        return compare == 0 ? Long.compare(v83Var.d(), v83Var2.d()) : compare;
    }
}
