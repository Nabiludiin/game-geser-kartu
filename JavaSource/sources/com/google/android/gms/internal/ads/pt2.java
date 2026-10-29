package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class pt2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f14097a;

    public pt2(JSONObject jSONObject) {
        this.f14097a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f14097a);
        } catch (JSONException unused) {
            v2.n1.k("Unable to get cache_state");
        }
    }
}
