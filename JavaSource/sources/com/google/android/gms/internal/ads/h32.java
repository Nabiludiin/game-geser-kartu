package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class h32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9301a;

    private h32(w85 w85Var, w85 w85Var2) {
        this.f9301a = w85Var;
    }

    public static h32 c(w85 w85Var, w85 w85Var2) {
        return new h32(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e42 b() {
        return new e42((Context) this.f9301a.b(), z33.c());
    }
}
