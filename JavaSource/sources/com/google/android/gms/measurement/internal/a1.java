package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class a1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f21838q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ b2 f21839r;

    a1(b2 b2Var, long j7) {
        this.f21838q = j7;
        Objects.requireNonNull(b2Var);
        this.f21839r = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21839r.n(this.f21838q);
    }
}
