package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class g3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Bundle f20973u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ Activity f20974v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ o3 f20975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g3(o3 o3Var, Bundle bundle, Activity activity) {
        super(o3Var.f21202q, true);
        this.f20973u = bundle;
        this.f20974v = activity;
        Objects.requireNonNull(o3Var);
        this.f20975w = o3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f20973u;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        v1 v1Var = (v1) p3.o.m(this.f20975w.f21202q.j());
        Activity activity = this.f20974v;
        v1Var.onActivityCreatedByScionActivityInfo(j2.M0(activity), bundle, this.f20939r);
    }
}
