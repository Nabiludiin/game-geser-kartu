package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class hn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9586a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9587b;

    private hn2(w85 w85Var, w85 w85Var2) {
        this.f9586a = w85Var;
        this.f9587b = w85Var2;
    }

    public static hn2 a(w85 w85Var, w85 w85Var2) {
        return new hn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((kk2) this.f9586a).b(), ((Integer) s2.b0.c().d(uy.vd)).intValue(), (ScheduledExecutorService) this.f9587b.b());
    }
}
