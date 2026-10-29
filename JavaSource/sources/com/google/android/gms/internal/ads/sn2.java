package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class sn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15724a;

    private sn2(w85 w85Var, w85 w85Var2) {
        this.f15724a = w85Var2;
    }

    public static sn2 a(w85 w85Var, w85 w85Var2) {
        return new sn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(po2.c(), ((Integer) s2.b0.c().d(uy.md)).intValue(), (ScheduledExecutorService) this.f15724a.b());
    }
}
