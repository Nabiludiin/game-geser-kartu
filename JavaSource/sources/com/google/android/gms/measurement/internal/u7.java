package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class u7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22687q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ g0 f22688r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22689s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22690t;

    u7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.y1 y1Var, g0 g0Var, String str) {
        this.f22687q = y1Var;
        this.f22688r = g0Var;
        this.f22689s = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22690t = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22690t.f21831q.J().B(this.f22687q, this.f22688r, this.f22689s);
    }
}
