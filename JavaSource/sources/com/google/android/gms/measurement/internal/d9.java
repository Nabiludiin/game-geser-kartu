package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class d9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22054q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22055r;

    d9(w9 w9Var, AtomicReference atomicReference) {
        this.f22054q = atomicReference;
        Objects.requireNonNull(w9Var);
        this.f22055r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f22054q;
        synchronized (atomicReference) {
            try {
                try {
                    w9 w9Var = this.f22055r;
                    atomicReference.set(Integer.valueOf(w9Var.f22928a.w().E(w9Var.f22928a.L().q(), c5.f21946e0)));
                } finally {
                    this.f22054q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
