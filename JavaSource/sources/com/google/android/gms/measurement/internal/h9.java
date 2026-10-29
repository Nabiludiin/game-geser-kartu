package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class h9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ d8 f22200q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f22201r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f22202s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ w9 f22203t;

    h9(w9 w9Var, d8 d8Var, long j7, boolean z7) {
        this.f22200q = d8Var;
        this.f22201r = j7;
        this.f22202s = z7;
        Objects.requireNonNull(w9Var);
        this.f22203t = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22203t;
        d8 d8Var = this.f22200q;
        w9Var.o(d8Var);
        w9Var.X(d8Var, this.f22201r, true, this.f22202s);
    }
}
