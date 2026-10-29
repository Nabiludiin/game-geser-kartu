package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class vf implements uf {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21418a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f21418a = b8.d("measurement.client.sessions.enable_fix_background_engagement", false);
        b8.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        b8.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.uf
    public final boolean a() {
        return ((Boolean) f21418a.d()).booleanValue();
    }
}
