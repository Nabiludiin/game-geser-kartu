package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class m9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ id f22365q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22366r;

    m9(AppMeasurementDynamiteService appMeasurementDynamiteService, id idVar) {
        this.f22365q = idVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22366r = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22366r.f21831q.B().I(this.f22365q);
    }
}
