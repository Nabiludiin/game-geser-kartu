package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: MyApplication */
public final class se extends Thread {

    /* renamed from: w, reason: collision with root package name */
    private static final boolean f15570w = rf.f14885b;

    /* renamed from: q, reason: collision with root package name */
    private final BlockingQueue f15571q;

    /* renamed from: r, reason: collision with root package name */
    private final BlockingQueue f15572r;

    /* renamed from: s, reason: collision with root package name */
    private final qe f15573s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f15574t = false;

    /* renamed from: u, reason: collision with root package name */
    private final sf f15575u;

    /* renamed from: v, reason: collision with root package name */
    private final xe f15576v;

    public se(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, qe qeVar, xe xeVar) {
        this.f15571q = blockingQueue;
        this.f15572r = blockingQueue2;
        this.f15573s = qeVar;
        this.f15576v = xeVar;
        this.f15575u = new sf(this, blockingQueue2, xeVar);
    }

    private void c() {
        gf gfVar = (gf) this.f15571q.take();
        gfVar.d("cache-queue-take");
        gfVar.k(1);
        try {
            gfVar.r();
            qe qeVar = this.f15573s;
            pe b8 = qeVar.b(gfVar.o());
            if (b8 == null) {
                gfVar.d("cache-miss");
                if (!this.f15575u.c(gfVar)) {
                    this.f15572r.put(gfVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (b8.a(currentTimeMillis)) {
                    gfVar.d("cache-hit-expired");
                    gfVar.p(b8);
                    if (!this.f15575u.c(gfVar)) {
                        this.f15572r.put(gfVar);
                    }
                } else {
                    gfVar.d("cache-hit");
                    lf x7 = gfVar.x(new cf(b8.f13843a, b8.f13849g));
                    gfVar.d("cache-hit-parsed");
                    if (!x7.c()) {
                        gfVar.d("cache-parsing-failed");
                        qeVar.c(gfVar.o(), true);
                        gfVar.p(null);
                        if (!this.f15575u.c(gfVar)) {
                            this.f15572r.put(gfVar);
                        }
                    } else if (b8.f13848f < currentTimeMillis) {
                        gfVar.d("cache-hit-refresh-needed");
                        gfVar.p(b8);
                        x7.f11597d = true;
                        if (this.f15575u.c(gfVar)) {
                            this.f15576v.a(gfVar, x7, null);
                        } else {
                            this.f15576v.a(gfVar, x7, new re(this, gfVar));
                        }
                    } else {
                        this.f15576v.a(gfVar, x7, null);
                    }
                }
            }
            gfVar.k(2);
        } catch (Throwable th) {
            gfVar.k(2);
            throw th;
        }
    }

    public final void a() {
        this.f15574t = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue b() {
        return this.f15572r;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f15570w) {
            rf.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f15573s.d();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f15574t) {
                    Thread.currentThread().interrupt();
                    return;
                }
                rf.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
