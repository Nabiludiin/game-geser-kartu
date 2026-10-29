package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class ef implements df {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f20925a;

    /* renamed from: b, reason: collision with root package name */
    public static final i9 f20926b;

    /* renamed from: c, reason: collision with root package name */
    public static final i9 f20927c;

    /* renamed from: d, reason: collision with root package name */
    public static final i9 f20928d;

    /* renamed from: e, reason: collision with root package name */
    public static final i9 f20929e;

    /* renamed from: f, reason: collision with root package name */
    public static final i9 f20930f;

    /* renamed from: g, reason: collision with root package name */
    public static final i9 f20931g;

    /* renamed from: h, reason: collision with root package name */
    public static final i9 f20932h;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        b8.d("measurement.rb.attribution.ad_campaign_info", true);
        b8.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f20925a = b8.d("measurement.rb.attribution.client2", true);
        f20926b = b8.d("measurement.rb.attribution.followup1.service", false);
        b8.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f20927c = b8.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        b8.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f20928d = b8.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f20929e = b8.d("measurement.rb.attribution.retry_disposition", false);
        f20930f = b8.d("measurement.rb.attribution.service", true);
        f20931g = b8.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f20932h = b8.d("measurement.rb.attribution.uuid_generation", true);
        b8.c("measurement.id.rb.attribution.retry_disposition", 0L);
        b8.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean b() {
        return ((Boolean) f20925a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean c() {
        return ((Boolean) f20928d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean d() {
        return ((Boolean) f20926b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean e() {
        return ((Boolean) f20929e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean f() {
        return ((Boolean) f20930f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean g() {
        return ((Boolean) f20931g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean h() {
        return ((Boolean) f20927c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean j() {
        return ((Boolean) f20932h.d()).booleanValue();
    }
}
