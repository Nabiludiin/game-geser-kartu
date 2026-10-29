package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class bx4 extends AbstractSet {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ gx4 f6125q;

    bx4(gx4 gx4Var) {
        Objects.requireNonNull(gx4Var);
        this.f6125q = gx4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6125q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f6125q.c((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ax4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        gx4 gx4Var;
        fx4 c8;
        if (!(obj instanceof Map.Entry) || (c8 = (gx4Var = this.f6125q).c((Map.Entry) obj)) == null) {
            return false;
        }
        gx4Var.d(c8, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6125q.f9248t;
    }
}
