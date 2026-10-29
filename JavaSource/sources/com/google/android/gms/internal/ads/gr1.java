package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class gr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9087a;

    /* renamed from: b, reason: collision with root package name */
    private final ar1 f9088b;

    /* renamed from: c, reason: collision with root package name */
    private final lx1 f9089c;

    gr1(Executor executor, ar1 ar1Var, lx1 lx1Var) {
        this.f9087a = executor;
        this.f9088b = ar1Var;
        this.f9089c = lx1Var;
    }

    public final a5.d a(JSONObject jSONObject, String str) {
        a5.d a8;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return p64.a(Collections.EMPTY_LIST);
        }
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f9089c.e().putLong(yw1.NATIVE_ASSETS_LOADING_CUSTOM_START.c(), r2.t.o().a());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject == null) {
                a8 = p64.a(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    a8 = p64.a(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    a8 = "string".equals(optString2) ? p64.a(new dr1(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? p64.k(this.f9088b.a(optJSONObject, "image_value", null), new hx3() { // from class: com.google.android.gms.internal.ads.er1
                        @Override // com.google.android.gms.internal.ads.hx3
                        public final /* synthetic */ Object apply(Object obj) {
                            return new dr1(optString, (v10) obj);
                        }
                    }, this.f9087a) : p64.a(null);
                }
            }
            arrayList.add(a8);
        }
        return p64.k(p64.m(arrayList), fr1.f8433a, this.f9087a);
    }
}
