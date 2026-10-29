package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class rn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15121a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15122b;

    private rn2(w85 w85Var, w85 w85Var2) {
        this.f15121a = w85Var;
        this.f15122b = w85Var2;
    }

    public static rn2 a(w85 w85Var, w85 w85Var2) {
        return new rn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fq2(((lo2) this.f15121a).b(), ((Integer) s2.b0.c().d(uy.nd)).intValue(), (ScheduledExecutorService) this.f15122b.b());
    }
}
