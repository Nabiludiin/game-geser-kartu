package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class n8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22404q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22405r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22406s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f22407t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22408u;

    n8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.y1 y1Var, String str, String str2, boolean z7) {
        this.f22404q = y1Var;
        this.f22405r = str;
        this.f22406s = str2;
        this.f22407t = z7;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22408u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22408u.f21831q.J().h0(this.f22404q, this.f22405r, this.f22406s, this.f22407t);
    }
}
