package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class go2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9048a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9049b;

    private go2(w85 w85Var, w85 w85Var2) {
        this.f9048a = w85Var;
        this.f9049b = w85Var2;
    }

    public static go2 a(w85 w85Var, w85 w85Var2) {
        return new go2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2((dm2) this.f9048a.b(), ((Integer) s2.b0.c().d(uy.cd)).intValue(), (ScheduledExecutorService) this.f9049b.b());
    }
}
