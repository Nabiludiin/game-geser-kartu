package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class sa0 implements p60 {

    /* renamed from: a, reason: collision with root package name */
    private final u90 f15512a;

    /* renamed from: b, reason: collision with root package name */
    private final im0 f15513b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ta0 f15514c;

    public sa0(ta0 ta0Var, u90 u90Var, im0 im0Var) {
        Objects.requireNonNull(ta0Var);
        this.f15514c = ta0Var;
        this.f15512a = u90Var;
        this.f15513b = im0Var;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f15513b.b(this.f15514c.c().a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e8) {
                this.f15513b.e(e8);
            }
        } finally {
            this.f15512a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void v(String str) {
        try {
            if (str == null) {
                this.f15513b.e(new ea0());
            } else {
                this.f15513b.e(new ea0(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f15512a.g();
            throw th;
        }
        this.f15512a.g();
    }
}
