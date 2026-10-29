package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class dc implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f22066q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ mc f22067r;

    dc(mc mcVar, long j7) {
        this.f22066q = j7;
        Objects.requireNonNull(mcVar);
        this.f22067r = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22067r.r(this.f22066q);
    }
}
