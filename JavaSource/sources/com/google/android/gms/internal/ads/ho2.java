package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ho2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9594a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9595b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f9596c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f9597d;

    private ho2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f9594a = w85Var;
        this.f9595b = w85Var2;
        this.f9596c = w85Var3;
        this.f9597d = w85Var4;
    }

    public static ho2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new ho2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ps2 b8 = ((qs2) this.f9594a).b();
        dm2 dm2Var = (dm2) this.f9595b.b();
        List list = (List) this.f9596c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9597d.b();
        if (list.contains("39")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.bd)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.bd)).intValue(), scheduledExecutorService);
    }
}
