package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
abstract class d0 extends z0 {

    /* renamed from: q, reason: collision with root package name */
    private final int f21506q;

    /* renamed from: r, reason: collision with root package name */
    private int f21507r;

    protected d0(int i7, int i8) {
        w.b(i8, i7, "index");
        this.f21506q = i7;
        this.f21507r = i8;
    }

    protected abstract Object b(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21507r < this.f21506q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21507r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f21507r;
        this.f21507r = i7 + 1;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21507r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f21507r - 1;
        this.f21507r = i7;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21507r - 1;
    }
}
