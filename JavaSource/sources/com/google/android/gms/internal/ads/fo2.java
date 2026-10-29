package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class fo2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8365a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8366b;

    private fo2(w85 w85Var, w85 w85Var2) {
        this.f8365a = w85Var;
        this.f8366b = w85Var2;
    }

    public static fo2 a(w85 w85Var, w85 w85Var2) {
        return new fo2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((ur2) this.f8365a).b(), ((Integer) s2.b0.c().d(uy.dd)).intValue(), (ScheduledExecutorService) this.f8366b.b());
    }
}
