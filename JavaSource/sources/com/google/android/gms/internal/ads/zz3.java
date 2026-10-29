package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
abstract class zz3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    int f20539q;

    /* renamed from: r, reason: collision with root package name */
    int f20540r;

    /* renamed from: s, reason: collision with root package name */
    int f20541s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ d04 f20542t;

    /* synthetic */ zz3(d04 d04Var, byte[] bArr) {
        Objects.requireNonNull(d04Var);
        this.f20542t = d04Var;
        this.f20539q = d04Var.v();
        this.f20540r = d04Var.i();
        this.f20541s = -1;
    }

    private final void d() {
        if (this.f20542t.v() != this.f20539q) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object b(int i7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20540r >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        d();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f20540r;
        this.f20541s = i7;
        Object b8 = b(i7);
        this.f20540r = this.f20542t.j(this.f20540r);
        return b8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        d();
        rx3.i(this.f20541s >= 0, "no calls to next() since the last call to remove()");
        this.f20539q += 32;
        int i7 = this.f20541s;
        d04 d04Var = this.f20542t;
        d04Var.remove(d04Var.r(i7));
        this.f20540r--;
        this.f20541s = -1;
    }
}
