package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class y6 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22883q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y7 f22884r;

    y6(y7 y7Var, ae aeVar) {
        this.f22883q = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22884r = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22884r;
        y7Var.u4().E();
        y7Var.u4().h0(this.f22883q);
    }
}
