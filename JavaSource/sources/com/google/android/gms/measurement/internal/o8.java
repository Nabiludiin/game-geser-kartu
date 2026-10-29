package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class o8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f22438q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22439r;

    o8(w9 w9Var, long j7) {
        this.f22438q = j7;
        Objects.requireNonNull(w9Var);
        this.f22439r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w6 w6Var = this.f22439r.f22928a;
        a6 a6Var = w6Var.x().f22032l;
        long j7 = this.f22438q;
        a6Var.b(j7);
        w6Var.a().v().b("Session timeout duration set", Long.valueOf(j7));
    }
}
