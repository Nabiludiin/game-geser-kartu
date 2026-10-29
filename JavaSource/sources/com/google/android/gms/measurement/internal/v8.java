package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class v8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f22742q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22743r;

    v8(w9 w9Var, Bundle bundle) {
        this.f22742q = bundle;
        Objects.requireNonNull(w9Var);
        this.f22743r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22743r;
        w9Var.h();
        w9Var.j();
        Bundle bundle = this.f22742q;
        p3.o.m(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        p3.o.g(string);
        p3.o.g(string2);
        p3.o.m(bundle.get("value"));
        if (!w9Var.f22928a.g()) {
            w9Var.f22928a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        ud udVar = new ud(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            w6 w6Var = w9Var.f22928a;
            g0 R = w6Var.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            w9Var.f22928a.J().d0(new i(bundle.getString("app_id"), string2, udVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w6Var.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), R, bundle.getLong("time_to_live"), w6Var.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
