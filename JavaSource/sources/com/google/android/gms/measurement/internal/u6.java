package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class u6 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ f8 f22685q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w6 f22686r;

    u6(w6 w6Var, f8 f8Var) {
        this.f22685q = f8Var;
        Objects.requireNonNull(w6Var);
        this.f22686r = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w6 w6Var = this.f22686r;
        f8 f8Var = this.f22685q;
        w6Var.p(f8Var);
        w6Var.v(f8Var.f22136d);
    }
}
