package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class jk3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10589a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10590b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10591c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f10592d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f10593e;

    private jk3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f10589a = w85Var;
        this.f10590b = w85Var2;
        this.f10591c = w85Var3;
        this.f10592d = w85Var4;
        this.f10593e = w85Var5;
    }

    public static jk3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new jk3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        Context context = (Context) this.f10589a.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10590b.b();
        ExecutorService executorService = (ExecutorService) this.f10591c.b();
        lj3 lj3Var = (lj3) this.f10592d.b();
        li3 li3Var = (li3) this.f10593e.b();
        return new rk3(context, scheduledExecutorService, executorService, lj3Var, new Random(), li3Var.k0().d0(), li3Var.k0().f0(), li3Var.k0().g0(), li3Var.k0().e0(), li3Var.i0(), li3Var.f0() - 1);
    }
}
