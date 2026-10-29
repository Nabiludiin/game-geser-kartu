package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ht2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9684a;

    public ht2(String str) {
        this.f9684a = str;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f9684a);
        } catch (JSONException e8) {
            v2.n1.l("Failed putting Ad ID.", e8);
        }
    }
}
