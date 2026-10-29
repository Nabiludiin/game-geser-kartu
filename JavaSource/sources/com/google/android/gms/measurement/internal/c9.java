package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class c9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22007q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22008r;

    c9(w9 w9Var, AtomicReference atomicReference) {
        this.f22007q = atomicReference;
        Objects.requireNonNull(w9Var);
        this.f22008r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f22007q;
        synchronized (atomicReference) {
            try {
                try {
                    w9 w9Var = this.f22008r;
                    atomicReference.set(Long.valueOf(w9Var.f22928a.w().D(w9Var.f22928a.L().q(), c5.f21943d0)));
                } finally {
                    this.f22007q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
