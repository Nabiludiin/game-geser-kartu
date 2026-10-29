package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class ay3 implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ CharSequence f5404q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ gy3 f5405r;

    ay3(gy3 gy3Var, CharSequence charSequence) {
        this.f5404q = charSequence;
        Objects.requireNonNull(gy3Var);
        this.f5405r = gy3Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5405r.f(this.f5404q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        kx3.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
