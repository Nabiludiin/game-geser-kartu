package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class f74 extends b74 implements a74, AutoCloseable {

    /* renamed from: r, reason: collision with root package name */
    final ScheduledExecutorService f8054r;

    f74(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f8054r = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final y64 schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f8054r;
        p74 D = p74.D(runnable, null);
        return new d74(D, scheduledExecutorService.schedule(D, j7, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.k54, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        xl0.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final y64 schedule(Callable callable, long j7, TimeUnit timeUnit) {
        p74 p74Var = new p74(callable);
        return new d74(p74Var, this.f8054r.schedule(p74Var, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y64 scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        e74 e74Var = new e74(runnable);
        return new d74(e74Var, this.f8054r.scheduleAtFixedRate(e74Var, j7, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final y64 scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        e74 e74Var = new e74(runnable);
        return new d74(e74Var, this.f8054r.scheduleWithFixedDelay(e74Var, j7, j8, timeUnit));
    }
}
