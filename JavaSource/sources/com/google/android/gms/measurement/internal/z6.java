package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class z6 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22926q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y7 f22927r;

    z6(y7 y7Var, ae aeVar) {
        this.f22926q = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22927r = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22927r;
        y7Var.u4().E();
        y7Var.u4().i0(this.f22926q);
    }
}
