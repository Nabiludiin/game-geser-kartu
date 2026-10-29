package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class t0 extends n0 {

    /* renamed from: s, reason: collision with root package name */
    private final transient m0 f21743s;

    /* renamed from: t, reason: collision with root package name */
    private final transient Object[] f21744t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f21745u;

    t0(m0 m0Var, Object[] objArr, int i7, int i8) {
        this.f21743s = m0Var;
        this.f21744t = objArr;
        this.f21745u = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final int c(Object[] objArr, int i7) {
        return h().c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f21743s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    final j0 k() {
        return new s0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21745u;
    }
}
