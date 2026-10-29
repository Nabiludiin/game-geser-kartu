package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ea3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ float f7511q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ fa3 f7512r;

    ea3(fa3 fa3Var, float f8) {
        this.f7511q = f8;
        Objects.requireNonNull(fa3Var);
        this.f7512r = fa3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7512r.f8112q.g().f(this.f7511q);
    }
}
