package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class nn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12814a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12815b;

    private nn2(w85 w85Var, w85 w85Var2) {
        this.f12814a = w85Var;
        this.f12815b = w85Var2;
    }

    public static nn2 a(w85 w85Var, w85 w85Var2) {
        return new nn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((zl2) this.f12814a).b(), ((Integer) s2.b0.c().d(uy.od)).intValue(), (ScheduledExecutorService) this.f12815b.b());
    }
}
