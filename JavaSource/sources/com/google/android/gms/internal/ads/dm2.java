package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class dm2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f7170a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f7171b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f7172c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f7173d;

    /* renamed from: e, reason: collision with root package name */
    private final yr2 f7174e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7175f;

    /* renamed from: g, reason: collision with root package name */
    private final rx1 f7176g;

    public dm2(yr2 yr2Var, long j7, com.google.android.gms.common.util.e eVar, Executor executor, rx1 rx1Var) {
        this.f7172c = eVar;
        this.f7174e = yr2Var;
        this.f7175f = j7;
        this.f7173d = executor;
        this.f7176g = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        am2 am2Var;
        am2 am2Var2;
        if (((Boolean) s2.b0.c().d(uy.Oc)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.Nc)).booleanValue() && !((Boolean) this.f7171b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = cm0.f6503d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.cm2
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        dm2.this.c();
                    }
                };
                long j7 = this.f7175f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j7, j7, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f7170a;
                    am2Var = (am2) atomicReference.get();
                    if (am2Var == null) {
                        am2 am2Var3 = new am2(this.f7174e.a(), this.f7175f, this.f7172c);
                        atomicReference.set(am2Var3);
                        return am2Var3.f5038a;
                    }
                    if (!((Boolean) this.f7171b.get()).booleanValue() && am2Var.a()) {
                        a5.d dVar = am2Var.f5038a;
                        yr2 yr2Var = this.f7174e;
                        am2Var2 = new am2(yr2Var.a(), this.f7175f, this.f7172c);
                        this.f7170a.set(am2Var2);
                        if (((Boolean) s2.b0.c().d(uy.Pc)).booleanValue()) {
                            if (((Boolean) s2.b0.c().d(uy.Qc)).booleanValue()) {
                                qx1 a8 = this.f7176g.a();
                                a8.c("action", "scs");
                                a8.c("sid", String.valueOf(yr2Var.b()));
                                a8.d();
                            }
                            return dVar;
                        }
                        am2Var = am2Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f7170a;
            am2Var = (am2) atomicReference2.get();
            if (am2Var == null || am2Var.a()) {
                yr2 yr2Var2 = this.f7174e;
                am2Var2 = new am2(yr2Var2.a(), this.f7175f, this.f7172c);
                atomicReference2.set(am2Var2);
                am2Var = am2Var2;
            }
        }
        return am2Var.f5038a;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return this.f7174e.b();
    }

    final /* synthetic */ void c() {
        this.f7173d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bm2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                dm2.this.d();
            }
        });
    }

    final /* synthetic */ void d() {
        this.f7170a.set(new am2(this.f7174e.a(), this.f7175f, this.f7172c));
    }
}
