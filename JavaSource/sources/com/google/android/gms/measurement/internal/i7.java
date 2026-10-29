package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class i7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22240q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y7 f22241r;

    i7(y7 y7Var, ae aeVar) {
        this.f22240q = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22241r = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22241r;
        y7Var.u4().E();
        y7Var.u4().b0(this.f22240q);
    }
}
