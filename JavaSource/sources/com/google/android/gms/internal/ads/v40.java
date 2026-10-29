package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
final class v40 implements y50 {
    v40() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            v2.n1.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zv3 l7 = aw3.l();
        l7.b((String) map.get("appId"));
        l7.g(mr0Var.getWidth());
        l7.a(mr0Var.Z().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            l7.c(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            l7.c(81);
        }
        if (map.containsKey("verticalMargin")) {
            l7.d(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            l7.d(0.02f);
        }
        if (map.containsKey("enifd")) {
            l7.h((String) map.get("enifd"));
        }
        try {
            r2.t.x().c(mr0Var, l7.i());
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "DefaultGmsgHandlers.ShowLMDOverlay");
            v2.n1.k("Missing parameters for LMD Overlay show request");
        }
    }
}
