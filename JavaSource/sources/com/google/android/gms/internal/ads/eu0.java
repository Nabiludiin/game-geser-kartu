package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class eu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7822a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7823b;

    private eu0(w85 w85Var, w85 w85Var2) {
        this.f7822a = w85Var;
        this.f7823b = w85Var2;
    }

    public static eu0 a(w85 w85Var, w85 w85Var2) {
        return new eu0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new du0((pt0) this.f7822a.b(), (ScheduledExecutorService) this.f7823b.b());
    }
}
