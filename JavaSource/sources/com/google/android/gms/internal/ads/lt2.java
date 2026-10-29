package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class lt2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    final String f11792a;

    /* renamed from: b, reason: collision with root package name */
    final int f11793b;

    public lt2(String str, int i7) {
        this.f11792a = str;
        this.f11793b = i7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        int i7;
        String str = this.f11792a;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i7 = this.f11793b) == -1) {
            return;
        }
        try {
            JSONObject h8 = v2.r0.h(jSONObject, "pii");
            h8.put("pvid", str);
            h8.put("pvid_s", i7);
        } catch (JSONException e8) {
            v2.n1.l("Failed putting gms core app set ID info.", e8);
        }
    }
}
