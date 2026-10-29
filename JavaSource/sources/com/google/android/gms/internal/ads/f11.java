package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class f11 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7961a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7962b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7963c;

    private f11(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f7961a = w85Var;
        this.f7962b = w85Var2;
        this.f7963c = w85Var3;
    }

    public static f11 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new f11(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        w2.a a8 = ((ev0) this.f7961a).a();
        JSONObject jSONObject = (JSONObject) this.f7962b.b();
        String str = (String) this.f7963c.b();
        boolean equals = "native".equals(str);
        r2.t.g();
        return new dr(UUID.randomUUID().toString(), a8, str, jSONObject, false, equals);
    }
}
