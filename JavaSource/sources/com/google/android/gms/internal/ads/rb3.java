package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class rb3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ vb3 f14836q;

    rb3(vb3 vb3Var) {
        Objects.requireNonNull(vb3Var);
        this.f14836q = vb3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14836q.h().c();
    }
}
