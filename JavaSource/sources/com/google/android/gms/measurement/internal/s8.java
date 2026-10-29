package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class s8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22620q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22621r;

    s8(w9 w9Var, AtomicReference atomicReference) {
        this.f22620q = atomicReference;
        Objects.requireNonNull(w9Var);
        this.f22621r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f22620q;
        synchronized (atomicReference) {
            try {
                try {
                    w9 w9Var = this.f22621r;
                    atomicReference.set(Boolean.valueOf(w9Var.f22928a.w().H(w9Var.f22928a.L().q(), c5.f21937b0)));
                } finally {
                    this.f22620q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
