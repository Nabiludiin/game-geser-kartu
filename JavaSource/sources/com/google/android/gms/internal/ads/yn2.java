package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class yn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19692a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f19693b;

    private yn2(w85 w85Var, w85 w85Var2) {
        this.f19692a = w85Var;
        this.f19693b = w85Var2;
    }

    public static yn2 a(w85 w85Var, w85 w85Var2) {
        return new yn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((qp2) this.f19692a).b(), ((Integer) s2.b0.c().d(uy.Bd)).intValue(), (ScheduledExecutorService) this.f19693b.b());
    }
}
