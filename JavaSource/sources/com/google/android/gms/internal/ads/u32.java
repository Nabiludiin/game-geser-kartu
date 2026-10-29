package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class u32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16564a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16565b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16566c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f16567d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f16568e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f16569f;

    private u32(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f16564a = w85Var;
        this.f16565b = w85Var2;
        this.f16566c = w85Var3;
        this.f16567d = w85Var5;
        this.f16568e = w85Var6;
        this.f16569f = w85Var7;
    }

    public static u32 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new u32(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new t32(((ou0) this.f16564a).a(), ((n91) this.f16565b).a(), ((u22) this.f16566c).b(), z33.c(), (ScheduledExecutorService) this.f16567d.b(), (r72) this.f16568e.b(), (b63) this.f16569f.b());
    }
}
