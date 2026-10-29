package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class v9 extends w9 {

    /* renamed from: q, reason: collision with root package name */
    private int f21412q;

    /* renamed from: r, reason: collision with root package name */
    private final int f21413r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ca f21414s;

    v9(ca caVar) {
        Objects.requireNonNull(caVar);
        this.f21414s = caVar;
        this.f21412q = 0;
        this.f21413r = caVar.g();
    }

    @Override // com.google.android.gms.internal.measurement.y9
    public final byte a() {
        int i7 = this.f21412q;
        if (i7 >= this.f21413r) {
            throw new NoSuchElementException();
        }
        this.f21412q = i7 + 1;
        return this.f21414s.e(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21412q < this.f21413r;
    }
}
