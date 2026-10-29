package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class yz3 extends AbstractSet {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ d04 f19931q;

    /* synthetic */ yz3(d04 d04Var, byte[] bArr) {
        Objects.requireNonNull(d04Var);
        this.f19931q = d04Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19931q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        d04 d04Var = this.f19931q;
        Map f8 = d04Var.f();
        if (f8 != null) {
            return f8.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int l7 = d04Var.l(entry.getKey());
            if (l7 != -1 && Objects.equals(d04Var.s(l7), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d04 d04Var = this.f19931q;
        Map f8 = d04Var.f();
        return f8 != null ? f8.entrySet().iterator() : new wz3(d04Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int k7;
        int e8;
        d04 d04Var = this.f19931q;
        Map f8 = d04Var.f();
        if (f8 != null) {
            return f8.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (d04Var.e() || (e8 = e04.e(entry.getKey(), entry.getValue(), (k7 = d04Var.k()), d04Var.n(), d04Var.o(), d04Var.p(), d04Var.q())) == -1) {
            return false;
        }
        d04Var.h(e8, k7);
        d04Var.x(d04Var.w() - 1);
        d04Var.g();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19931q.size();
    }
}
