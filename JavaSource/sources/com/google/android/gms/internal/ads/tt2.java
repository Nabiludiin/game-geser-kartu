package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class tt2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f16360a;

    tt2(Context context) {
        this.f16360a = ah0.b(context, w2.a.M0());
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return ((Boolean) s2.b0.c().d(uy.Xc)).booleanValue() ? p64.a(rt2.f15216a) : p64.a(new wr2() { // from class: com.google.android.gms.internal.ads.st2
            @Override // com.google.android.gms.internal.ads.wr2
            public /* synthetic */ void b(Object obj) {
                vr2.a(this, obj);
            }

            @Override // com.google.android.gms.internal.ads.wr2
            public final /* synthetic */ void d(Object obj) {
                tt2.this.c((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 46;
    }

    final /* synthetic */ void c(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f16360a);
        } catch (JSONException unused) {
            v2.n1.k("Failed putting version constants.");
        }
    }
}
