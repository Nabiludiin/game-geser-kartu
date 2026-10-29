package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ct2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6620a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6621b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6622c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f6623d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f6624e;

    private ct2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f6620a = w85Var2;
        this.f6621b = w85Var3;
        this.f6622c = w85Var5;
        this.f6623d = w85Var6;
        this.f6624e = w85Var7;
    }

    public static ct2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new ct2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    public static zs2 c(il0 il0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z7, boolean z8) {
        return new zs2(il0Var, context, scheduledExecutorService, executor, i7, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new zs2(ky0.a(), ((ou0) this.f6620a).a(), (ScheduledExecutorService) this.f6621b.b(), z33.c(), ((ku2) this.f6622c).b().intValue(), ((lu2) this.f6623d).b().booleanValue(), ((mu2) this.f6624e).b().booleanValue());
    }
}
