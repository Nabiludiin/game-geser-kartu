package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class rj2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final a5.d f14950a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14951b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f14952c;

    rj2(a5.d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f14950a = dVar;
        this.f14951b = executor;
        this.f14952c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        a5.d dVar = this.f14950a;
        qj2 qj2Var = qj2.f14462a;
        Executor executor = this.f14951b;
        a5.d j7 = p64.j(dVar, qj2Var, executor);
        if (((Integer) s2.b0.c().d(uy.zd)).intValue() > 0) {
            j7 = p64.i(j7, ((Integer) s2.b0.c().d(r1)).intValue(), TimeUnit.MILLISECONDS, this.f14952c);
        }
        return p64.h(j7, Throwable.class, pj2.f13899a, executor);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 6;
    }
}
