package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class eb0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7521a;

    public eb0(JSONObject jSONObject) {
        if (w2.p.j(2)) {
            v2.n1.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i7 = -1;
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                db0 db0Var = new db0(jSONArray.getJSONObject(i8));
                "banner".equalsIgnoreCase(db0Var.f7039c);
                arrayList.add(db0Var);
                if (i7 < 0) {
                    Iterator it = db0Var.f7037a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i7 = i8;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f7521a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            r2.t.B();
            fb0.a(optJSONObject, "click_urls");
            r2.t.B();
            fb0.a(optJSONObject, "imp_urls");
            r2.t.B();
            fb0.a(optJSONObject, "downloaded_imp_urls");
            r2.t.B();
            fb0.a(optJSONObject, "nofill_urls");
            r2.t.B();
            fb0.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            di0.M0(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
