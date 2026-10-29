package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class wd implements vd {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21424a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f21425b;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        b8.d("measurement.set_default_event_parameters_with_backfill.service", true);
        b8.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f21424a = b8.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f21425b = b8.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        b8.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final boolean a() {
        return ((Boolean) f21424a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final boolean b() {
        return ((Boolean) f21425b.d()).booleanValue();
    }
}
