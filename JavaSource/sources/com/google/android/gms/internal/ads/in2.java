package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class in2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10095a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10096b;

    private in2(w85 w85Var, w85 w85Var2) {
        this.f10095a = w85Var;
        this.f10096b = w85Var2;
    }

    public static in2 a(w85 w85Var, w85 w85Var2) {
        return new in2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((pk2) this.f10095a).b(), ((Integer) s2.b0.c().d(uy.Dd)).intValue(), (ScheduledExecutorService) this.f10096b.b());
    }
}
