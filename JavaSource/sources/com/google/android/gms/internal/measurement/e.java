package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class e implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f20889q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ f f20890r;

    e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f20890r = fVar;
        this.f20889q = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20889q < this.f20890r.k();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        f fVar = this.f20890r;
        if (this.f20889q < fVar.k()) {
            int i7 = this.f20889q;
            this.f20889q = i7 + 1;
            return fVar.m(i7);
        }
        int i8 = this.f20889q;
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i8);
        throw new NoSuchElementException(sb.toString());
    }
}
