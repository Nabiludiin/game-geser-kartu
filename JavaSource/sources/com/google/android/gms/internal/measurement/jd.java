package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class jd implements id {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21060a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f21060a = b8.d("measurement.service.ad_impression.convert_value_to_double", true);
        b8.d("measurement.service.separate_public_internal_event_blacklisting", true);
        b8.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final boolean a() {
        return ((Boolean) f21060a.d()).booleanValue();
    }
}
