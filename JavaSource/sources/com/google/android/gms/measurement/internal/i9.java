package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class i9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ d8 f22243q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f22244r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f22245s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ w9 f22246t;

    i9(w9 w9Var, d8 d8Var, long j7, boolean z7) {
        this.f22243q = d8Var;
        this.f22244r = j7;
        this.f22245s = z7;
        Objects.requireNonNull(w9Var);
        this.f22246t = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22246t;
        d8 d8Var = this.f22243q;
        w9Var.o(d8Var);
        w9Var.X(d8Var, this.f22244r, false, this.f22245s);
    }
}
