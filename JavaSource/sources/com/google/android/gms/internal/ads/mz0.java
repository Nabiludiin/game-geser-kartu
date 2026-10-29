package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
final class mz0 implements sy0 {

    /* renamed from: a, reason: collision with root package name */
    private final ak0 f12492a;

    mz0(ak0 ak0Var) {
        this.f12492a = ak0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ak0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.sy0
    public final void a(JSONObject jSONObject) {
        this.f12492a.d(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
