package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class iy4 extends jy4 {

    /* renamed from: q, reason: collision with root package name */
    private int f10261q;

    /* renamed from: r, reason: collision with root package name */
    private final int f10262r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ qy4 f10263s;

    iy4(qy4 qy4Var) {
        Objects.requireNonNull(qy4Var);
        this.f10263s = qy4Var;
        this.f10261q = 0;
        this.f10262r = qy4Var.h();
    }

    @Override // com.google.android.gms.internal.ads.ly4
    public final byte a() {
        int i7 = this.f10261q;
        if (i7 >= this.f10262r) {
            throw new NoSuchElementException();
        }
        this.f10261q = i7 + 1;
        return this.f10263s.g(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10261q < this.f10262r;
    }
}
