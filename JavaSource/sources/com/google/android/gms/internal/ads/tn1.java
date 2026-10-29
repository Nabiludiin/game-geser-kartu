package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class tn1 extends un1 {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f16257b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16258c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16259d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16260e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16261f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16262g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f16263h;

    public tn1(c03 c03Var, JSONObject jSONObject) {
        super(c03Var);
        this.f16257b = v2.r0.i(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f16258c = v2.r0.j(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16259d = v2.r0.j(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f16260e = v2.r0.j(false, jSONObject, "enable_omid");
        this.f16262g = v2.r0.k("", jSONObject, "watermark_overlay_png_base64");
        this.f16261f = jSONObject.optJSONObject("overlay") != null;
        this.f16263h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final JSONObject a() {
        JSONObject jSONObject = this.f16257b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f16840a.f6200z);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final boolean b() {
        return this.f16261f;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final boolean c() {
        return this.f16258c;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final boolean d() {
        return this.f16260e;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final boolean e() {
        return this.f16259d;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final String f() {
        return this.f16262g;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final z03 g() {
        JSONObject jSONObject = this.f16263h;
        return jSONObject != null ? new z03(jSONObject) : this.f16840a.V;
    }
}
