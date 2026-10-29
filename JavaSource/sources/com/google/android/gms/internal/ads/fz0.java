package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
final class fz0 implements ry0 {
    fz0() {
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        if (!((Boolean) s2.b0.c().d(uy.vb)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        r2.t.l().q().s(Boolean.parseBoolean(str));
    }
}
