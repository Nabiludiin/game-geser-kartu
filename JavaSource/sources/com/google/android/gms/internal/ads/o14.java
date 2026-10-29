package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
final class o14 extends j34 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f13161q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13162r;

    o14(Object obj) {
        this.f13161q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13162r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13162r) {
            throw new NoSuchElementException();
        }
        this.f13162r = true;
        return this.f13161q;
    }
}
