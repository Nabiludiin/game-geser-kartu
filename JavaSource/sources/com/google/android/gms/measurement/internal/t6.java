package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class t6 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22652q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22653r;

    t6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22652q = y1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22653r = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22653r.f21831q.J().r(this.f22652q);
    }
}
