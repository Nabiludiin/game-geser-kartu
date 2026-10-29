package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class eb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7522a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7523b;

    private eb2(w85 w85Var, w85 w85Var2) {
        this.f7522a = w85Var;
        this.f7523b = w85Var2;
    }

    public static eb2 c(w85 w85Var, w85 w85Var2) {
        return new eb2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final db2 b() {
        return new db2((Context) this.f7522a.b(), (u11) this.f7523b.b());
    }
}
