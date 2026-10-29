package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public abstract class g74 {
    public static Executor a() {
        return d64.INSTANCE;
    }

    public static z64 b(ExecutorService executorService) {
        return executorService instanceof z64 ? (z64) executorService : executorService instanceof ScheduledExecutorService ? new f74((ScheduledExecutorService) executorService) : new b74(executorService);
    }

    public static a74 c(ScheduledExecutorService scheduledExecutorService) {
        return new f74(scheduledExecutorService);
    }

    static Executor d(final Executor executor, final b54 b54Var) {
        executor.getClass();
        return executor == d64.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.c74
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                g74.f(executor, b54Var, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Executor executor, b54 b54Var, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e8) {
            b54Var.m(e8);
        }
    }
}
