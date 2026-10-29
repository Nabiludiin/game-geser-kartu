package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class h53 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9343a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9344b;

    private h53(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f9343a = w85Var2;
        this.f9344b = w85Var3;
    }

    public static h53 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new h53(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new f53(z33.c(), (ScheduledExecutorService) this.f9343a.b(), ((i53) this.f9344b).b());
    }
}
