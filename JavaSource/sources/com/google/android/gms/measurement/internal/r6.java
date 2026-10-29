package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* compiled from: MyApplication */
final class r6 extends Thread {

    /* renamed from: q, reason: collision with root package name */
    private final Object f22561q;

    /* renamed from: r, reason: collision with root package name */
    private final BlockingQueue f22562r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22563s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ s6 f22564t;

    public r6(s6 s6Var, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(s6Var);
        this.f22564t = s6Var;
        this.f22563s = false;
        p3.o.m(str);
        p3.o.m(blockingQueue);
        this.f22561q = new Object();
        this.f22562r = blockingQueue;
        setName(str);
    }

    private final void b() {
        s6 s6Var = this.f22564t;
        synchronized (s6Var.B()) {
            try {
                if (!this.f22563s) {
                    s6Var.C().release();
                    s6Var.B().notifyAll();
                    if (this == s6Var.x()) {
                        s6Var.y(null);
                    } else if (this == s6Var.z()) {
                        s6Var.A(null);
                    } else {
                        s6Var.f22928a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f22563s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f22564t.f22928a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f22561q;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f22564t.C().acquire();
                z7 = true;
            } catch (InterruptedException e8) {
                c(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f22562r;
                q6 q6Var = (q6) blockingQueue.poll();
                if (q6Var != null) {
                    Process.setThreadPriority(true != q6Var.f22530r ? 10 : threadPriority);
                    q6Var.run();
                } else {
                    Object obj = this.f22561q;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f22564t.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e9) {
                                c(e9);
                            }
                        }
                    }
                    synchronized (this.f22564t.B()) {
                        if (this.f22562r.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
