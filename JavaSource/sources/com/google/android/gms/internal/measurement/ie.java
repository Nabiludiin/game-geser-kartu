package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class ie implements he {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21041a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f21042b;

    /* renamed from: c, reason: collision with root package name */
    public static final i9 f21043c;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f21041a = b8.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f21042b = b8.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f21043c = b8.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean b() {
        return ((Boolean) f21041a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean d() {
        return ((Boolean) f21042b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean h() {
        return ((Boolean) f21043c.d()).booleanValue();
    }
}
