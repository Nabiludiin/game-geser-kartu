package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class bf implements af {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f20839a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f20840b;

    /* renamed from: c, reason: collision with root package name */
    public static final i9 f20841c;

    /* renamed from: d, reason: collision with root package name */
    public static final i9 f20842d;

    /* renamed from: e, reason: collision with root package name */
    public static final i9 f20843e;

    /* renamed from: f, reason: collision with root package name */
    public static final i9 f20844f;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f20839a = b8.d("measurement.test.boolean_flag", false);
        f20840b = b8.c("measurement.test.cached_long_flag", -1L);
        f20841c = b8.e("measurement.test.double_flag", -3.0d);
        f20842d = b8.c("measurement.test.int_flag", -2L);
        f20843e = b8.c("measurement.test.long_flag", -1L);
        f20844f = b8.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean a() {
        return ((Boolean) f20839a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final long b() {
        return ((Long) f20840b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final long c() {
        return ((Long) f20843e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final double d() {
        return ((Double) f20841c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final String e() {
        return (String) f20844f.d();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final long h() {
        return ((Long) f20842d.d()).longValue();
    }
}
