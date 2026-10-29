package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class yj0 {

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f19613a;

    yj0(com.google.android.gms.common.util.e eVar, v2.p1 p1Var, jk0 jk0Var) {
        this.f19613a = p1Var;
    }

    public final void a(int i7, long j7) {
        if (((Boolean) s2.b0.c().d(uy.L0)).booleanValue()) {
            return;
        }
        v2.p1 p1Var = this.f19613a;
        if (j7 - p1Var.D() < 0) {
            v2.n1.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.M0)).booleanValue()) {
            p1Var.w(i7);
            p1Var.u(j7);
        } else {
            p1Var.w(-1);
            p1Var.u(j7);
        }
    }
}
