package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class qe2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14408a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14409b;

    private qe2(w85 w85Var, w85 w85Var2) {
        this.f14408a = w85Var;
        this.f14409b = w85Var2;
    }

    public static qe2 c(w85 w85Var, w85 w85Var2) {
        return new qe2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pe2 b() {
        return new pe2((Context) this.f14408a.b(), (st1) this.f14409b.b());
    }
}
