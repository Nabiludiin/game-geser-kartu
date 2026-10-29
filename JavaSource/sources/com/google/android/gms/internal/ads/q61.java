package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class q61 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14271a;

    private q61(w85 w85Var, w85 w85Var2) {
        this.f14271a = w85Var;
    }

    public static q61 a(w85 w85Var, w85 w85Var2) {
        return new q61(w85Var, w85Var2);
    }

    public static hi1 c(p01 p01Var, Executor executor) {
        return new hi1(p01Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return c((p01) this.f14271a.b(), z33.c());
    }
}
