package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class l10 {

    /* renamed from: a, reason: collision with root package name */
    public static final g00 f11335a = g00.a("gads:trustless_token_for_decagon:enabled", true);

    /* renamed from: b, reason: collision with root package name */
    public static final g00 f11336b;

    static {
        g00.a("gads:invalidate_token_at_refresh_start", true);
        g00.a("gms:expose_token_for_gma:enabled", true);
        g00.a("gads:referesh_rate_limit", false);
        f11336b = g00.b("gads:timeout_for_trustless_token:millis", 2000L);
        g00.a("gads:token_anonymization:enabled", true);
        g00.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
