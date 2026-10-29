package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class ve implements ue {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21417a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.gmscore_feature_tracking", true);
        f21417a = b8.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.ue
    public final boolean a() {
        return ((Boolean) f21417a.d()).booleanValue();
    }
}
