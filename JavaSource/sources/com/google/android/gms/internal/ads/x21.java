package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class x21 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final o21 f18517a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18518b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f18519c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f18520d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f18521e;

    private x21(o21 o21Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f18517a = o21Var;
        this.f18518b = w85Var;
        this.f18519c = w85Var2;
        this.f18520d = w85Var3;
        this.f18521e = w85Var4;
    }

    public static x21 a(o21 o21Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new x21(o21Var, w85Var, w85Var2, w85Var3, w85Var4);
    }

    public static hi1 c(o21 o21Var, final Context context, final w2.a aVar, final c03 c03Var, final w03 w03Var) {
        return new hi1(new qb1() { // from class: com.google.android.gms.internal.ads.n21
            @Override // com.google.android.gms.internal.ads.qb1
            public final /* synthetic */ void f() {
                w03 w03Var2 = w03Var;
                JSONObject jSONObject = c03Var.C;
                r2.t.s().g(context, aVar.f27051q, jSONObject.toString(), w03Var2.f17961g);
            }
        }, cm0.f6506g);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return c(this.f18517a, (Context) this.f18518b.b(), ((ev0) this.f18519c).a(), ((j51) this.f18520d).a(), ((n91) this.f18521e).a());
    }
}
