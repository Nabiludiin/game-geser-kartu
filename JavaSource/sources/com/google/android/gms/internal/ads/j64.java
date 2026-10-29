package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class j64 extends m04 implements Future {
    protected j64() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return k().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return k().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return k().isDone();
    }

    protected abstract Future k();

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return k().get(j7, timeUnit);
    }
}
