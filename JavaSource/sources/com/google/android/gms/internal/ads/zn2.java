package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class zn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f20244a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f20245b;

    private zn2(w85 w85Var, w85 w85Var2) {
        this.f20244a = w85Var;
        this.f20245b = w85Var2;
    }

    public static zn2 a(w85 w85Var, w85 w85Var2) {
        return new zn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((zp2) this.f20244a).b(), ((Integer) s2.b0.c().d(uy.id)).intValue(), (ScheduledExecutorService) this.f20245b.b());
    }
}
