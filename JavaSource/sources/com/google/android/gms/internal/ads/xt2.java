package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class xt2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19024a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19025b;

    public xt2(String str, String str2) {
        this.f19024a = str;
        this.f19025b = str2;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            JSONObject h8 = v2.r0.h((JSONObject) obj, "pii");
            h8.put("doritos", this.f19024a);
            h8.put("doritos_v2", this.f19025b);
        } catch (JSONException unused) {
            v2.n1.k("Failed putting doritos string.");
        }
    }
}
