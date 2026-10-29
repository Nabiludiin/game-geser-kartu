package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class bq3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5922a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5923b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f5924c;

    private bq3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f5922a = w85Var;
        this.f5923b = w85Var2;
        this.f5924c = w85Var3;
    }

    public static bq3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new bq3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new aq3((Context) this.f5922a.b(), (li3) this.f5923b.b(), (ft3) this.f5924c.b());
    }
}
