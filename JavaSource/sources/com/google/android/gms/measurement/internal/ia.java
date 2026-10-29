package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ia implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ da f22247q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f22248r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ la f22249s;

    ia(la laVar, da daVar, long j7) {
        this.f22247q = daVar;
        this.f22248r = j7;
        Objects.requireNonNull(laVar);
        this.f22249s = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la laVar = this.f22249s;
        laVar.C(this.f22247q, false, this.f22248r);
        laVar.f22329e = null;
        laVar.f22928a.J().u(null);
    }
}
