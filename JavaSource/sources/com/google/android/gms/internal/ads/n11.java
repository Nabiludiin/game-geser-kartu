package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class n11 implements bs {

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f12539q;

    /* renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f12540r;

    /* renamed from: s, reason: collision with root package name */
    private ScheduledFuture f12541s;

    /* renamed from: t, reason: collision with root package name */
    private long f12542t = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f12543u = -1;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f12544v = null;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12545w = false;

    public n11(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.e eVar) {
        this.f12539q = scheduledExecutorService;
        this.f12540r = eVar;
        r2.t.k().b(this);
    }

    public final synchronized void a(int i7, Runnable runnable) {
        this.f12544v = runnable;
        long j7 = i7;
        this.f12542t = this.f12540r.b() + j7;
        this.f12541s = this.f12539q.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }

    final synchronized void b() {
        try {
            if (this.f12545w) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f12541s;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f12543u = -1L;
            } else {
                this.f12541s.cancel(true);
                this.f12543u = this.f12542t - this.f12540r.b();
            }
            this.f12545w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f12545w) {
                if (this.f12543u > 0 && (scheduledFuture = this.f12541s) != null && scheduledFuture.isCancelled()) {
                    this.f12541s = this.f12539q.schedule(this.f12544v, this.f12543u, TimeUnit.MILLISECONDS);
                }
                this.f12545w = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void r0(boolean z7) {
        if (z7) {
            c();
        } else {
            b();
        }
    }
}
