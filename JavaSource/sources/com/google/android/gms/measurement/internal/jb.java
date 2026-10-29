package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class jb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22279q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22280r;

    jb(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22279q = y1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22280r = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f22280r;
        appMeasurementDynamiteService.f21831q.C().e0(this.f22279q, appMeasurementDynamiteService.f21831q.d());
    }
}
