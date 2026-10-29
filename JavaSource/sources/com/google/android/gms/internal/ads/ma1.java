package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ma1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12154a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12155b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12156c;

    private ma1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f12154a = w85Var;
        this.f12155b = w85Var2;
        this.f12156c = w85Var4;
    }

    public static ma1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new ma1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ka1(((la1) this.f12154a).b(), ((z85) this.f12155b).b(), z33.c(), (ScheduledExecutorService) this.f12156c.b());
    }
}
