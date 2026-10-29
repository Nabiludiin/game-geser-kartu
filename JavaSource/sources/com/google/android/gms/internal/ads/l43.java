package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class l43 implements a5.d {

    /* renamed from: q, reason: collision with root package name */
    private final Object f11418q;

    /* renamed from: r, reason: collision with root package name */
    private final String f11419r;

    /* renamed from: s, reason: collision with root package name */
    private final a5.d f11420s;

    public l43(Object obj, String str, a5.d dVar) {
        this.f11418q = obj;
        this.f11419r = str;
        this.f11420s = dVar;
    }

    public final Object a() {
        return this.f11418q;
    }

    public final String b() {
        return this.f11419r;
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        this.f11420s.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f11420s.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11420s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11420s.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11420s.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.f11419r;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f11420s.get(j7, timeUnit);
    }
}
