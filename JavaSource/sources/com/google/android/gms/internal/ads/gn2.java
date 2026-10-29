package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class gn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9035a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9036b;

    private gn2(w85 w85Var, w85 w85Var2) {
        this.f9035a = w85Var;
        this.f9036b = w85Var2;
    }

    public static gn2 a(w85 w85Var, w85 w85Var2) {
        return new gn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((ak2) this.f9035a).b(), ((Integer) s2.b0.c().d(uy.td)).intValue(), (ScheduledExecutorService) this.f9036b.b());
    }
}
