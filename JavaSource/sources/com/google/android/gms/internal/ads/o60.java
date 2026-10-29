package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class o60 implements p60 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f13205a;

    o60(q60 q60Var, im0 im0Var) {
        this.f13205a = im0Var;
        Objects.requireNonNull(q60Var);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void a(JSONObject jSONObject) {
        this.f13205a.b(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void v(String str) {
        this.f13205a.e(new ea0(str));
    }
}
