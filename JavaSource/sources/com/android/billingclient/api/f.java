package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f3919a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f3920b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3921c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3922d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3923e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3924f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3925g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3926h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3927i;

    /* renamed from: j, reason: collision with root package name */
    private final List f3928j;

    /* renamed from: k, reason: collision with root package name */
    private final List f3929k;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f3930a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3931b;

        a(JSONObject jSONObject) {
            this.f3930a = jSONObject.getInt("commitmentPaymentsCount");
            this.f3931b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f3932a;

        /* renamed from: b, reason: collision with root package name */
        private final long f3933b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3934c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3935d;

        /* renamed from: e, reason: collision with root package name */
        private final String f3936e;

        /* renamed from: f, reason: collision with root package name */
        private final String f3937f;

        /* renamed from: g, reason: collision with root package name */
        private final List f3938g;

        /* renamed from: h, reason: collision with root package name */
        private final Long f3939h;

        /* renamed from: i, reason: collision with root package name */
        private final a f3940i;

        /* renamed from: j, reason: collision with root package name */
        private final d f3941j;

        /* renamed from: k, reason: collision with root package name */
        private final C0074b f3942k;

        /* renamed from: l, reason: collision with root package name */
        private final String f3943l;

        /* renamed from: m, reason: collision with root package name */
        private final c f3944m;

        /* renamed from: n, reason: collision with root package name */
        private final q0 f3945n;

        /* compiled from: MyApplication */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f3946a;

            /* renamed from: b, reason: collision with root package name */
            private final C0073a f3947b;

            /* compiled from: MyApplication */
            /* renamed from: com.android.billingclient.api.f$b$a$a, reason: collision with other inner class name */
            public static final class C0073a {

                /* renamed from: a, reason: collision with root package name */
                private final String f3948a;

                /* renamed from: b, reason: collision with root package name */
                private final long f3949b;

                /* renamed from: c, reason: collision with root package name */
                private final String f3950c;

                C0073a(JSONObject jSONObject) {
                    this.f3948a = jSONObject.optString("formattedDiscountAmount");
                    this.f3949b = jSONObject.optLong("discountAmountMicros");
                    this.f3950c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            a(JSONObject jSONObject) {
                this.f3946a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject optJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f3947b = optJSONObject != null ? new C0073a(optJSONObject) : null;
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: com.android.billingclient.api.f$b$b, reason: collision with other inner class name */
        public static final class C0074b {

            /* renamed from: a, reason: collision with root package name */
            private final int f3951a;

            /* renamed from: b, reason: collision with root package name */
            private final int f3952b;

            C0074b(JSONObject jSONObject) {
                this.f3951a = jSONObject.getInt("maximumQuantity");
                this.f3952b = jSONObject.getInt("remainingQuantity");
            }
        }

        /* compiled from: MyApplication */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private final String f3953a;

            /* renamed from: b, reason: collision with root package name */
            private final String f3954b;

            c(JSONObject jSONObject) {
                this.f3953a = jSONObject.getString("rentalPeriod");
                String optString = jSONObject.optString("rentalExpirationPeriod");
                this.f3954b = true == optString.isEmpty() ? null : optString;
            }
        }

        /* compiled from: MyApplication */
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final Long f3955a;

            /* renamed from: b, reason: collision with root package name */
            private final Long f3956b;

            d(JSONObject jSONObject) {
                this.f3955a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f3956b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        b(JSONObject jSONObject) {
            this.f3932a = jSONObject.optString("formattedPrice");
            this.f3933b = jSONObject.optLong("priceAmountMicros");
            this.f3934c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            this.f3935d = true == optString.isEmpty() ? null : optString;
            String optString2 = jSONObject.optString("offerId");
            this.f3936e = true == optString2.isEmpty() ? null : optString2;
            String optString3 = jSONObject.optString("purchaseOptionId");
            this.f3937f = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            this.f3938g = new ArrayList();
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    this.f3938g.add(optJSONArray.getString(i7));
                }
            }
            this.f3939h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f3940i = optJSONObject == null ? null : new a(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f3941j = optJSONObject2 == null ? null : new d(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f3942k = optJSONObject3 == null ? null : new C0074b(optJSONObject3);
            this.f3943l = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (optJSONObject4 != null) {
                optJSONObject4.getLong("preorderReleaseTimeMillis");
                optJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f3944m = optJSONObject5 == null ? null : new c(optJSONObject5);
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f3945n = optJSONObject6 != null ? new q0(optJSONObject6) : null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (optJSONArray2 == null) {
                return;
            }
            new d(optJSONArray2);
        }

        public String a() {
            return this.f3935d;
        }

        public final q0 b() {
            return this.f3945n;
        }

        final String c() {
            return this.f3943l;
        }
    }

    /* compiled from: MyApplication */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f3957a;

        /* renamed from: b, reason: collision with root package name */
        private final long f3958b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3959c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3960d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3961e;

        /* renamed from: f, reason: collision with root package name */
        private final int f3962f;

        c(JSONObject jSONObject) {
            this.f3960d = jSONObject.optString("billingPeriod");
            this.f3959c = jSONObject.optString("priceCurrencyCode");
            this.f3957a = jSONObject.optString("formattedPrice");
            this.f3958b = jSONObject.optLong("priceAmountMicros");
            this.f3962f = jSONObject.optInt("recurrenceMode");
            this.f3961e = jSONObject.optInt("billingCycleCount");
        }
    }

    /* compiled from: MyApplication */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f3963a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                    if (optJSONObject != null) {
                        arrayList.add(new c(optJSONObject));
                    }
                }
            }
            this.f3963a = arrayList;
        }
    }

    /* compiled from: MyApplication */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f3964a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3965b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3966c;

        /* renamed from: d, reason: collision with root package name */
        private final d f3967d;

        /* renamed from: e, reason: collision with root package name */
        private final List f3968e;

        /* renamed from: f, reason: collision with root package name */
        private final a f3969f;

        e(JSONObject jSONObject) {
            this.f3964a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f3965b = true == optString.isEmpty() ? null : optString;
            this.f3966c = jSONObject.getString("offerIdToken");
            this.f3967d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f3969f = optJSONObject != null ? new a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString("title");
                optJSONObject2.optString("name");
                optJSONObject2.optString("description");
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new c(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    arrayList.add(optJSONArray.getString(i7));
                }
            }
            this.f3968e = arrayList;
        }
    }

    f(String str) {
        this.f3919a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3920b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f3921c = optString;
        String optString2 = jSONObject.optString("type");
        this.f3922d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f3923e = jSONObject.optString("title");
        this.f3924f = jSONObject.optString("name");
        this.f3925g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f3926h = jSONObject.optString("skuDetailsToken");
        this.f3927i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(new e(optJSONArray.getJSONObject(i7)));
            }
            this.f3928j = arrayList;
        } else {
            this.f3928j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f3920b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f3920b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                arrayList2.add(new b(optJSONArray2.getJSONObject(i8)));
            }
            this.f3929k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f3929k = null;
        } else {
            arrayList2.add(new b(optJSONObject));
            this.f3929k = arrayList2;
        }
    }

    public b a() {
        List list = this.f3929k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List b() {
        return this.f3929k;
    }

    public String c() {
        return this.f3921c;
    }

    public String d() {
        return this.f3922d;
    }

    public List e() {
        return this.f3928j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return TextUtils.equals(this.f3919a, ((f) obj).f3919a);
        }
        return false;
    }

    public final String f() {
        return this.f3920b.optString("packageName");
    }

    final String g() {
        return this.f3926h;
    }

    public String h() {
        return this.f3927i;
    }

    public int hashCode() {
        return this.f3919a.hashCode();
    }

    final List i() {
        return this.f3929k;
    }

    public String toString() {
        List list = this.f3928j;
        return "ProductDetails{jsonString='" + this.f3919a + "', parsedJson=" + this.f3920b.toString() + ", productId='" + this.f3921c + "', productType='" + this.f3922d + "', title='" + this.f3923e + "', productDetailsToken='" + this.f3926h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
