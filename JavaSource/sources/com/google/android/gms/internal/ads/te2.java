package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class te2 implements ma2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16153a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ev1 f16154b;

    public te2(ev1 ev1Var) {
        this.f16154b = ev1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final na2 a(String str, JSONObject jSONObject) {
        na2 na2Var;
        synchronized (this) {
            try {
                Map map = this.f16153a;
                na2Var = (na2) map.get(str);
                if (na2Var == null) {
                    na2Var = new na2(this.f16154b.a(str, jSONObject), new cc2(), str);
                    map.put(str, na2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return na2Var;
    }
}
