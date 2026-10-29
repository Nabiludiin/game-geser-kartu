package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class s40 implements y50 {
    s40() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject d8;
        mr0 mr0Var = (mr0) obj;
        x10 F0 = mr0Var.F0();
        if (F0 == null || (d8 = F0.d()) == null) {
            mr0Var.a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            mr0Var.a("nativeAdViewSignalsReady", d8);
        }
    }
}
