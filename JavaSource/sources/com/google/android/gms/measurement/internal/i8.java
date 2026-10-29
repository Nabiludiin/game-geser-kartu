package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class i8 implements Executor {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ w9 f22242q;

    i8(w9 w9Var) {
        Objects.requireNonNull(w9Var);
        this.f22242q = w9Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22242q.f22928a.b().t(runnable);
    }
}
