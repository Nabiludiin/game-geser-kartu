package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: MyApplication */
final class w93 extends TimerTask {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ y93 f18122q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Timer f18123r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ z93 f18124s;

    w93(z93 z93Var, y93 y93Var, Timer timer) {
        this.f18122q = y93Var;
        this.f18123r = timer;
        Objects.requireNonNull(z93Var);
        this.f18124s = z93Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f18124s.e();
        this.f18122q.r0(true);
        this.f18123r.cancel();
    }
}
