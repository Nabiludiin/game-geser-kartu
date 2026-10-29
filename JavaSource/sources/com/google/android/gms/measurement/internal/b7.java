package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class b7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f21897q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ae f21898r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ y7 f21899s;

    b7(y7 y7Var, i iVar, ae aeVar) {
        this.f21897q = iVar;
        this.f21898r = aeVar;
        Objects.requireNonNull(y7Var);
        this.f21899s = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f21899s;
        y7Var.u4().E();
        i iVar = this.f21897q;
        if (iVar.f22222s.M0() == null) {
            y7Var.u4().m0(iVar, this.f21898r);
        } else {
            y7Var.u4().k0(iVar, this.f21898r);
        }
    }
}
