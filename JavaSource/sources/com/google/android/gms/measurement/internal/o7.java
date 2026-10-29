package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class o7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ud f22435q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ae f22436r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ y7 f22437s;

    o7(y7 y7Var, ud udVar, ae aeVar) {
        this.f22435q = udVar;
        this.f22436r = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22437s = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22437s;
        y7Var.u4().E();
        ud udVar = this.f22435q;
        if (udVar.M0() != null) {
            y7Var.u4().c0(udVar, this.f22436r);
        } else {
            ae aeVar = this.f22436r;
            y7Var.u4().d0(udVar.f22701r, aeVar);
        }
    }
}
