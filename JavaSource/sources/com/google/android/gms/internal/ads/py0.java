package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class py0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14154a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14155b;

    py0(Map map, Map map2) {
        this.f14154a = map;
        this.f14155b = map2;
    }

    public final void a(o03 o03Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (m03 m03Var : o03Var.f13137b.f12531c) {
            Map map = this.f14154a;
            String str = m03Var.f12005a;
            if (!map.containsKey(str) || (jSONObject2 = m03Var.f12006b) == null) {
                Map map2 = this.f14155b;
                if (map2.containsKey(str) && (jSONObject = m03Var.f12006b) != null) {
                    ry0 ry0Var = (ry0) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    ry0Var.a(hashMap);
                }
            } else {
                ((sy0) map.get(str)).a(jSONObject2);
            }
        }
    }
}
