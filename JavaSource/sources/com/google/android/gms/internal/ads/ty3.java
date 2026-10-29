package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public abstract class ty3 extends j34 {

    /* renamed from: q, reason: collision with root package name */
    private Object f16491q;

    /* renamed from: r, reason: collision with root package name */
    private int f16492r = 2;

    protected ty3() {
    }

    protected abstract Object b();

    protected final Object d() {
        this.f16492r = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        rx3.h(this.f16492r != 4);
        int i7 = this.f16492r;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.f16492r = 4;
            this.f16491q = b();
            if (this.f16492r != 3) {
                this.f16492r = 1;
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
        this.f16492r = 2;
        Object obj = this.f16491q;
        this.f16491q = null;
        return obj;
    }
}
