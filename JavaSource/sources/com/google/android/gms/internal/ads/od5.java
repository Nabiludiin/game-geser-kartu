package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: MyApplication */
public final class od5 {

    /* renamed from: a, reason: collision with root package name */
    private final km5 f13304a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f13305b;

    public od5(km5 km5Var, SparseArray sparseArray) {
        this.f13304a = km5Var;
        SparseArray sparseArray2 = new SparseArray(km5Var.b());
        for (int i7 = 0; i7 < km5Var.b(); i7++) {
            int c8 = km5Var.c(i7);
            nd5 nd5Var = (nd5) sparseArray.get(c8);
            nd5Var.getClass();
            sparseArray2.append(c8, nd5Var);
        }
        this.f13305b = sparseArray2;
    }

    public final nd5 a(int i7) {
        nd5 nd5Var = (nd5) this.f13305b.get(i7);
        nd5Var.getClass();
        return nd5Var;
    }

    public final boolean b(int i7) {
        return this.f13304a.a(i7);
    }

    public final int c() {
        return this.f13304a.b();
    }

    public final int d(int i7) {
        return this.f13304a.c(i7);
    }
}
