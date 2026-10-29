package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class s6 extends a8 {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicLong f22606k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private r6 f22607c;

    /* renamed from: d, reason: collision with root package name */
    private r6 f22608d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f22609e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f22610f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f22611g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f22612h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f22613i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f22614j;

    s6(w6 w6Var) {
        super(w6Var);
        this.f22613i = new Object();
        this.f22614j = new Semaphore(2);
        this.f22609e = new PriorityBlockingQueue();
        this.f22610f = new LinkedBlockingQueue();
        this.f22611g = new p6(this, "Thread death: Uncaught exception on worker thread");
        this.f22612h = new p6(this, "Thread death: Uncaught exception on network thread");
    }

    private final void F(q6 q6Var) {
        synchronized (this.f22613i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f22609e;
                priorityBlockingQueue.add(q6Var);
                r6 r6Var = this.f22607c;
                if (r6Var == null) {
                    r6 r6Var2 = new r6(this, "Measurement Worker", priorityBlockingQueue);
                    this.f22607c = r6Var2;
                    r6Var2.setUncaughtExceptionHandler(this.f22611g);
                    this.f22607c.start();
                } else {
                    r6Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void A(r6 r6Var) {
        this.f22608d = null;
    }

    final /* synthetic */ Object B() {
        return this.f22613i;
    }

    final /* synthetic */ Semaphore C() {
        return this.f22614j;
    }

    final /* synthetic */ boolean D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.z7
    public final void g() {
        if (Thread.currentThread() != this.f22608d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.z7
    public final void h() {
        if (Thread.currentThread() != this.f22607c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f22607c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f22607c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f22608d;
    }

    public final Future r(Callable callable) {
        l();
        p3.o.m(callable);
        q6 q6Var = new q6(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f22607c) {
            F(q6Var);
            return q6Var;
        }
        if (!this.f22609e.isEmpty()) {
            this.f22928a.a().r().a("Callable skipped the worker queue.");
        }
        q6Var.run();
        return q6Var;
    }

    public final Future s(Callable callable) {
        l();
        p3.o.m(callable);
        q6 q6Var = new q6(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f22607c) {
            q6Var.run();
            return q6Var;
        }
        F(q6Var);
        return q6Var;
    }

    public final void t(Runnable runnable) {
        l();
        p3.o.m(runnable);
        F(new q6(this, runnable, false, "Task exception on worker thread"));
    }

    final Object u(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f22928a.b().t(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                n5 r7 = this.f22928a.a().r();
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                r7.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f22928a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        p3.o.m(runnable);
        F(new q6(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        p3.o.m(runnable);
        q6 q6Var = new q6(this, runnable, false, "Task exception on network thread");
        synchronized (this.f22613i) {
            try {
                BlockingQueue blockingQueue = this.f22610f;
                blockingQueue.add(q6Var);
                r6 r6Var = this.f22608d;
                if (r6Var == null) {
                    r6 r6Var2 = new r6(this, "Measurement Network", blockingQueue);
                    this.f22608d = r6Var2;
                    r6Var2.setUncaughtExceptionHandler(this.f22612h);
                    this.f22608d.start();
                } else {
                    r6Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ r6 x() {
        return this.f22607c;
    }

    final /* synthetic */ void y(r6 r6Var) {
        this.f22607c = null;
    }

    final /* synthetic */ r6 z() {
        return this.f22608d;
    }
}
