package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class c04 extends AbstractCollection {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ d04 f6202q;

    /* synthetic */ c04(d04 d04Var, byte[] bArr) {
        Objects.requireNonNull(d04Var);
        this.f6202q = d04Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6202q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        d04 d04Var = this.f6202q;
        Map f8 = d04Var.f();
        return f8 != null ? f8.values().iterator() : new xz3(d04Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6202q.size();
    }
}
