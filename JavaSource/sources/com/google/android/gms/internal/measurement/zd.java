package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class zd implements yd {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21466a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f21467b;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f21466a = b8.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f21467b = b8.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final boolean a() {
        return ((Boolean) f21466a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final boolean b() {
        return ((Boolean) f21467b.d()).booleanValue();
    }
}
