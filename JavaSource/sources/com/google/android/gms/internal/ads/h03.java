package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class h03 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9278b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f9279c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f9280d;

    h03(JsonReader jsonReader) {
        JSONObject d8 = v2.r0.d(jsonReader);
        this.f9280d = d8;
        this.f9277a = d8.optString("ad_html", null);
        this.f9278b = d8.optString("ad_base_url", null);
        this.f9279c = d8.optJSONObject("ad_json");
    }
}
