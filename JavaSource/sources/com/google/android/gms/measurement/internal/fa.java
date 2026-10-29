package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class fa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ da f22142q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ da f22143r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f22144s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f22145t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ la f22146u;

    fa(la laVar, da daVar, da daVar2, long j7, boolean z7) {
        this.f22142q = daVar;
        this.f22143r = daVar2;
        this.f22144s = j7;
        this.f22145t = z7;
        Objects.requireNonNull(laVar);
        this.f22146u = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22146u.B(this.f22142q, this.f22143r, this.f22144s, this.f22145t, null);
    }
}
