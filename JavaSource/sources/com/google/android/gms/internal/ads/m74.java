package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class m74 extends f64 {

    /* renamed from: x, reason: collision with root package name */
    private a5.d f12112x;

    /* renamed from: y, reason: collision with root package name */
    private ScheduledFuture f12113y;

    private m74(a5.d dVar) {
        dVar.getClass();
        this.f12112x = dVar;
    }

    static a5.d D(a5.d dVar, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        m74 m74Var = new m74(dVar);
        k74 k74Var = new k74(m74Var);
        m74Var.f12113y = scheduledExecutorService.schedule(k74Var, j7, timeUnit);
        dVar.c(k74Var, d64.INSTANCE);
        return m74Var;
    }

    final /* synthetic */ a5.d E() {
        return this.f12112x;
    }

    final /* synthetic */ ScheduledFuture F() {
        return this.f12113y;
    }

    final /* synthetic */ void G(ScheduledFuture scheduledFuture) {
        this.f12113y = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final void n() {
        w(this.f12112x);
        ScheduledFuture scheduledFuture = this.f12113y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f12112x = null;
        this.f12113y = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        a5.d dVar = this.f12112x;
        ScheduledFuture scheduledFuture = this.f12113y;
        if (dVar == null) {
            return null;
        }
        String obj = dVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 19 + String.valueOf(delay).length() + 4);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
