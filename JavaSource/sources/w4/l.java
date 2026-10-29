package w4;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public abstract class l {
    public static Object a(i iVar) {
        p3.o.k();
        p3.o.i();
        p3.o.n(iVar, "Task must not be null");
        if (iVar.m()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        nVar.b();
        return f(iVar);
    }

    public static Object b(i iVar, long j7, TimeUnit timeUnit) {
        p3.o.k();
        p3.o.i();
        p3.o.n(iVar, "Task must not be null");
        p3.o.n(timeUnit, "TimeUnit must not be null");
        if (iVar.m()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        if (nVar.e(j7, timeUnit)) {
            return f(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static i c(Executor executor, Callable callable) {
        p3.o.n(executor, "Executor must not be null");
        p3.o.n(callable, "Callback must not be null");
        f0 f0Var = new f0();
        executor.execute(new g0(f0Var, callable));
        return f0Var;
    }

    public static i d(Exception exc) {
        f0 f0Var = new f0();
        f0Var.o(exc);
        return f0Var;
    }

    public static i e(Object obj) {
        f0 f0Var = new f0();
        f0Var.p(obj);
        return f0Var;
    }

    private static Object f(i iVar) {
        if (iVar.n()) {
            return iVar.k();
        }
        if (iVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.j());
    }

    private static void g(i iVar, o oVar) {
        Executor executor = k.f27124b;
        iVar.f(executor, oVar);
        iVar.d(executor, oVar);
        iVar.a(executor, oVar);
    }
}
