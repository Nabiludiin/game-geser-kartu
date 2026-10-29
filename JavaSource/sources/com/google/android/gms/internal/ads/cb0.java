package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class cb0 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6346a = "google.afma.activeView.handleUpdate";

    /* renamed from: b, reason: collision with root package name */
    private final a5.d f6347b;

    cb0(a5.d dVar, String str, ia0 ia0Var, ha0 ha0Var) {
        this.f6347b = dVar;
    }

    final /* synthetic */ a5.d a(Object obj, ca0 ca0Var) {
        im0 im0Var = new im0();
        r2.t.g();
        String uuid = UUID.randomUUID().toString();
        x50.f18556o.b(uuid, new za0(this, im0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        ca0Var.c(this.f6346a, jSONObject);
        return im0Var;
    }

    public final a5.d b(final Object obj) {
        return p64.j(this.f6347b, new w54() { // from class: com.google.android.gms.internal.ads.bb0
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj2) {
                return cb0.this.a(obj, (ca0) obj2);
            }
        }, cm0.f6506g);
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final a5.d d(Object obj) {
        return b(obj);
    }
}
