package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class ka1 extends eg1 implements aa1 {

    /* renamed from: r, reason: collision with root package name */
    private final ScheduledExecutorService f10937r;

    /* renamed from: s, reason: collision with root package name */
    private ScheduledFuture f10938s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10939t;

    public ka1(fa1 fa1Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f10939t = false;
        this.f10937r = scheduledExecutorService;
        super.y0(fa1Var, executor);
    }

    public final void U0() {
        this.f10938s = this.f10937r.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ha1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ka1.this.e();
            }
        }, ((Integer) s2.b0.c().d(uy.Kb)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.f10938s;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void b1(final s2.x2 x2Var) {
        K0(new dg1() { // from class: com.google.android.gms.internal.ads.ja1
            @Override // com.google.android.gms.internal.ads.dg1
            public final /* synthetic */ void d(Object obj) {
                ((aa1) obj).b1(s2.x2.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c() {
        K0(ba1.f5654a);
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c1(final hl1 hl1Var) {
        if (this.f10939t) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f10938s;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        K0(new dg1() { // from class: com.google.android.gms.internal.ads.ga1
            @Override // com.google.android.gms.internal.ads.dg1
            public final /* synthetic */ void d(Object obj) {
                ((aa1) obj).c1(hl1.this);
            }
        });
    }

    final /* synthetic */ void e() {
        synchronized (this) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Timeout waiting for show call succeed to be called.");
            c1(new hl1("Timeout for show call succeed."));
            this.f10939t = true;
        }
    }
}
