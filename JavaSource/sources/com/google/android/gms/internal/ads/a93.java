package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class a93 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f4831q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ s2.y2 f4832r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ e93 f4833s;

    a93(e93 e93Var, long j7, s2.y2 y2Var) {
        this.f4831q = j7;
        this.f4832r = y2Var;
        Objects.requireNonNull(e93Var);
        this.f4833s = e93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String q7;
        e93 e93Var = this.f4833s;
        if (e93Var.a() != null) {
            m83 a8 = e93Var.a();
            long j7 = this.f4831q;
            s2.y2 y2Var = this.f4832r;
            u83 c8 = e93Var.c();
            q7 = e93.q(y2Var);
            a8.i(j7, q7, c8, e93Var.f7479e.f26192t, e93Var.E(), e93Var.Q());
        }
    }
}
