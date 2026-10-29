package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class mt2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12413a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12414b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12415c;

    private mt2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f12413a = w85Var;
        this.f12414b = w85Var3;
        this.f12415c = w85Var4;
    }

    public static mt2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new mt2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    public static kt2 c(String str, kt ktVar, ql0 ql0Var, ScheduledExecutorService scheduledExecutorService, z64 z64Var) {
        return new kt2(str, ktVar, ql0Var, scheduledExecutorService, z64Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new kt2(((ju2) this.f12413a).a(), cy0.a(), (ql0) this.f12414b.b(), (ScheduledExecutorService) this.f12415c.b(), z33.c());
    }
}
