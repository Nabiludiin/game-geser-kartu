package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class l64 extends j64 implements a5.d {
    protected l64() {
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        l().c(runnable, executor);
    }

    protected abstract a5.d l();
}
