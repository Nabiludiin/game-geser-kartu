package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class i64 extends h64 {

    /* renamed from: x, reason: collision with root package name */
    private final a5.d f9853x;

    i64(a5.d dVar) {
        dVar.getClass();
        this.f9853x = dVar;
    }

    @Override // com.google.android.gms.internal.ads.b54, a5.d
    public final void c(Runnable runnable, Executor executor) {
        this.f9853x.c(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.b54, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f9853x.cancel(z7);
    }

    @Override // com.google.android.gms.internal.ads.b54, java.util.concurrent.Future
    public final Object get() {
        return this.f9853x.get();
    }

    @Override // com.google.android.gms.internal.ads.b54, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9853x.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.b54, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9853x.isDone();
    }

    @Override // com.google.android.gms.internal.ads.b54
    public final String toString() {
        return this.f9853x.toString();
    }

    @Override // com.google.android.gms.internal.ads.b54, java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f9853x.get(j7, timeUnit);
    }
}
