package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class dl2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7153a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7154b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7155c;

    private dl2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f7153a = w85Var;
        this.f7154b = w85Var2;
        this.f7155c = w85Var3;
    }

    public static dl2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new dl2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new bl2(((ou0) this.f7153a).a(), (ql0) this.f7154b.b(), (ScheduledExecutorService) this.f7155c.b(), z33.c());
    }
}
