package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* compiled from: MyApplication */
abstract class n0 {
    static final d A;
    static final d B;
    static final d C;
    static final d D;
    static final d E;
    static final d F;

    /* renamed from: a, reason: collision with root package name */
    static final d f4008a;

    /* renamed from: b, reason: collision with root package name */
    static final d f4009b;

    /* renamed from: c, reason: collision with root package name */
    static final d f4010c;

    /* renamed from: d, reason: collision with root package name */
    static final d f4011d;

    /* renamed from: e, reason: collision with root package name */
    static final d f4012e;

    /* renamed from: f, reason: collision with root package name */
    static final d f4013f;

    /* renamed from: g, reason: collision with root package name */
    static final d f4014g;

    /* renamed from: h, reason: collision with root package name */
    static final d f4015h;

    /* renamed from: i, reason: collision with root package name */
    static final d f4016i;

    /* renamed from: j, reason: collision with root package name */
    static final d f4017j;

    /* renamed from: k, reason: collision with root package name */
    static final d f4018k;

    /* renamed from: l, reason: collision with root package name */
    static final d f4019l;

    /* renamed from: m, reason: collision with root package name */
    static final d f4020m;

    /* renamed from: n, reason: collision with root package name */
    static final d f4021n;

    /* renamed from: o, reason: collision with root package name */
    static final d f4022o;

    /* renamed from: p, reason: collision with root package name */
    static final d f4023p;

    /* renamed from: q, reason: collision with root package name */
    static final d f4024q;

    /* renamed from: r, reason: collision with root package name */
    static final d f4025r;

    /* renamed from: s, reason: collision with root package name */
    static final d f4026s;

    /* renamed from: t, reason: collision with root package name */
    static final d f4027t;

    /* renamed from: u, reason: collision with root package name */
    static final d f4028u;

    /* renamed from: v, reason: collision with root package name */
    static final d f4029v;

    /* renamed from: w, reason: collision with root package name */
    static final d f4030w;

    /* renamed from: x, reason: collision with root package name */
    static final d f4031x;

    /* renamed from: y, reason: collision with root package name */
    static final d f4032y;

    /* renamed from: z, reason: collision with root package name */
    static final d f4033z;

    static {
        d.a d8 = d.d();
        d8.d(3);
        d8.b("Google Play In-app Billing API version is less than 3");
        d8.a();
        d.a d9 = d.d();
        d9.d(3);
        d9.b("Google Play In-app Billing API version is less than 9");
        f4008a = d9.a();
        d.a d10 = d.d();
        d10.d(3);
        d10.b("Billing service unavailable on device.");
        f4009b = d10.a();
        d.a d11 = d.d();
        d11.d(2);
        d11.b("Billing service unavailable on device.");
        f4010c = d11.a();
        d.a d12 = d.d();
        d12.d(5);
        d12.b("Client is already in the process of connecting to billing service.");
        f4011d = d12.a();
        d.a d13 = d.d();
        d13.d(5);
        d13.b("The list of SKUs can't be empty.");
        d13.a();
        d.a d14 = d.d();
        d14.d(5);
        d14.b("SKU type can't be empty.");
        d14.a();
        d.a d15 = d.d();
        d15.d(5);
        d15.b("Product type can't be empty.");
        f4012e = d15.a();
        d.a d16 = d.d();
        d16.d(-2);
        d16.b("Client does not support extra params.");
        f4013f = d16.a();
        d.a d17 = d.d();
        d17.d(5);
        d17.b("Invalid purchase token.");
        f4014g = d17.a();
        d.a d18 = d.d();
        d18.d(6);
        d18.b("An internal error occurred.");
        f4015h = d18.a();
        d.a d19 = d.d();
        d19.d(5);
        d19.b("SKU can't be null.");
        d19.a();
        d.a d20 = d.d();
        d20.d(0);
        f4016i = d20.a();
        d.a d21 = d.d();
        d21.d(-1);
        d21.b("Service connection is disconnected.");
        f4017j = d21.a();
        d.a d22 = d.d();
        d22.d(2);
        d22.b("Timeout communicating with service.");
        f4018k = d22.a();
        d.a d23 = d.d();
        d23.d(-2);
        d23.b("Client does not support subscriptions.");
        f4019l = d23.a();
        d.a d24 = d.d();
        d24.d(-2);
        d24.b("Client does not support subscriptions update.");
        f4020m = d24.a();
        d.a d25 = d.d();
        d25.d(-2);
        d25.b("Client does not support get purchase history.");
        d25.a();
        d.a d26 = d.d();
        d26.d(-2);
        d26.b("Client does not support price change confirmation.");
        f4021n = d26.a();
        d.a d27 = d.d();
        d27.d(-2);
        d27.b("Play Store version installed does not support cross selling products.");
        f4022o = d27.a();
        d.a d28 = d.d();
        d28.d(-2);
        d28.b("Client does not support multi-item purchases.");
        f4023p = d28.a();
        d.a d29 = d.d();
        d29.d(-2);
        d29.b("Client does not support offer_id_token.");
        f4024q = d29.a();
        d.a d30 = d.d();
        d30.d(-2);
        d30.b("Client does not support ProductDetails.");
        f4025r = d30.a();
        d.a d31 = d.d();
        d31.d(-2);
        d31.b("Client does not support in-app messages.");
        f4026s = d31.a();
        d.a d32 = d.d();
        d32.d(-2);
        d32.b("Client does not support user choice billing.");
        d32.a();
        d.a d33 = d.d();
        d33.d(-2);
        d33.b("Play Store version installed does not support external offer.");
        f4027t = d33.a();
        d.a d34 = d.d();
        d34.d(-2);
        d34.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f4028u = d34.a();
        d.a d35 = d.d();
        d35.d(-2);
        d35.b("Play Store version installed does not support querying AutoPay plan purchase.");
        f4029v = d35.a();
        d.a d36 = d.d();
        d36.d(-2);
        d36.b("Play Store version installed does not support including suspended subscriptions.");
        f4030w = d36.a();
        d.a d37 = d.d();
        d37.d(5);
        d37.b("Unknown feature");
        f4031x = d37.a();
        d.a d38 = d.d();
        d38.d(-2);
        d38.b("Play Store version installed does not support get billing config.");
        f4032y = d38.a();
        d.a d39 = d.d();
        d39.d(-2);
        d39.b("Query product details with serialized docid is not supported.");
        f4033z = d39.a();
        d.a d40 = d.d();
        d40.d(-2);
        d40.b("Play Store version installed does not support launching external offer flow.");
        A = d40.a();
        d.a d41 = d.d();
        d41.d(4);
        d41.b("Item is unavailable for purchase.");
        B = d41.a();
        d.a d42 = d.d();
        d42.d(-2);
        d42.b("Query product details with developer specified account is not supported.");
        C = d42.a();
        d.a d43 = d.d();
        d43.d(-2);
        d43.b("Play Store version installed does not support alternative billing only.");
        D = d43.a();
        d.a d44 = d.d();
        d44.d(5);
        d44.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        E = d44.a();
        d.a d45 = d.d();
        d45.d(6);
        d45.b("An error occurred while retrieving billing override.");
        F = d45.a();
        d.a d46 = d.d();
        d46.d(-2);
        d46.b("Play Store version installed does not support the provided billing program.");
        d46.a();
    }

    static d a(int i7, String str) {
        d.a d8 = d.d();
        d8.d(i7);
        d8.b(str);
        return d8.a();
    }
}
