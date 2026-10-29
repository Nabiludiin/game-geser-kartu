package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ha implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f22204q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ la f22205r;

    ha(la laVar, long j7) {
        this.f22204q = j7;
        Objects.requireNonNull(laVar);
        this.f22205r = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la laVar = this.f22205r;
        laVar.f22928a.M().k(this.f22204q);
        laVar.f22329e = null;
    }
}
