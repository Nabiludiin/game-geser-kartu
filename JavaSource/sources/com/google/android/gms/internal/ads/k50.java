package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class k50 implements y50 {
    k50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            mr0Var.f();
        } else if ("resume".equals(str)) {
            mr0Var.e();
        }
    }
}
