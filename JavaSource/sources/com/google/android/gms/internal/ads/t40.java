package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class t40 implements y50 {
    t40() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject h8;
        mr0 mr0Var = (mr0) obj;
        x10 F0 = mr0Var.F0();
        if (F0 == null || (h8 = F0.h()) == null) {
            mr0Var.a("nativeClickMetaReady", new JSONObject());
        } else {
            mr0Var.a("nativeClickMetaReady", h8);
        }
    }
}
