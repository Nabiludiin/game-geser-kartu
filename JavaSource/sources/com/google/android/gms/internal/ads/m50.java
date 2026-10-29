package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class m50 implements y50 {
    m50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        if (map.containsKey("start")) {
            mr0Var.Z0(true);
        }
        if (map.containsKey("stop")) {
            mr0Var.Z0(false);
        }
    }
}
