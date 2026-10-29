package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class co2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6545a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6546b;

    private co2(w85 w85Var, w85 w85Var2) {
        this.f6545a = w85Var;
        this.f6546b = w85Var2;
    }

    public static co2 a(w85 w85Var, w85 w85Var2) {
        return new co2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((sq2) this.f6545a).b(), ((Integer) s2.b0.c().d(uy.gd)).intValue(), (ScheduledExecutorService) this.f6546b.b());
    }
}
