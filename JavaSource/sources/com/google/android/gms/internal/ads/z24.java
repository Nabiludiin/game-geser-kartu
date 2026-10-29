package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class z24 extends ty3 {

    /* renamed from: s, reason: collision with root package name */
    final Iterator f19995s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Set f19996t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Set f19997u;

    z24(a34 a34Var, Set set, Set set2) {
        this.f19996t = set;
        this.f19997u = set2;
        Objects.requireNonNull(a34Var);
        this.f19995s = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.ty3
    protected final Object b() {
        Set set;
        Object next;
        do {
            Iterator it = this.f19995s;
            if (!it.hasNext()) {
                d();
                return null;
            }
            set = this.f19997u;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
