package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class m81 implements w91, uh1, hf1, na1, gr {

    /* renamed from: q, reason: collision with root package name */
    private final pa1 f12116q;

    /* renamed from: r, reason: collision with root package name */
    private final wc1 f12117r;

    /* renamed from: s, reason: collision with root package name */
    private final c03 f12118s;

    /* renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f12119t;

    /* renamed from: u, reason: collision with root package name */
    private final Executor f12120u;

    /* renamed from: w, reason: collision with root package name */
    private ScheduledFuture f12122w;

    /* renamed from: y, reason: collision with root package name */
    private final String f12124y;

    /* renamed from: v, reason: collision with root package name */
    private final j74 f12121v = j74.C();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f12123x = new AtomicBoolean();

    m81(pa1 pa1Var, c03 c03Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, wc1 wc1Var) {
        this.f12116q = pa1Var;
        this.f12118s = c03Var;
        this.f12119t = scheduledExecutorService;
        this.f12120u = executor;
        this.f12124y = str;
        this.f12117r = wc1Var;
    }

    private final boolean n() {
        return this.f12124y.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
        c03 c03Var = this.f12118s;
        if (c03Var.f6158e == 3) {
            return;
        }
        int i7 = c03Var.Y;
        if (i7 == 0 || i7 == 1) {
            if (((Boolean) s2.b0.c().d(uy.yc)).booleanValue() && n()) {
                return;
            }
            this.f12116q.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final synchronized void d() {
        if (this.f12118s.f6158e == 4) {
            this.f12116q.a();
            return;
        }
        j74 j74Var = this.f12121v;
        if (j74Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f12122w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        j74Var.l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void f() {
        c03 c03Var = this.f12118s;
        int i7 = c03Var.f6158e;
        if (i7 == 3) {
            return;
        }
        if (i7 == 4) {
            this.f12117r.a();
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.N1)).booleanValue() && c03Var.Y == 2) {
            int i8 = c03Var.f6182q;
            if (i8 == 0) {
                this.f12116q.a();
            } else {
                p64.r(this.f12121v, new k81(this), this.f12120u);
                this.f12122w = this.f12119t.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.l81
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        m81.this.j();
                    }
                }, i8, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void j() {
        synchronized (this) {
            try {
                j74 j74Var = this.f12121v;
                if (j74Var.isDone()) {
                    return;
                }
                j74Var.l(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ pa1 k() {
        return this.f12116q;
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final synchronized void q(s2.x2 x2Var) {
        try {
            j74 j74Var = this.f12121v;
            if (j74Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f12122w;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            j74Var.m(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        if (((Boolean) s2.b0.c().d(uy.yc)).booleanValue() && n() && frVar.f8430j && this.f12123x.compareAndSet(false, true) && this.f12118s.f6158e != 3) {
            v2.n1.k("Full screen 1px impression occurred");
            this.f12116q.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(qh0 qh0Var, String str, String str2) {
    }
}
