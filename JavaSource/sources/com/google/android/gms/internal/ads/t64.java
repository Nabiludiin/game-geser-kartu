package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
final class t64 implements a5.d {

    /* renamed from: r, reason: collision with root package name */
    static final a5.d f16001r = new t64(null);

    /* renamed from: s, reason: collision with root package name */
    private static final x64 f16002s = new x64(t64.class);

    /* renamed from: q, reason: collision with root package name */
    private final Object f16003q;

    t64(Object obj) {
        this.f16003q = obj;
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        rx3.k(runnable, "Runnable was null.");
        rx3.k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            Logger a8 = f16002s.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            a8.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16003q;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f16003q;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(obj2).length() + 25 + valueOf.length() + 2);
        sb.append(obj2);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f16003q;
    }
}
