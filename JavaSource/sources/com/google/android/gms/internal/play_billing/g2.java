package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class g2 extends r1 {

    /* renamed from: x, reason: collision with root package name */
    private a2 f21532x;

    /* renamed from: y, reason: collision with root package name */
    private ScheduledFuture f21533y;

    private g2(a2 a2Var) {
        this.f21532x = a2Var;
    }

    static a2 z(a2 a2Var, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        g2 g2Var = new g2(a2Var);
        d2 d2Var = new d2(g2Var);
        g2Var.f21533y = scheduledExecutorService.schedule(d2Var, 28500L, timeUnit);
        a2Var.j(d2Var, q1.INSTANCE);
        return g2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.f1
    protected final String n() {
        a2 a2Var = this.f21532x;
        ScheduledFuture scheduledFuture = this.f21533y;
        if (a2Var == null) {
            return null;
        }
        String str = "inputFuture=[" + a2Var.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.f1
    protected final void p() {
        a2 a2Var = this.f21532x;
        if ((this.f21602q instanceof a1) & (a2Var != null)) {
            Object obj = this.f21602q;
            a2Var.cancel((obj instanceof a1) && ((a1) obj).f21475a);
        }
        ScheduledFuture scheduledFuture = this.f21533y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f21532x = null;
        this.f21533y = null;
    }
}
