package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class hf implements gf {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21023a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f21023a = b8.d("measurement.add_first_launch_logging_timestamp.service", false);
        b8.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.gf
    public final boolean a() {
        return ((Boolean) f21023a.d()).booleanValue();
    }
}
