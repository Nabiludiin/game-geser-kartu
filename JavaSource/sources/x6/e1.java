package x6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: MyApplication */
public final class e1 extends d1 implements p0 {

    /* renamed from: t, reason: collision with root package name */
    private final Executor f27382t;

    public e1(Executor executor) {
        this.f27382t = executor;
        c7.c.a(O());
    }

    private final void M(g6.i iVar, RejectedExecutionException rejectedExecutionException) {
        q1.c(iVar, c1.a("The task was rejected", rejectedExecutionException));
    }

    public Executor O() {
        return this.f27382t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor O = O();
        ExecutorService executorService = O instanceof ExecutorService ? (ExecutorService) O : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof e1) && ((e1) obj).O() == O();
    }

    @Override // x6.d0
    public void h(g6.i iVar, Runnable runnable) {
        try {
            Executor O = O();
            c.a();
            O.execute(runnable);
        } catch (RejectedExecutionException e8) {
            c.a();
            M(iVar, e8);
            t0.b().h(iVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(O());
    }

    @Override // x6.d0
    public String toString() {
        return O().toString();
    }
}
