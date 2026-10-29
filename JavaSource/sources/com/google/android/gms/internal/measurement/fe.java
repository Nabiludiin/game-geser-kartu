package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class fe implements ee {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f20963a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f20964b;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.collection.event_safelist", true);
        f20963a = b8.d("measurement.service.store_null_safelist", true);
        f20964b = b8.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean b() {
        return ((Boolean) f20963a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean d() {
        return ((Boolean) f20964b.d()).booleanValue();
    }
}
