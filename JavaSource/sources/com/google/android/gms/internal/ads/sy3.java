package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
abstract class sy3 extends k34 {

    /* renamed from: q, reason: collision with root package name */
    private final int f15877q;

    /* renamed from: r, reason: collision with root package name */
    private int f15878r;

    protected sy3(int i7, int i8) {
        rx3.n(i8, i7, "index");
        this.f15877q = i7;
        this.f15878r = i8;
    }

    protected abstract Object b(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15878r < this.f15877q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15878r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f15878r;
        this.f15878r = i7 + 1;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15878r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f15878r - 1;
        this.f15878r = i7;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15878r - 1;
    }
}
