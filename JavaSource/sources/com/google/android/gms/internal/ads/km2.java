package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class km2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f11123a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f11124b;

    public km2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f11123a = jSONObject;
        this.f11124b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = this.f11124b;
        x81 x81Var = (x81) obj;
        if (jSONObject != null) {
            x81Var.f18665b.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        JSONObject jSONObject = this.f11123a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f11124b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
