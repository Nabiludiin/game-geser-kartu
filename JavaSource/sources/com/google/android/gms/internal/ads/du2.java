package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class du2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final List f7310a;

    public du2(List list) {
        this.f7310a = list;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f7310a));
        } catch (JSONException unused) {
            v2.n1.k("Failed putting experiment ids.");
        }
    }
}
