package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class i31 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9822a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9823b;

    private i31(w85 w85Var, w85 w85Var2) {
        this.f9822a = w85Var;
        this.f9823b = w85Var2;
    }

    public static i31 a(w85 w85Var, w85 w85Var2) {
        return new i31(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((sl2) this.f9822a).b(), ((Integer) s2.b0.c().d(uy.Cd)).intValue(), (ScheduledExecutorService) this.f9823b.b());
    }
}
