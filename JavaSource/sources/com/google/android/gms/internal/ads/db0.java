package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class db0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7037a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7039c;

    public db0(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(jSONArray.getString(i7));
        }
        this.f7037a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        r2.t.B();
        fb0.a(jSONObject, "clickurl");
        r2.t.B();
        fb0.a(jSONObject, "imp_urls");
        r2.t.B();
        fb0.a(jSONObject, "downloaded_imp_urls");
        r2.t.B();
        fb0.a(jSONObject, "fill_urls");
        r2.t.B();
        fb0.a(jSONObject, "video_start_urls");
        r2.t.B();
        fb0.a(jSONObject, "video_complete_urls");
        r2.t.B();
        fb0.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            r2.t.B();
            fb0.a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f7038b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        r2.t.B();
        fb0.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f7039c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
