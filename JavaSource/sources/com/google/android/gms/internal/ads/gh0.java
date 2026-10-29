package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f8913a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8914b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8915c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8916d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8917e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8918f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8919g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f8920h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8921i;

    /* renamed from: j, reason: collision with root package name */
    private final long f8922j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8923k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f8924l;

    /* renamed from: m, reason: collision with root package name */
    private final String f8925m;

    public gh0(JSONObject jSONObject) {
        this.f8918f = jSONObject.optString("url");
        this.f8914b = jSONObject.optString("base_uri");
        this.f8915c = jSONObject.optString("post_parameters");
        this.f8916d = n(jSONObject.optString("drt_include"));
        this.f8925m = jSONObject.optString("content_type");
        this.f8924l = n(jSONObject.optString("use_compression"));
        this.f8917e = n(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f8913a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f8919g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f8920h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f8921i = jSONObject.optString("pool_key");
        this.f8922j = o(jSONObject.optString("start_time")).longValue();
        this.f8923k = o(jSONObject.optString("end_time")).longValue();
    }

    private static boolean n(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    private static Long o(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final int a() {
        return this.f8919g;
    }

    public final List b() {
        return this.f8913a;
    }

    public final String c() {
        return this.f8914b;
    }

    public final String d() {
        return this.f8915c;
    }

    public final String e() {
        return this.f8918f;
    }

    public final boolean f() {
        return this.f8916d;
    }

    public final boolean g() {
        return this.f8917e;
    }

    public final JSONObject h() {
        return this.f8920h;
    }

    public final String i() {
        return this.f8921i;
    }

    public final long j() {
        return this.f8922j;
    }

    public final long k() {
        return this.f8923k;
    }

    public final String l() {
        return this.f8925m;
    }

    public final boolean m() {
        return this.f8924l;
    }
}
