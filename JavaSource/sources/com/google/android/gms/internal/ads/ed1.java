package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class ed1 extends eg1 {
    private ScheduledFuture A;

    /* renamed from: r, reason: collision with root package name */
    private final ScheduledExecutorService f7556r;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f7557s;

    /* renamed from: t, reason: collision with root package name */
    private final rx1 f7558t;

    /* renamed from: u, reason: collision with root package name */
    private long f7559u;

    /* renamed from: v, reason: collision with root package name */
    private long f7560v;

    /* renamed from: w, reason: collision with root package name */
    private long f7561w;

    /* renamed from: x, reason: collision with root package name */
    private long f7562x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7563y;

    /* renamed from: z, reason: collision with root package name */
    private ScheduledFuture f7564z;

    public ed1(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.e eVar, rx1 rx1Var) {
        super(Collections.EMPTY_SET);
        this.f7559u = -1L;
        this.f7560v = -1L;
        this.f7561w = -1L;
        this.f7562x = -1L;
        this.f7563y = false;
        this.f7556r = scheduledExecutorService;
        this.f7557s = eVar;
        this.f7558t = rx1Var;
    }

    private final synchronized void t1(long j7) {
        try {
            ScheduledFuture scheduledFuture = this.f7564z;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f7564z.cancel(false);
            }
            this.f7559u = this.f7557s.b() + j7;
            this.f7564z = this.f7556r.schedule(new cd1(this, null), j7, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void u1(long j7) {
        try {
            ScheduledFuture scheduledFuture = this.A;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.A.cancel(false);
            }
            this.f7560v = this.f7557s.b() + j7;
            this.A = this.f7556r.schedule(new dd1(this, null), j7, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void U0() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.f7563y) {
                if (this.f7561w > 0 && (scheduledFuture2 = this.f7564z) != null && scheduledFuture2.isCancelled()) {
                    t1(this.f7561w);
                }
                if (this.f7562x > 0 && (scheduledFuture = this.A) != null && scheduledFuture.isCancelled()) {
                    u1(this.f7562x);
                }
                this.f7563y = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void W0(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i7);
        v2.n1.k(sb.toString());
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.f7563y) {
                long j7 = this.f7561w;
                if (j7 <= 0 || millis >= j7) {
                    millis = j7;
                }
                this.f7561w = millis;
                return;
            }
            long b8 = this.f7557s.b();
            if (((Boolean) s2.b0.c().d(uy.ne)).booleanValue()) {
                long j8 = this.f7559u;
                if (b8 >= j8 || j8 - b8 > millis) {
                    t1(millis);
                    if (((Boolean) s2.b0.c().d(uy.De)).booleanValue()) {
                        qx1 a8 = this.f7558t.a();
                        a8.c("action", "rtnc");
                        a8.f();
                    }
                }
            } else {
                long j9 = this.f7559u;
                if (b8 > j9 || j9 - b8 > millis) {
                    t1(millis);
                }
            }
        }
    }

    public final synchronized void X0(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i7);
        v2.n1.k(sb.toString());
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.f7563y) {
                long j7 = this.f7562x;
                if (j7 <= 0 || millis >= j7) {
                    millis = j7;
                }
                this.f7562x = millis;
                return;
            }
            long b8 = this.f7557s.b();
            if (((Boolean) s2.b0.c().d(uy.ne)).booleanValue()) {
                if (b8 == this.f7560v) {
                    v2.n1.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j8 = this.f7560v;
                if (b8 >= j8 || j8 - b8 > millis) {
                    u1(millis);
                }
            } else {
                long j9 = this.f7560v;
                if (b8 > j9 || j9 - b8 > millis) {
                    u1(millis);
                }
            }
        }
    }

    public final synchronized void a() {
        try {
            if (this.f7563y) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f7564z;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f7561w = -1L;
            } else {
                this.f7564z.cancel(false);
                this.f7561w = this.f7559u - this.f7557s.b();
            }
            ScheduledFuture scheduledFuture2 = this.A;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f7562x = -1L;
            } else {
                this.A.cancel(false);
                this.f7562x = this.f7560v - this.f7557s.b();
            }
            this.f7563y = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        this.f7563y = false;
        t1(0L);
    }
}
