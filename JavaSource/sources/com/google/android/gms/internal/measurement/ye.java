package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class ye implements xe {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f21457a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f21457a = b8.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        b8.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean a() {
        return ((Boolean) f21457a.d()).booleanValue();
    }
}
