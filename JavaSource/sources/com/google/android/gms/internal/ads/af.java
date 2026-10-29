package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: MyApplication */
public final class af extends Thread {

    /* renamed from: q, reason: collision with root package name */
    private final BlockingQueue f4906q;

    /* renamed from: r, reason: collision with root package name */
    private final ze f4907r;

    /* renamed from: s, reason: collision with root package name */
    private final qe f4908s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f4909t = false;

    /* renamed from: u, reason: collision with root package name */
    private final xe f4910u;

    public af(BlockingQueue blockingQueue, ze zeVar, qe qeVar, xe xeVar) {
        this.f4906q = blockingQueue;
        this.f4907r = zeVar;
        this.f4908s = qeVar;
        this.f4910u = xeVar;
    }

    private void b() {
        gf gfVar = (gf) this.f4906q.take();
        SystemClock.elapsedRealtime();
        gfVar.k(3);
        try {
            try {
                gfVar.d("network-queue-take");
                gfVar.r();
                TrafficStats.setThreadStatsTag(gfVar.c());
                cf a8 = this.f4907r.a(gfVar);
                gfVar.d("network-http-complete");
                if (a8.f6407e && gfVar.w()) {
                    gfVar.j("not-modified");
                    gfVar.C();
                } else {
                    lf x7 = gfVar.x(a8);
                    gfVar.d("network-parse-complete");
                    pe peVar = x7.f11595b;
                    if (peVar != null) {
                        this.f4908s.e(gfVar.o(), peVar);
                        gfVar.d("network-cache-written");
                    }
                    gfVar.v();
                    this.f4910u.a(gfVar, x7, null);
                    gfVar.B(x7);
                }
            } catch (of e8) {
                SystemClock.elapsedRealtime();
                this.f4910u.b(gfVar, e8);
                gfVar.C();
            } catch (Exception e9) {
                rf.d(e9, "Unhandled exception %s", e9.toString());
                of ofVar = new of(e9);
                SystemClock.elapsedRealtime();
                this.f4910u.b(gfVar, ofVar);
                gfVar.C();
            }
            gfVar.k(4);
        } catch (Throwable th) {
            gfVar.k(4);
            throw th;
        }
    }

    public final void a() {
        this.f4909t = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f4909t) {
                    Thread.currentThread().interrupt();
                    return;
                }
                rf.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
