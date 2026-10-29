package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class za0 implements p60 {

    /* renamed from: a, reason: collision with root package name */
    private final im0 f20099a;

    public za0(cb0 cb0Var, im0 im0Var) {
        Objects.requireNonNull(cb0Var);
        this.f20099a = im0Var;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void a(JSONObject jSONObject) {
        try {
            this.f20099a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e8) {
            this.f20099a.e(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void v(String str) {
        try {
            if (str == null) {
                this.f20099a.e(new ea0());
            } else {
                this.f20099a.e(new ea0(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
