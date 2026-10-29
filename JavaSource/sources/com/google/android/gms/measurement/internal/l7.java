package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class l7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ g0 f22319q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ae f22320r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ y7 f22321s;

    l7(y7 y7Var, g0 g0Var, ae aeVar) {
        this.f22319q = g0Var;
        this.f22320r = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22321s = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = this.f22319q;
        ae aeVar = this.f22320r;
        y7 y7Var = this.f22321s;
        y7Var.M5(y7Var.T5(g0Var, aeVar), aeVar);
    }
}
