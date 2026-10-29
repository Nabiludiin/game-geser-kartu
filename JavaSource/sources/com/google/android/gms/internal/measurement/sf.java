package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class sf implements rf {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21380a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f21380a = b8.d("measurement.session_stitching_token_enabled", false);
        b8.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.rf
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.rf
    public final boolean b() {
        return ((Boolean) f21380a.d()).booleanValue();
    }
}
