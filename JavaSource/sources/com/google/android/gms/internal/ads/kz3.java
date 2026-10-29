package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: MyApplication */
class kz3 extends iz3 implements List {

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ lz3 f11304v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kz3(lz3 lz3Var, Object obj, List list, iz3 iz3Var) {
        super(lz3Var, obj, list, iz3Var);
        Objects.requireNonNull(lz3Var);
        this.f11304v = lz3Var;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        c();
        boolean isEmpty = this.f10271r.isEmpty();
        ((List) this.f10271r).add(i7, obj);
        lz3 lz3Var = this.f11304v;
        lz3Var.u(lz3Var.s() + 1);
        if (isEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f10271r).addAll(i7, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f10271r.size();
        lz3 lz3Var = this.f11304v;
        lz3Var.u(lz3Var.s() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        c();
        return ((List) this.f10271r).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f10271r).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f10271r).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new jz3(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        c();
        Object remove = ((List) this.f10271r).remove(i7);
        this.f11304v.u(r0.s() - 1);
        b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        c();
        return ((List) this.f10271r).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        c();
        List subList = ((List) this.f10271r).subList(i7, i8);
        iz3 iz3Var = this.f10272s;
        if (iz3Var == null) {
            iz3Var = this;
        }
        return this.f11304v.m(this.f10270q, subList, iz3Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        c();
        return new jz3(this, i7);
    }
}
