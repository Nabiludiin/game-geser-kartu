package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class ea implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f22092q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ da f22093r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ da f22094s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f22095t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ la f22096u;

    ea(la laVar, Bundle bundle, da daVar, da daVar2, long j7) {
        this.f22092q = bundle;
        this.f22093r = daVar;
        this.f22094s = daVar2;
        this.f22095t = j7;
        Objects.requireNonNull(laVar);
        this.f22096u = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22096u.A(this.f22092q, this.f22093r, this.f22094s, this.f22095t);
    }
}
