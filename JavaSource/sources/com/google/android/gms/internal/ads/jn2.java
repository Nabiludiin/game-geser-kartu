package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class jn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10658a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10659b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10660c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f10661d;

    private jn2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f10658a = w85Var;
        this.f10659b = w85Var2;
        this.f10660c = w85Var3;
        this.f10661d = w85Var4;
    }

    public static jn2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new jn2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        vk2 b8 = ((xk2) this.f10658a).b();
        dm2 dm2Var = (dm2) this.f10659b.b();
        List list = (List) this.f10660c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10661d.b();
        if (list.contains("10")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.hd)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.hd)).intValue(), scheduledExecutorService);
    }
}
