package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class td implements sd {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21387a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.client.3p_consent_state_v1", true);
        f21387a = b8.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final long a() {
        return ((Long) f21387a.d()).longValue();
    }
}
