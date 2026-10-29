package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class tj2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16220a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16221b;

    private tj2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f16220a = w85Var;
        this.f16221b = w85Var3;
    }

    public static tj2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new tj2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new rj2((a5.d) this.f16220a.b(), z33.c(), (ScheduledExecutorService) this.f16221b.b());
    }
}
