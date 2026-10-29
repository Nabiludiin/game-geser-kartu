package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class h31 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9299a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9300b;

    private h31(w85 w85Var, w85 w85Var2) {
        this.f9299a = w85Var;
        this.f9300b = w85Var2;
    }

    public static h31 a(w85 w85Var, w85 w85Var2) {
        return new h31(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((gj2) this.f9299a).b(), ((Integer) s2.b0.c().d(uy.xd)).intValue(), (ScheduledExecutorService) this.f9300b.b());
    }
}
