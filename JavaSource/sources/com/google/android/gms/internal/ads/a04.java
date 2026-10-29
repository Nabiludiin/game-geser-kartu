package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class a04 extends AbstractSet {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ d04 f4650q;

    /* synthetic */ a04(d04 d04Var, byte[] bArr) {
        Objects.requireNonNull(d04Var);
        this.f4650q = d04Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4650q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4650q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d04 d04Var = this.f4650q;
        Map f8 = d04Var.f();
        return f8 != null ? f8.keySet().iterator() : new vz3(d04Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        d04 d04Var = this.f4650q;
        Map f8 = d04Var.f();
        if (f8 != null) {
            return f8.keySet().remove(obj);
        }
        Object m7 = d04Var.m(obj);
        obj2 = d04.f6893z;
        return m7 != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4650q.size();
    }
}
