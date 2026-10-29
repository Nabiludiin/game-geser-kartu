package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class m40 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final n40 f12067a;

    public m40(n40 n40Var) {
        this.f12067a = n40Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        if (this.f12067a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i7 = v2.n1.f26802b;
            w2.p.e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = v2.r0.l(new JSONObject((String) map.get("info")));
            } catch (JSONException e8) {
                int i8 = v2.n1.f26802b;
                w2.p.d("Failed to convert ad metadata to JSON.", e8);
            }
        }
        if (bundle != null) {
            this.f12067a.n(str, bundle);
        } else {
            int i9 = v2.n1.f26802b;
            w2.p.c("Failed to convert ad metadata to Bundle.");
        }
    }
}
