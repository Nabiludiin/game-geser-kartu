package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class b3 extends c3 {

    /* renamed from: q, reason: collision with root package name */
    private int f21484q;

    /* renamed from: r, reason: collision with root package name */
    private final int f21485r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ i3 f21486s;

    b3(i3 i3Var) {
        Objects.requireNonNull(i3Var);
        this.f21486s = i3Var;
        this.f21484q = 0;
        this.f21485r = i3Var.g();
    }

    @Override // com.google.android.gms.internal.play_billing.e3
    public final byte a() {
        int i7 = this.f21484q;
        if (i7 >= this.f21485r) {
            throw new NoSuchElementException();
        }
        this.f21484q = i7 + 1;
        return this.f21486s.e(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21484q < this.f21485r;
    }
}
