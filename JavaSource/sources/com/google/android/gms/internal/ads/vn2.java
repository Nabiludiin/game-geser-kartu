package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class vn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17682a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17683b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17684c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f17685d;

    private vn2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f17682a = w85Var;
        this.f17683b = w85Var2;
        this.f17684c = w85Var3;
        this.f17685d = w85Var4;
    }

    public static vn2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new vn2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        dp2 b8 = ((fp2) this.f17682a).b();
        dm2 dm2Var = (dm2) this.f17683b.b();
        List list = (List) this.f17684c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17685d.b();
        if (list.contains("60")) {
            return new fq2(dm2Var, ((Integer) s2.b0.c().d(uy.Rd)).intValue(), scheduledExecutorService);
        }
        return new fq2(b8, ((Integer) s2.b0.c().d(uy.Rd)).intValue(), scheduledExecutorService);
    }
}
