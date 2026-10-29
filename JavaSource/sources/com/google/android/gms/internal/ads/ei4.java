package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class ei4 implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ List f7651q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ List f7652r;

    ei4(hi4 hi4Var, List list, List list2) {
        this.f7651q = list;
        this.f7652r = list2;
        Objects.requireNonNull(hi4Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gi4(this.f7651q.iterator(), this.f7652r.iterator(), null);
    }
}
