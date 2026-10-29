package x6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: MyApplication */
public final class l0 extends y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: y, reason: collision with root package name */
    public static final l0 f27406y;

    /* renamed from: z, reason: collision with root package name */
    private static final long f27407z;

    static {
        Long l7;
        l0 l0Var = new l0();
        f27406y = l0Var;
        x0.T(l0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f27407z = timeUnit.toNanos(l7.longValue());
    }

    private l0() {
    }

    private final synchronized void C0() {
        if (K0()) {
            debugStatus = 3;
            z0();
            q6.i.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread F0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(l0.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean J0() {
        return debugStatus == 4;
    }

    private final boolean K0() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    private final synchronized boolean M0() {
        if (K0()) {
            return false;
        }
        debugStatus = 1;
        q6.i.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void N0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // x6.z0
    protected Thread b0() {
        Thread thread = _thread;
        return thread == null ? F0() : thread;
    }

    @Override // x6.y0
    public void j0(Runnable runnable) {
        if (J0()) {
            N0();
        }
        super.j0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean w02;
        h2.f27384a.c(this);
        c.a();
        try {
            if (!M0()) {
                if (w02) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long x02 = x0();
                if (x02 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f27407z + nanoTime;
                    }
                    long j8 = j7 - nanoTime;
                    if (j8 <= 0) {
                        _thread = null;
                        C0();
                        c.a();
                        if (w0()) {
                            return;
                        }
                        b0();
                        return;
                    }
                    x02 = t6.d.c(x02, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (x02 > 0) {
                    if (K0()) {
                        _thread = null;
                        C0();
                        c.a();
                        if (w0()) {
                            return;
                        }
                        b0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, x02);
                }
            }
        } finally {
            _thread = null;
            C0();
            c.a();
            if (!w0()) {
                b0();
            }
        }
    }

    @Override // x6.y0, x6.x0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
