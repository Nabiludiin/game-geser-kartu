package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class j31 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10327a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10328b;

    private j31(w85 w85Var, w85 w85Var2) {
        this.f10327a = w85Var;
        this.f10328b = w85Var2;
    }

    public static j31 a(w85 w85Var, w85 w85Var2) {
        return new j31(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((cp2) this.f10327a).b(), ((Integer) s2.b0.c().d(uy.yd)).intValue(), (ScheduledExecutorService) this.f10328b.b());
    }
}
