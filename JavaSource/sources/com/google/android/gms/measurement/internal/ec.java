package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ec implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f22102q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ mc f22103r;

    ec(mc mcVar, long j7) {
        this.f22102q = j7;
        Objects.requireNonNull(mcVar);
        this.f22103r = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22103r.s(this.f22102q);
    }
}
