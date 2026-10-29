package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class c7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f22001q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y7 f22002r;

    c7(y7 y7Var, i iVar) {
        this.f22001q = iVar;
        Objects.requireNonNull(y7Var);
        this.f22002r = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22002r;
        y7Var.u4().E();
        i iVar = this.f22001q;
        if (iVar.f22222s.M0() == null) {
            y7Var.u4().l0(iVar);
        } else {
            y7Var.u4().j0(iVar);
        }
    }
}
