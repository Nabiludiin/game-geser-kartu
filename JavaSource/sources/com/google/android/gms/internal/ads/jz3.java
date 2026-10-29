package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class jz3 extends hz3 implements ListIterator {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ kz3 f10829t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jz3(kz3 kz3Var) {
        super(kz3Var);
        Objects.requireNonNull(kz3Var);
        this.f10829t = kz3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        kz3 kz3Var = this.f10829t;
        boolean isEmpty = kz3Var.isEmpty();
        b();
        ((ListIterator) this.f9771q).add(obj);
        lz3 lz3Var = kz3Var.f11304v;
        lz3Var.u(lz3Var.s() + 1);
        if (isEmpty) {
            kz3Var.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f9771q).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f9771q).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.f9771q).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f9771q).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f9771q).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jz3(kz3 kz3Var, int i7) {
        super(kz3Var, ((List) kz3Var.f10271r).listIterator(i7));
        Objects.requireNonNull(kz3Var);
        this.f10829t = kz3Var;
    }
}
