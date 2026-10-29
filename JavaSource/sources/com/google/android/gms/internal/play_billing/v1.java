package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class v1 extends x1 {
    public static a2 a(Object obj) {
        return new y1(obj);
    }

    public static a2 b(a2 a2Var, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return a2Var.isDone() ? a2Var : g2.z(a2Var, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(a2 a2Var, t1 t1Var, Executor executor) {
        a2Var.j(new u1(a2Var, t1Var), executor);
    }
}
