package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ln2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11681a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11682b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11683c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f11684d;

    private ln2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f11681a = w85Var;
        this.f11682b = w85Var2;
        this.f11683c = w85Var3;
        this.f11684d = w85Var4;
    }

    public static ln2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new ln2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ml2 b8 = ((pl2) this.f11681a).b();
        dm2 dm2Var = (dm2) this.f11682b.b();
        List list = (List) this.f11683c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11684d.b();
        if (list.contains("13")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.qd)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.qd)).intValue(), scheduledExecutorService);
    }
}
