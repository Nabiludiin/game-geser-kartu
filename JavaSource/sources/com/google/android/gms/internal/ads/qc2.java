package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class qc2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14372a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14373b;

    private qc2(w85 w85Var, w85 w85Var2) {
        this.f14372a = w85Var;
        this.f14373b = w85Var2;
    }

    public static qc2 c(w85 w85Var, w85 w85Var2) {
        return new qc2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pc2 b() {
        return new pc2((Context) this.f14372a.b(), (al1) this.f14373b.b());
    }
}
