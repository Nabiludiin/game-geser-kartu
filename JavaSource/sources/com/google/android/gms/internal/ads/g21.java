package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class g21 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8623a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8624b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8625c;

    private g21(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f8623a = w85Var;
        this.f8624b = w85Var2;
        this.f8625c = w85Var3;
    }

    public static g21 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new g21(w85Var, w85Var2, w85Var3);
    }

    public static ed1 d(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.e eVar, rx1 rx1Var) {
        return new ed1(scheduledExecutorService, eVar, rx1Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ed1 b() {
        return d((ScheduledExecutorService) this.f8623a.b(), (com.google.android.gms.common.util.e) this.f8624b.b(), (rx1) this.f8625c.b());
    }
}
