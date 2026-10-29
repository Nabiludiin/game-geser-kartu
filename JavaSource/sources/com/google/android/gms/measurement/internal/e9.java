package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class e9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22090q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22091r;

    e9(w9 w9Var, AtomicReference atomicReference) {
        this.f22090q = atomicReference;
        Objects.requireNonNull(w9Var);
        this.f22091r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f22090q;
        synchronized (atomicReference) {
            try {
                try {
                    w9 w9Var = this.f22091r;
                    atomicReference.set(Double.valueOf(w9Var.f22928a.w().G(w9Var.f22928a.L().q(), c5.f21949f0)));
                } finally {
                    this.f22090q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
