package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class qk0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14468a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14469b;

    private qk0(w85 w85Var, w85 w85Var2) {
        this.f14468a = w85Var;
        this.f14469b = w85Var2;
    }

    public static qk0 a(w85 w85Var, w85 w85Var2) {
        return new qk0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new pk0((Context) this.f14468a.b(), ((bk0) this.f14469b).b());
    }
}
