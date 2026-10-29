package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class s0 extends f implements t0, RandomAccess {

    /* renamed from: s, reason: collision with root package name */
    private static final s0 f20737s;

    /* renamed from: t, reason: collision with root package name */
    private static final t0 f20738t;

    /* renamed from: r, reason: collision with root package name */
    private final List f20739r;

    static {
        s0 s0Var = new s0();
        f20737s = s0Var;
        s0Var.q0();
        f20738t = s0Var;
    }

    public s0() {
        this(10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).l() : m0.g((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final t0 A0() {
        return m0() ? new o2(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        c();
        this.f20739r.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f20739r.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        Object obj = this.f20739r.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String l7 = iVar.l();
            if (iVar.m()) {
                this.f20739r.set(i7, l7);
            }
            return l7;
        }
        byte[] bArr = (byte[]) obj;
        String g8 = m0.g(bArr);
        if (m0.e(bArr)) {
            this.f20739r.set(i7, g8);
        }
        return g8;
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.drive.f, com.google.android.gms.internal.drive.n0
    public final /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        c();
        return e(this.f20739r.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20739r.size();
    }

    @Override // com.google.android.gms.internal.drive.n0
    public final /* synthetic */ n0 w0(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f20739r);
        return new s0(arrayList);
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final List y0() {
        return Collections.unmodifiableList(this.f20739r);
    }

    @Override // com.google.android.gms.internal.drive.t0
    public final Object z0(int i7) {
        return this.f20739r.get(i7);
    }

    public s0(int i7) {
        this(new ArrayList(i7));
    }

    @Override // com.google.android.gms.internal.drive.f, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        c();
        if (collection instanceof t0) {
            collection = ((t0) collection).y0();
        }
        boolean addAll = this.f20739r.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        c();
        Object remove = this.f20739r.remove(i7);
        ((AbstractList) this).modCount++;
        return e(remove);
    }

    private s0(ArrayList arrayList) {
        this.f20739r = arrayList;
    }
}
