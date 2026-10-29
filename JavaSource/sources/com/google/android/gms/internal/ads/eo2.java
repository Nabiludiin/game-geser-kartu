package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class eo2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7730a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7731b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7732c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f7733d;

    private eo2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f7730a = w85Var;
        this.f7731b = w85Var2;
        this.f7732c = w85Var3;
        this.f7733d = w85Var4;
    }

    public static eo2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new eo2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        lr2 b8 = ((nr2) this.f7730a).b();
        dm2 dm2Var = (dm2) this.f7731b.b();
        List list = (List) this.f7732c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7733d.b();
        if (list.contains("35")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.ed)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.ed)).intValue(), scheduledExecutorService);
    }
}
