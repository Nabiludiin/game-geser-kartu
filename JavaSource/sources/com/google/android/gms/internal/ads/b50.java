package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: MyApplication */
final class b50 implements y50 {
    b50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        try {
            String str = (String) map.get("enabled");
            y50 y50Var = x50.f18542a;
            if (!zw3.e("true", str) && !zw3.e("false", str)) {
                return;
            }
            lh3.a(mr0Var.getContext()).d(Boolean.parseBoolean(str));
        } catch (IOException e8) {
            r2.t.l().i(e8, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
