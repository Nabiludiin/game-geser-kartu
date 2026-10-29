package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class t implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f21381q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ v f21382r;

    t(v vVar) {
        Objects.requireNonNull(vVar);
        this.f21382r = vVar;
        this.f21381q = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21381q < this.f21382r.i().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String i7 = this.f21382r.i();
        int i8 = this.f21381q;
        if (i8 >= i7.length()) {
            throw new NoSuchElementException();
        }
        this.f21381q = i8 + 1;
        return new v(String.valueOf(i8));
    }
}
