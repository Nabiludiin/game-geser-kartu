package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class dk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7141a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7142b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7143c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f7144d;

    private dk1(wj1 wj1Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f7141a = w85Var;
        this.f7142b = w85Var2;
        this.f7143c = w85Var3;
        this.f7144d = w85Var4;
    }

    public static dk1 a(wj1 wj1Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new dk1(wj1Var, w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.f7141a.b();
        final w2.a a8 = ((ev0) this.f7142b).a();
        final c03 a9 = ((j51) this.f7143c).a();
        final w03 a10 = ((n91) this.f7144d).a();
        return new hi1(new qb1() { // from class: com.google.android.gms.internal.ads.uj1
            @Override // com.google.android.gms.internal.ads.qb1
            public final /* synthetic */ void f() {
                w03 w03Var = a10;
                JSONObject jSONObject = a9.C;
                r2.t.s().g(context, a8.f27051q, jSONObject.toString(), w03Var.f17961g);
            }
        }, cm0.f6506g);
    }
}
