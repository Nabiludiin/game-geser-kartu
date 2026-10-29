package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: MyApplication */
abstract class w64 extends AtomicReference implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private static final Runnable f18092q = new v64(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Runnable f18093r = new v64(null);

    w64() {
    }

    private final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        u64 u64Var = null;
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (!(runnable instanceof u64)) {
                if (runnable != f18093r) {
                    break;
                }
            } else {
                u64Var = (u64) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = f18093r;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(u64Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z7) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String c();

    abstract boolean d();

    abstract void e(Object obj);

    abstract void f(Throwable th);

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            u64 u64Var = new u64(this, null);
            u64Var.a(Thread.currentThread());
            if (compareAndSet(runnable, u64Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f18092q)) == f18093r) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f18092q)) == f18093r) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d8 = d();
            if (!d8) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        i74.a(th);
                        if (!compareAndSet(currentThread, f18092q)) {
                            b(currentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, f18092q)) {
                            b(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, f18092q)) {
                b(currentThread);
            }
            if (d8) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f18092q) {
            str = "running=[DONE]";
        } else if (runnable instanceof u64) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c8 = c();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(c8).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(c8);
        return sb2.toString();
    }
}
