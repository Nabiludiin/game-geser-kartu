package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class se implements re {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21379a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.gbraid_campaign.gbraid.client", true);
        f21379a = b8.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.re
    public final boolean a() {
        return ((Boolean) f21379a.d()).booleanValue();
    }
}
