package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class b93 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s2.x2 f5632q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ e93 f5633r;

    b93(e93 e93Var, s2.x2 x2Var) {
        this.f5632q = x2Var;
        Objects.requireNonNull(e93Var);
        this.f5633r = e93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5633r.N(this.f5632q);
    }
}
