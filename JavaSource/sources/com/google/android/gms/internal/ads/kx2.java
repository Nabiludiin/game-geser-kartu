package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class kx2 implements hx3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ox2 f11287a;

    kx2(ox2 ox2Var) {
        Objects.requireNonNull(ox2Var);
        this.f11287a = ox2Var;
    }

    @Override // com.google.android.gms.internal.ads.hx3
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i7 = v2.n1.f26802b;
        w2.p.d("", (b52) obj);
        v2.n1.k("Failed to get a cache key, reverting to legacy flow.");
        ox2 ox2Var = this.f11287a;
        ox2Var.d(new mx2(null, ox2Var.b(), null));
        return ox2Var.c();
    }
}
