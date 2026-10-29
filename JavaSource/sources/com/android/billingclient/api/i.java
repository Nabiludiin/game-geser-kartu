package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f3986a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3987b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3988c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3989d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3990e;

    i(String str) {
        this.f3986a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3987b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3988c = optString;
        this.f3989d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f3990e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return TextUtils.equals(this.f3986a, ((i) obj).f3986a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3986a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f3987b + "', productType='" + this.f3988c + "', statusCode=" + this.f3989d + "}";
    }
}
