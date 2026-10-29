package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class xn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18877a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18878b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f18879c;

    private xn2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f18877a = w85Var2;
        this.f18878b = w85Var3;
        this.f18879c = w85Var4;
    }

    public static xn2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new xn2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        lp2 c8 = np2.c();
        dm2 dm2Var = (dm2) this.f18877a.b();
        List list = (List) this.f18878b.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18879c.b();
        if (list.contains("24")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.jd)).intValue(), scheduledExecutorService);
        }
        return new fq2(c8, ((Integer) s2.b0.c().d(uy.jd)).intValue(), scheduledExecutorService);
    }
}
