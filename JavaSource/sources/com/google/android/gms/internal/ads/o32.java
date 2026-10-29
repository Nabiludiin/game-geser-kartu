package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class o32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13174a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13175b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f13176c;

    private o32(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f13174a = w85Var;
        this.f13175b = w85Var4;
        this.f13176c = w85Var5;
    }

    public static o32 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new o32(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n32 b() {
        return new n32((ScheduledExecutorService) this.f13174a.b(), z33.c(), f43.c(), ((o42) this.f13175b).b(), m85.c(this.f13176c));
    }
}
