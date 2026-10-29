package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class n93 {

    /* renamed from: a, reason: collision with root package name */
    private final aa3 f12636a;

    /* renamed from: b, reason: collision with root package name */
    private final aa3 f12637b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12638c;

    /* renamed from: d, reason: collision with root package name */
    private final r93 f12639d;

    /* renamed from: e, reason: collision with root package name */
    private final v93 f12640e;

    private n93(r93 r93Var, v93 v93Var, aa3 aa3Var, aa3 aa3Var2, boolean z7) {
        this.f12639d = r93Var;
        this.f12640e = v93Var;
        this.f12636a = aa3Var;
        if (aa3Var2 == null) {
            this.f12637b = aa3.NONE;
        } else {
            this.f12637b = aa3Var2;
        }
        this.f12638c = z7;
    }

    public static n93 a(r93 r93Var, v93 v93Var, aa3 aa3Var, aa3 aa3Var2, boolean z7) {
        lb3.b(r93Var, "CreativeType is null");
        lb3.b(v93Var, "ImpressionType is null");
        lb3.b(aa3Var, "Impression owner is null");
        if (aa3Var == aa3.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (r93Var == r93.DEFINED_BY_JAVASCRIPT && aa3Var == aa3.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (v93Var == v93.DEFINED_BY_JAVASCRIPT && aa3Var == aa3.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new n93(r93Var, v93Var, aa3Var, aa3Var2, z7);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        hb3.c(jSONObject, "impressionOwner", this.f12636a);
        hb3.c(jSONObject, "mediaEventsOwner", this.f12637b);
        hb3.c(jSONObject, "creativeType", this.f12639d);
        hb3.c(jSONObject, "impressionType", this.f12640e);
        hb3.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f12638c));
        return jSONObject;
    }
}
