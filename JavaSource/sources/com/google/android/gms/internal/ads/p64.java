package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class p64 extends r64 {
    public static a5.d a(Object obj) {
        return obj == null ? t64.f16001r : new t64(obj);
    }

    public static a5.d b() {
        return t64.f16001r;
    }

    public static a5.d c(Throwable th) {
        th.getClass();
        return new s64(th);
    }

    public static a5.d d(Callable callable, Executor executor) {
        p74 p74Var = new p74(callable);
        executor.execute(p74Var);
        return p74Var;
    }

    public static a5.d e(Runnable runnable, Executor executor) {
        p74 D = p74.D(runnable, null);
        executor.execute(D);
        return D;
    }

    public static a5.d f(v54 v54Var, Executor executor) {
        p74 p74Var = new p74(v54Var);
        executor.execute(p74Var);
        return p74Var;
    }

    public static a5.d g(a5.d dVar, Class cls, hx3 hx3Var, Executor executor) {
        int i7 = u44.A;
        s44 s44Var = new s44(dVar, cls, hx3Var);
        dVar.c(s44Var, g74.d(executor, s44Var));
        return s44Var;
    }

    public static a5.d h(a5.d dVar, Class cls, w54 w54Var, Executor executor) {
        int i7 = u44.A;
        r44 r44Var = new r44(dVar, cls, w54Var);
        dVar.c(r44Var, g74.d(executor, r44Var));
        return r44Var;
    }

    public static a5.d i(a5.d dVar, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return dVar.isDone() ? dVar : m74.D(dVar, j7, timeUnit, scheduledExecutorService);
    }

    public static a5.d j(a5.d dVar, w54 w54Var, Executor executor) {
        int i7 = n54.f12592z;
        l54 l54Var = new l54(dVar, w54Var);
        dVar.c(l54Var, g74.d(executor, l54Var));
        return l54Var;
    }

    public static a5.d k(a5.d dVar, hx3 hx3Var, Executor executor) {
        int i7 = n54.f12592z;
        m54 m54Var = new m54(dVar, hx3Var);
        dVar.c(m54Var, g74.d(executor, m54Var));
        return m54Var;
    }

    public static a5.d l(a5.d... dVarArr) {
        return new x54(w04.v(dVarArr), true);
    }

    public static a5.d m(Iterable iterable) {
        return new x54(w04.t(iterable), true);
    }

    public static o64 n(Iterable iterable) {
        return new o64(false, w04.t(iterable), null);
    }

    public static o64 o(a5.d... dVarArr) {
        return new o64(true, w04.v(dVarArr), null);
    }

    public static o64 p(Iterable iterable) {
        return new o64(true, w04.t(iterable), null);
    }

    public static a5.d q(a5.d... dVarArr) {
        return new x54(w04.v(dVarArr), false);
    }

    public static void r(a5.d dVar, m64 m64Var, Executor executor) {
        m64Var.getClass();
        dVar.c(new n64(dVar, m64Var), executor);
    }

    public static Object s(Future future) {
        if (future.isDone()) {
            return r74.a(future);
        }
        throw new IllegalStateException(iy3.d("Future was expected to be done: %s", future));
    }

    public static Object t(Future future) {
        try {
            return r74.a(future);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof Error) {
                throw new e64((Error) e8.getCause());
            }
            throw new q74(e8.getCause());
        }
    }
}
