package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
final class fa3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ga3 f8112q;

    fa3(ga3 ga3Var) {
        Objects.requireNonNull(ga3Var);
        this.f8112q = ga3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ga3 ga3Var = this.f8112q;
        AtomicBoolean f8 = ga3Var.f();
        float c8 = ga3Var.c();
        f8.set(false);
        if (((Float) ga3Var.e().getAndSet(Float.valueOf(c8))).floatValue() != c8) {
            ga3Var.d().post(new ea3(this, c8));
        }
    }
}
