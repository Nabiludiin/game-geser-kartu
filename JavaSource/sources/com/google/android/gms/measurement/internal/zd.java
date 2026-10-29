package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class zd implements t4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f22941a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f22942b;

    zd(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f22942b = appMeasurementDynamiteService;
        this.f22941a = e2Var;
    }

    @Override // t4.a0
    public final void a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f22941a.n1(str, str2, bundle, j7);
        } catch (RemoteException e8) {
            w6 w6Var = this.f22942b.f21831q;
            if (w6Var != null) {
                w6Var.a().r().b("Event listener threw exception", e8);
            }
        }
    }
}
