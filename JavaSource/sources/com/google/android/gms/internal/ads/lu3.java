package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class lu3 {

    /* renamed from: a, reason: collision with root package name */
    private final ik3 f11822a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f11823b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private long f11824c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f11825d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f11826e = null;

    /* renamed from: f, reason: collision with root package name */
    private final int f11827f;

    lu3(int i7, sh3 sh3Var, ik3 ik3Var) {
        this.f11827f = i7;
        this.f11822a = ik3Var;
    }

    public final void a() {
        if (this.f11823b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f11824c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f11823b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f11826e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f11823b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f11825d = SystemClock.uptimeMillis();
        this.f11822a.c(this.f11827f - 1, atomicBoolean.get() ? this.f11825d - this.f11824c : -1L, this.f11826e, null);
    }
}
