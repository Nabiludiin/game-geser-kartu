package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class do2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7188a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7189b;

    private do2(w85 w85Var, w85 w85Var2) {
        this.f7188a = w85Var;
        this.f7189b = w85Var2;
    }

    public static do2 a(w85 w85Var, w85 w85Var2) {
        return new do2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((jr2) this.f7188a).b(), ((Integer) s2.b0.c().d(uy.fd)).intValue(), (ScheduledExecutorService) this.f7189b.b());
    }
}
