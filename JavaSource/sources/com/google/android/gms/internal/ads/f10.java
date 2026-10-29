package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class f10 {

    /* renamed from: a, reason: collision with root package name */
    public static final g00 f7955a = g00.b("gads:dynamite_load:fail:sample_rate", 10000);

    /* renamed from: b, reason: collision with root package name */
    public static final g00 f7956b = g00.a("gads:report_dynamite_crash_in_background_thread", false);

    /* renamed from: c, reason: collision with root package name */
    public static final g00 f7957c = new g00("gads:public_beta:traffic_multiplier", "1.0", 4);

    /* renamed from: d, reason: collision with root package name */
    public static final g00 f7958d = new g00("gads:sdk_crash_report_class_prefix", "com.google.", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final g00 f7959e;

    /* renamed from: f, reason: collision with root package name */
    public static final g00 f7960f;

    static {
        g00.a("gads:sdk_crash_report_enabled", false);
        f7959e = g00.a("gads:sdk_crash_report_full_stacktrace", false);
        f7960f = g00.c("gads:trapped_exception_sample_rate", 0.01d);
    }
}
