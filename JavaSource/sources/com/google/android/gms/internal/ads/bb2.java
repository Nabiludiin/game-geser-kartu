package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class bb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5673a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5674b;

    private bb2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f5673a = w85Var;
        this.f5674b = w85Var2;
    }

    public static bb2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new bb2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new za2((Context) this.f5673a.b(), (u11) this.f5674b.b(), z33.c());
    }
}
