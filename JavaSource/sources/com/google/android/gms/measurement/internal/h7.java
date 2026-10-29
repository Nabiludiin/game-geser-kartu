package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class h7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22197q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y7 f22198r;

    h7(y7 y7Var, ae aeVar) {
        this.f22197q = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22198r = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22198r;
        y7Var.u4().E();
        pd u42 = y7Var.u4();
        u42.b().h();
        u42.O0();
        ae aeVar = this.f22197q;
        p3.o.g(aeVar.f21861q);
        u42.o0(aeVar);
    }
}
