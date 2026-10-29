package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class a7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f21849q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f21850r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f21851s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f21852t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ y7 f21853u;

    a7(y7 y7Var, String str, String str2, String str3, long j7) {
        this.f21849q = str;
        this.f21850r = str2;
        this.f21851s = str3;
        this.f21852t = j7;
        Objects.requireNonNull(y7Var);
        this.f21853u = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f21849q;
        if (str == null) {
            y7 y7Var = this.f21853u;
            y7Var.u4().t0(this.f21850r, null);
        } else {
            da daVar = new da(this.f21851s, str, this.f21852t);
            y7 y7Var2 = this.f21853u;
            y7Var2.u4().t0(this.f21850r, daVar);
        }
    }
}
