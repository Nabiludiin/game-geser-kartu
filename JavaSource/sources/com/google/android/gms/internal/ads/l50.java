package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class l50 implements y50 {
    l50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        if (map.containsKey("start")) {
            mr0Var.s0().w();
        } else if (map.containsKey("stop")) {
            mr0Var.s0().p();
        } else if (map.containsKey("cancel")) {
            mr0Var.s0().r();
        }
    }
}
