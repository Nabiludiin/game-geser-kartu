package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: MyApplication */
abstract class b64 extends w64 {

    /* renamed from: s, reason: collision with root package name */
    private final Executor f5602s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ c64 f5603t;

    b64(c64 c64Var, Executor executor) {
        Objects.requireNonNull(c64Var);
        this.f5603t = c64Var;
        executor.getClass();
        this.f5602s = executor;
    }

    @Override // com.google.android.gms.internal.ads.w64
    final boolean d() {
        return this.f5603t.isDone();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final void e(Object obj) {
        this.f5603t.R(null);
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.w64
    final void f(Throwable th) {
        c64 c64Var = this.f5603t;
        c64Var.R(null);
        if (th instanceof ExecutionException) {
            c64Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c64Var.cancel(false);
        } else {
            c64Var.m(th);
        }
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.f5602s.execute(this);
        } catch (RejectedExecutionException e8) {
            this.f5603t.m(e8);
        }
    }
}
