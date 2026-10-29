package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: MyApplication */
final class y1 implements a2 {

    /* renamed from: r, reason: collision with root package name */
    private static final z1 f21786r = new z1(y1.class);

    /* renamed from: q, reason: collision with root package name */
    private final Object f21787q;

    y1(Object obj) {
        this.f21787q = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f21787q;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.a2
    public final void j(Runnable runnable, Executor executor) {
        w.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f21786r.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    public final String toString() {
        Object obj = this.f21787q;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f21787q;
    }
}
