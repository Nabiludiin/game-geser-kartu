package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class ez1 {

    /* renamed from: a, reason: collision with root package name */
    private Long f7885a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7886b;

    /* renamed from: c, reason: collision with root package name */
    private String f7887c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f7888d;

    /* renamed from: e, reason: collision with root package name */
    private String f7889e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f7890f;

    /* synthetic */ ez1(String str, byte[] bArr) {
        this.f7886b = str;
    }

    final /* synthetic */ String a() {
        String str = (String) s2.b0.c().d(uy.Za);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.f7885a);
            jSONObject.put("eventCategory", this.f7886b);
            jSONObject.putOpt("event", this.f7887c);
            jSONObject.putOpt("errorCode", this.f7888d);
            jSONObject.putOpt("rewardType", this.f7889e);
            jSONObject.putOpt("rewardAmount", this.f7890f);
        } catch (JSONException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(jSONObject2).length() + 2);
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }

    final /* synthetic */ void b(Long l7) {
        this.f7885a = l7;
    }

    final /* synthetic */ void c(String str) {
        this.f7887c = str;
    }

    final /* synthetic */ void d(Integer num) {
        this.f7888d = num;
    }

    final /* synthetic */ void e(String str) {
        this.f7889e = str;
    }

    final /* synthetic */ void f(Integer num) {
        this.f7890f = num;
    }
}
