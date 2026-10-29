package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class un2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16841a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16842b;

    private un2(w85 w85Var, w85 w85Var2) {
        this.f16841a = w85Var;
        this.f16842b = w85Var2;
    }

    public static un2 a(w85 w85Var, w85 w85Var2) {
        return new un2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((yo2) this.f16841a).b(), ((Integer) s2.b0.c().d(uy.Ad)).intValue(), (ScheduledExecutorService) this.f16842b.b());
    }
}
