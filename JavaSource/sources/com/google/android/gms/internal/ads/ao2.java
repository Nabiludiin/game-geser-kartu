package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ao2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5191a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5192b;

    private ao2(w85 w85Var, w85 w85Var2) {
        this.f5191a = w85Var;
        this.f5192b = w85Var2;
    }

    public static ao2 a(w85 w85Var, w85 w85Var2) {
        return new ao2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((dq2) this.f5191a).b(), ((Integer) s2.b0.c().d(uy.kd)).intValue(), (ScheduledExecutorService) this.f5192b.b());
    }
}
