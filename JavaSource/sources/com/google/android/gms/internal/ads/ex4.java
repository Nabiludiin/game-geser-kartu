package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
abstract class ex4 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    fx4 f7862q;

    /* renamed from: r, reason: collision with root package name */
    fx4 f7863r;

    /* renamed from: s, reason: collision with root package name */
    int f7864s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ gx4 f7865t;

    ex4(gx4 gx4Var) {
        Objects.requireNonNull(gx4Var);
        this.f7865t = gx4Var;
        this.f7862q = gx4Var.f9250v.f8531t;
        this.f7863r = null;
        this.f7864s = gx4Var.f9249u;
    }

    final fx4 b() {
        gx4 gx4Var = this.f7865t;
        fx4 fx4Var = this.f7862q;
        if (fx4Var == gx4Var.f9250v) {
            throw new NoSuchElementException();
        }
        if (gx4Var.f9249u != this.f7864s) {
            throw new ConcurrentModificationException();
        }
        this.f7862q = fx4Var.f8531t;
        this.f7863r = fx4Var;
        return fx4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7862q != this.f7865t.f9250v;
    }

    @Override // java.util.Iterator
    public final void remove() {
        fx4 fx4Var = this.f7863r;
        if (fx4Var == null) {
            throw new IllegalStateException();
        }
        gx4 gx4Var = this.f7865t;
        gx4Var.d(fx4Var, true);
        this.f7863r = null;
        this.f7864s = gx4Var.f9249u;
    }
}
