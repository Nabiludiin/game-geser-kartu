package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
final class p62 implements ia0 {
    p62() {
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        q62 q62Var = (q62) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) s2.b0.c().d(uy.na)).booleanValue()) {
            gh0 gh0Var = q62Var.f14275c;
            jSONObject2.put("ad_request_url", gh0Var.e());
            jSONObject2.put("ad_request_post_body", gh0Var.d());
        }
        gh0 gh0Var2 = q62Var.f14275c;
        jSONObject2.put("base_url", gh0Var2.c());
        jSONObject2.put("signals", q62Var.f14274b);
        z62 z62Var = q62Var.f14273a;
        jSONObject3.put("body", z62Var.f20029c);
        jSONObject3.put("headers", s2.z.a().s(z62Var.f20028b));
        jSONObject3.put("response_code", z62Var.f20027a);
        jSONObject3.put("latency", z62Var.f20030d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", gh0Var2.h());
        return jSONObject;
    }
}
