package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class w8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f22795q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22796r;

    w8(w9 w9Var, Bundle bundle) {
        this.f22795q = bundle;
        Objects.requireNonNull(w9Var);
        this.f22796r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22796r;
        w9Var.h();
        w9Var.j();
        Bundle bundle = this.f22795q;
        p3.o.m(bundle);
        String g8 = p3.o.g(bundle.getString("name"));
        if (!w9Var.f22928a.g()) {
            w9Var.f22928a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            w9Var.f22928a.J().d0(new i(bundle.getString("app_id"), "", new ud(g8, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), w9Var.f22928a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
