package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public class im0 implements a5.d {

    /* renamed from: q, reason: collision with root package name */
    private final j74 f10078q = j74.C();

    private static final boolean a(boolean z7) {
        if (!z7) {
            r2.t.l().j(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z7;
    }

    public final boolean b(Object obj) {
        boolean l7 = this.f10078q.l(obj);
        a(l7);
        return l7;
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        this.f10078q.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return this.f10078q.cancel(z7);
    }

    public final boolean e(Throwable th) {
        boolean m7 = this.f10078q.m(th);
        a(m7);
        return m7;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10078q.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10078q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10078q.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f10078q.get(j7, timeUnit);
    }
}
