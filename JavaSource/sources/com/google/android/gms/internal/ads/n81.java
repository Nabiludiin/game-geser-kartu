package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class n81 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12623a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12624b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12625c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f12626d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f12627e;

    private n81(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        this.f12623a = w85Var;
        this.f12624b = w85Var2;
        this.f12625c = w85Var3;
        this.f12626d = w85Var5;
        this.f12627e = w85Var6;
    }

    public static n81 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        return new n81(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new m81((pa1) this.f12623a.b(), ((j51) this.f12624b).a(), (ScheduledExecutorService) this.f12625c.b(), z33.c(), ((k51) this.f12626d).a(), (wc1) this.f12627e.b());
    }
}
