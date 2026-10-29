package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class e01 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7375a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7376b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7377c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f7378d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f7379e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f7380f;

    private e01(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f7375a = w85Var;
        this.f7376b = w85Var2;
        this.f7377c = w85Var3;
        this.f7378d = w85Var4;
        this.f7379e = w85Var6;
        this.f7380f = w85Var7;
    }

    public static e01 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new e01(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new d01(((ou0) this.f7375a).a(), ((ju0) this.f7376b).b(), (ga2) this.f7377c.b(), (pu1) this.f7378d.b(), z33.c(), (z64) this.f7379e.b(), (ScheduledExecutorService) this.f7380f.b());
    }
}
