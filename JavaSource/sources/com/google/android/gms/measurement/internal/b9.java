package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class b9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f21900q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f21901r;

    b9(w9 w9Var, AtomicReference atomicReference) {
        this.f21900q = atomicReference;
        Objects.requireNonNull(w9Var);
        this.f21901r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f21900q;
        synchronized (atomicReference) {
            try {
                try {
                    w9 w9Var = this.f21901r;
                    atomicReference.set(w9Var.f22928a.w().C(w9Var.f22928a.L().q(), c5.f21940c0));
                } finally {
                    this.f21900q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
