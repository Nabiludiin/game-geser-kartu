package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class s15 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f15432q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15433r;

    /* renamed from: s, reason: collision with root package name */
    private Iterator f15434s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ u15 f15435t;

    /* synthetic */ s15(u15 u15Var, byte[] bArr) {
        Objects.requireNonNull(u15Var);
        this.f15435t = u15Var;
        this.f15432q = -1;
    }

    private final Iterator b() {
        if (this.f15434s == null) {
            this.f15434s = this.f15435t.k().entrySet().iterator();
        }
        return this.f15434s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f15432q + 1;
        u15 u15Var = this.f15435t;
        if (i7 >= u15Var.j()) {
            return !u15Var.k().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f15433r = true;
        int i7 = this.f15432q + 1;
        this.f15432q = i7;
        u15 u15Var = this.f15435t;
        return i7 < u15Var.j() ? (r15) u15Var.i()[i7] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15433r) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15433r = false;
        u15 u15Var = this.f15435t;
        u15Var.h();
        int i7 = this.f15432q;
        if (i7 >= u15Var.j()) {
            b().remove();
        } else {
            this.f15432q = i7 - 1;
            u15Var.g(i7);
        }
    }
}
