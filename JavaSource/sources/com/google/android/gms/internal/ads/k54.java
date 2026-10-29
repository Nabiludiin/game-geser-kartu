package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: MyApplication */
public abstract class k54 extends AbstractExecutorService implements z64, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.z64
    public final a5.d B0(Callable callable) {
        return (a5.d) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.z64
    public final a5.d H0(Runnable runnable) {
        return (a5.d) super.submit(runnable);
    }

    public /* synthetic */ void close() {
        xl0.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return p74.D(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (a5.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new p74(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (a5.d) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (a5.d) super.submit(callable);
    }
}
