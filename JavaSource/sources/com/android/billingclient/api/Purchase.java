package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    private final String f3838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3839b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f3840c;

    public Purchase(String str, String str2) {
        this.f3838a = str;
        this.f3839b = str2;
        this.f3840c = new JSONObject(str);
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f3840c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    arrayList.add(optJSONArray.optString(i7));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f3838a;
    }

    public int b() {
        return this.f3840c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String c() {
        JSONObject jSONObject = this.f3840c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String d() {
        return this.f3839b;
    }

    public ArrayList e() {
        return g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3838a, purchase.a()) && TextUtils.equals(this.f3839b, purchase.d());
    }

    public boolean f() {
        return this.f3840c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f3838a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3838a));
    }
}
