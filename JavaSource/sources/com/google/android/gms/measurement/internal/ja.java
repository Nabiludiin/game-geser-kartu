package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ja implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22275q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22276r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22277s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22278t;

    ja(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.y1 y1Var, String str, String str2) {
        this.f22275q = y1Var;
        this.f22276r = str;
        this.f22277s = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22278t = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22278t.f21831q.J().f0(this.f22275q, this.f22276r, this.f22277s);
    }
}
