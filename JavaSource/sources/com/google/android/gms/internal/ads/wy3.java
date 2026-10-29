package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class wy3 extends z14 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ yy3 f18474q;

    wy3(yy3 yy3Var) {
        Objects.requireNonNull(yy3Var);
        this.f18474q = yy3Var;
    }

    @Override // com.google.android.gms.internal.ads.z14
    final Map c() {
        return this.f18474q;
    }

    @Override // com.google.android.gms.internal.ads.z14, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return uz3.a(this.f18474q.f19918s.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new xy3(this.f18474q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        yy3 yy3Var = this.f18474q;
        yy3Var.f19919t.p(entry.getKey());
        return true;
    }
}
