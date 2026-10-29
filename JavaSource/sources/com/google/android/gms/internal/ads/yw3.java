package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
abstract class yw3 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private Object f19891q;

    /* renamed from: r, reason: collision with root package name */
    private int f19892r = 2;

    protected yw3() {
    }

    protected abstract Object b();

    protected final Object d() {
        this.f19892r = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        rx3.h(this.f19892r != 4);
        int i7 = this.f19892r;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.f19892r = 4;
            this.f19891q = b();
            if (this.f19892r != 3) {
                this.f19892r = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19892r = 2;
        Object obj = this.f19891q;
        this.f19891q = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
