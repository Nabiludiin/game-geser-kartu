package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
class b74 extends k54 {

    /* renamed from: q, reason: collision with root package name */
    private final ExecutorService f5608q;

    b74(ExecutorService executorService) {
        executorService.getClass();
        this.f5608q = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f5608q.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5608q.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5608q.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5608q.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5608q.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f5608q.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f5608q;
        String obj = super.toString();
        String valueOf = String.valueOf(executorService);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 1 + valueOf.length() + 1);
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
