package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class id implements t4.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f22253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22254b;

    id(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22254b = appMeasurementDynamiteService;
        this.f22253a = e2Var;
    }

    @Override // t4.z
    public final void a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f22253a.n1(str, str2, bundle, j7);
        } catch (RemoteException e8) {
            w6 w6Var = this.f22254b.f21831q;
            if (w6Var != null) {
                w6Var.a().r().b("Event interceptor threw exception", e8);
            }
        }
    }
}
