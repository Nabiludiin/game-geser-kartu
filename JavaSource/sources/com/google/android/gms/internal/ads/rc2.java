package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class rc2 implements ma2 {

    /* renamed from: a, reason: collision with root package name */
    private final ev1 f14842a;

    public rc2(ev1 ev1Var) {
        this.f14842a = ev1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final na2 a(String str, JSONObject jSONObject) {
        return new na2(this.f14842a.a(str, jSONObject), new ac2(), str);
    }
}
