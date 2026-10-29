package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class a14 extends j34 {

    /* renamed from: q, reason: collision with root package name */
    final Iterator f4680q;

    /* renamed from: r, reason: collision with root package name */
    Object f4681r;

    /* renamed from: s, reason: collision with root package name */
    Iterator f4682s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ e14 f4683t;

    a14(e14 e14Var) {
        Objects.requireNonNull(e14Var);
        this.f4683t = e14Var;
        this.f4680q = e14Var.f7401t.entrySet().i().listIterator(0);
        this.f4681r = null;
        this.f4682s = m14.f12022t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4682s.hasNext() || this.f4680q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f4682s.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4680q.next();
            this.f4681r = entry.getKey();
            this.f4682s = ((s04) entry.getValue()).c();
        }
        Object obj = this.f4681r;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f4682s.next());
    }
}
