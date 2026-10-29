package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class gu2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f9152a;

    public gu2(Bundle bundle) {
        this.f9152a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.f9152a;
        if (bundle != null) {
            try {
                v2.r0.h(v2.r0.h(jSONObject, "device"), "play_store").put("parental_controls", s2.z.a().u(bundle));
            } catch (JSONException unused) {
                v2.n1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
