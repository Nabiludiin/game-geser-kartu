package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class m11 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12012a;

    private m11(w85 w85Var) {
        this.f12012a = w85Var;
    }

    public static m11 a(w85 w85Var) {
        return new m11(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return new JSONObject(((j51) this.f12012a).a().f6200z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
