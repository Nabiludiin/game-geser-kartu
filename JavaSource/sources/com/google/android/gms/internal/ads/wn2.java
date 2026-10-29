package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class wn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18330a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18331b;

    private wn2(w85 w85Var, w85 w85Var2) {
        this.f18330a = w85Var;
        this.f18331b = w85Var2;
    }

    public static wn2 a(w85 w85Var, w85 w85Var2) {
        return new wn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((jp2) this.f18330a).b(), ((Integer) s2.b0.c().d(uy.ld)).intValue(), (ScheduledExecutorService) this.f18331b.b());
    }
}
