package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
final class v02 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17314a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17315b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17316c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17317d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17318e;

    /* renamed from: f, reason: collision with root package name */
    private final int f17319f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f17320g;

    public v02(String str, String str2, String str3, int i7, String str4, int i8, boolean z7) {
        this.f17314a = str;
        this.f17315b = str2;
        this.f17316c = str3;
        this.f17317d = i7;
        this.f17318e = str4;
        this.f17319f = i8;
        this.f17320g = z7;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f17314a);
        jSONObject.put("version", this.f17316c);
        if (((Boolean) s2.b0.c().d(uy.qa)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f17315b);
        }
        jSONObject.put("status", this.f17317d);
        jSONObject.put("description", this.f17318e);
        jSONObject.put("initializationLatencyMillis", this.f17319f);
        if (((Boolean) s2.b0.c().d(uy.ra)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f17320g);
        }
        return jSONObject;
    }
}
