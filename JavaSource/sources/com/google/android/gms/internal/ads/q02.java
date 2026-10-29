package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class q02 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14205a;

    private q02(w85 w85Var, w85 w85Var2) {
        this.f14205a = w85Var;
    }

    public static q02 a(w85 w85Var, w85 w85Var2) {
        return new q02(w85Var, w85Var2);
    }

    public static hi1 c(p02 p02Var, Executor executor) {
        return new hi1(p02Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return c((p02) this.f14205a.b(), z33.c());
    }
}
