package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MyApplication */
final class j15 extends jy4 {

    /* renamed from: q, reason: collision with root package name */
    final l15 f10303q;

    /* renamed from: r, reason: collision with root package name */
    ly4 f10304r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ m15 f10305s;

    j15(m15 m15Var) {
        Objects.requireNonNull(m15Var);
        this.f10305s = m15Var;
        this.f10303q = new l15(m15Var, null);
        this.f10304r = b();
    }

    private final ly4 b() {
        l15 l15Var = this.f10303q;
        if (l15Var.hasNext()) {
            return l15Var.next().iterator();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ly4
    public final byte a() {
        ly4 ly4Var = this.f10304r;
        if (ly4Var == null) {
            throw new NoSuchElementException();
        }
        byte a8 = ly4Var.a();
        if (!this.f10304r.hasNext()) {
            this.f10304r = b();
        }
        return a8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10304r != null;
    }
}
