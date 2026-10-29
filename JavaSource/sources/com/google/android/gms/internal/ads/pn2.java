package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class pn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13967a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13968b;

    private pn2(w85 w85Var, w85 w85Var2) {
        this.f13967a = w85Var;
        this.f13968b = w85Var2;
    }

    public static pn2 a(w85 w85Var, w85 w85Var2) {
        return new pn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((lm2) this.f13967a).b(), ((Integer) s2.b0.c().d(uy.wd)).intValue(), (ScheduledExecutorService) this.f13968b.b());
    }
}
