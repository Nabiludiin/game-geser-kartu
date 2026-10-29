package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class uu2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16990a;

    public uu2(String str) {
        this.f16990a = str;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.f16990a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v2.r0.h(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed putting trustless token.", e8);
        }
    }
}
