package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class u implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f21392q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ v f21393r;

    u(v vVar) {
        Objects.requireNonNull(vVar);
        this.f21393r = vVar;
        this.f21392q = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21392q < this.f21393r.i().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        v vVar = this.f21393r;
        String i7 = vVar.i();
        int i8 = this.f21392q;
        if (i8 >= i7.length()) {
            throw new NoSuchElementException();
        }
        this.f21392q = i8 + 1;
        return new v(String.valueOf(vVar.i().charAt(i8)));
    }
}
