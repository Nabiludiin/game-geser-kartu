package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ta0 implements fa0 {

    /* renamed from: a, reason: collision with root package name */
    private final ha0 f16060a;

    /* renamed from: b, reason: collision with root package name */
    private final ia0 f16061b;

    /* renamed from: c, reason: collision with root package name */
    private final ba0 f16062c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16063d;

    ta0(ba0 ba0Var, String str, ia0 ia0Var, ha0 ha0Var) {
        this.f16062c = ba0Var;
        this.f16063d = str;
        this.f16061b = ia0Var;
        this.f16060a = ha0Var;
    }

    final /* synthetic */ void a(u90 u90Var, ca0 ca0Var, Object obj, im0 im0Var) {
        try {
            r2.t.g();
            String uuid = UUID.randomUUID().toString();
            x50.f18556o.b(uuid, new sa0(this, u90Var, im0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.f16061b.b(obj));
            ca0Var.c(this.f16063d, jSONObject);
        } catch (Exception e8) {
            try {
                im0Var.e(e8);
                int i7 = v2.n1.f26802b;
                w2.p.d("Unable to invokeJavascript", e8);
            } finally {
                u90Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fa0
    public final a5.d b(Object obj) {
        im0 im0Var = new im0();
        u90 b8 = this.f16062c.b(null);
        v2.n1.k("callJs > getEngine: Promise created");
        b8.a(new qa0(this, b8, obj, im0Var), new ra0(this, im0Var, b8));
        return im0Var;
    }

    final /* synthetic */ ha0 c() {
        return this.f16060a;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final a5.d d(Object obj) {
        return b(obj);
    }
}
