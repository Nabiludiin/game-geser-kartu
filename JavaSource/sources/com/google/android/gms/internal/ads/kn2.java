package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class kn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11144a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11145b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11146c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f11147d;

    private kn2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f11144a = w85Var;
        this.f11145b = w85Var2;
        this.f11146c = w85Var3;
        this.f11147d = w85Var4;
    }

    public static kn2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new kn2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        il2 b8 = ((kl2) this.f11144a).b();
        dm2 dm2Var = (dm2) this.f11145b.b();
        List list = (List) this.f11146c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11147d.b();
        if (list.contains("54")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.rd)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.rd)).intValue(), scheduledExecutorService);
    }
}
