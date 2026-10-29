package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class mm1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final km1 f12306a;

    private mm1(km1 km1Var) {
        this.f12306a = km1Var;
    }

    public static mm1 c(km1 km1Var) {
        return new mm1(km1Var);
    }

    public static JSONObject d(km1 km1Var) {
        JSONObject c8 = km1Var.c();
        v85.b(c8);
        return c8;
    }

    public final JSONObject a() {
        return d(this.f12306a);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return d(this.f12306a);
    }
}
