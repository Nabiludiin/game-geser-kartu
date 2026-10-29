package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class bh2 extends s2.q0 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f5770q;

    /* renamed from: r, reason: collision with root package name */
    private final gu0 f5771r;

    /* renamed from: s, reason: collision with root package name */
    final v03 f5772s;

    /* renamed from: t, reason: collision with root package name */
    final yn1 f5773t;

    /* renamed from: u, reason: collision with root package name */
    private s2.i0 f5774u;

    public bh2(gu0 gu0Var, Context context, String str) {
        v03 v03Var = new v03();
        this.f5772s = v03Var;
        this.f5773t = new yn1();
        this.f5771r = gu0Var;
        v03Var.F(str);
        this.f5770q = context;
    }

    @Override // s2.r0
    public final void A2(o80 o80Var) {
        this.f5773t.e(o80Var);
    }

    @Override // s2.r0
    public final void E2(n2.a aVar) {
        this.f5772s.R(aVar);
    }

    @Override // s2.r0
    public final void J5(s2.i0 i0Var) {
        this.f5774u = i0Var;
    }

    @Override // s2.r0
    public final void R3(v30 v30Var, s2.g5 g5Var) {
        this.f5773t.d(v30Var);
        this.f5772s.B(g5Var);
    }

    @Override // s2.r0
    public final void W2(l30 l30Var) {
        this.f5773t.a(l30Var);
    }

    @Override // s2.r0
    public final void Y1(y30 y30Var) {
        this.f5773t.c(y30Var);
    }

    @Override // s2.r0
    public final void Z3(String str, r30 r30Var, o30 o30Var) {
        this.f5773t.f(str, r30Var, o30Var);
    }

    @Override // s2.r0
    public final void a3(s2.p1 p1Var) {
        this.f5772s.x(p1Var);
    }

    @Override // s2.r0
    public final s2.o0 c() {
        ao1 g8 = this.f5773t.g();
        ArrayList h8 = g8.h();
        v03 v03Var = this.f5772s;
        v03Var.L(h8);
        v03Var.M(g8.i());
        if (v03Var.E() == null) {
            v03Var.B(s2.g5.N0());
        }
        return new ch2(this.f5770q, this.f5771r, v03Var, g8, this.f5774u);
    }

    @Override // s2.r0
    public final void h6(i30 i30Var) {
        this.f5773t.b(i30Var);
    }

    @Override // s2.r0
    public final void k5(z10 z10Var) {
        this.f5772s.N(z10Var);
    }

    @Override // s2.r0
    public final void l4(f80 f80Var) {
        this.f5772s.P(f80Var);
    }

    @Override // s2.r0
    public final void s5(n2.f fVar) {
        this.f5772s.Q(fVar);
    }
}
