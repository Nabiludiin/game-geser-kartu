package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class fq2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final yr2 f8408a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8409b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f8410c;

    public fq2(yr2 yr2Var, long j7, ScheduledExecutorService scheduledExecutorService) {
        this.f8408a = yr2Var;
        this.f8409b = j7;
        this.f8410c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        a5.d a8 = this.f8408a.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) s2.b0.c().d(uy.G2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j7 = this.f8409b;
        if (j7 > 0) {
            a8 = p64.i(a8, j7, timeUnit, this.f8410c);
        }
        return p64.h(a8, Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.eq2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return fq2.this.c((Throwable) obj);
            }
        }, cm0.f6506g);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return this.f8408a.b();
    }

    final /* synthetic */ a5.d c(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.E2)).booleanValue()) {
            yr2 yr2Var = this.f8408a;
            ql0 l7 = r2.t.l();
            int b8 = yr2Var.b();
            StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(b8);
            l7.i(th, sb.toString());
        }
        return p64.a(null);
    }
}
