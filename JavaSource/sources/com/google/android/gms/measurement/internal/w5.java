package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class w5 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f22763q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ x5 f22764r;

    w5(x5 x5Var, boolean z7) {
        this.f22763q = z7;
        Objects.requireNonNull(x5Var);
        this.f22764r = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22764r.c().s0(this.f22763q);
    }
}
