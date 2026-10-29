package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class qb3 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f14357a;

    /* renamed from: b, reason: collision with root package name */
    private final yb3 f14358b;

    public qb3(yb3 yb3Var) {
        this.f14358b = yb3Var;
    }

    public final void a(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.f14358b.a(new bc3(this, hashSet, jSONObject, j7));
    }

    public final void b(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.f14358b.a(new ac3(this, hashSet, jSONObject, j7));
    }

    public final void c() {
        this.f14358b.a(new zb3(this));
    }

    public final JSONObject d() {
        return this.f14357a;
    }

    public final void e(JSONObject jSONObject) {
        this.f14357a = jSONObject;
    }
}
