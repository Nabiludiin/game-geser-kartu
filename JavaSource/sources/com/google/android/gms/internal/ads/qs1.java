package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class qs1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c03 f14603a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f03 f14604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d01 f14605c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xs1 f14606d;

    qs1(xs1 xs1Var, c03 c03Var, f03 f03Var, d01 d01Var) {
        this.f14603a = c03Var;
        this.f14604b = f03Var;
        this.f14605c = d01Var;
        Objects.requireNonNull(xs1Var);
        this.f14606d = xs1Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        mr0 mr0Var = (mr0) obj;
        c03 c03Var = this.f14603a;
        mr0Var.P0(c03Var, this.f14604b);
        ot0 s02 = mr0Var.s0();
        if (((Boolean) s2.b0.c().d(uy.gb)).booleanValue() && s02 != null) {
            d01 d01Var = this.f14605c;
            xs1 xs1Var = this.f14606d;
            s02.i0(d01Var, xs1Var.m(), xs1Var.n());
            s02.j0(d01Var, xs1Var.m(), xs1Var.l());
        }
        if (!((Boolean) s2.b0.c().d(uy.ce)).booleanValue() || s02 == null) {
            return;
        }
        s02.A(c03Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
