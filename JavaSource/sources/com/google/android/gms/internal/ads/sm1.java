package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class sm1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15710a;

    private sm1(w85 w85Var, w85 w85Var2) {
        this.f15710a = w85Var;
    }

    public static sm1 a(w85 w85Var, w85 w85Var2) {
        return new sm1(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        w2.a a8 = ((ev0) this.f15710a).a();
        r2.t.g();
        return new dr(UUID.randomUUID().toString(), a8, "native", new JSONObject(), false, true);
    }
}
