package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class if0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10022a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10023b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10024c;

    public if0(boolean z7, String str, boolean z8) {
        this.f10022a = z7;
        this.f10023b = str;
        this.f10024c = z8;
    }

    public static if0 a(JSONObject jSONObject) {
        return new if0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
