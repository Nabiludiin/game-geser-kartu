package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class o2 extends AbstractList implements t0, RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    private final t0 f20692q;

    public o2(t0 t0Var) {
        this.f20692q = t0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return (String) this.f20692q.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new p2(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20692q.size();
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final List y0() {
        return this.f20692q.y0();
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final Object z0(int i7) {
        return this.f20692q.z0(i7);
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final t0 A0() {
        return this;
    }
}
