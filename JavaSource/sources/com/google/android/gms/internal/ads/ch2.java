package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ch2 extends s2.n0 {

    /* renamed from: q, reason: collision with root package name */
    private final mi2 f6434q;

    public ch2(Context context, gu0 gu0Var, v03 v03Var, ao1 ao1Var, s2.i0 i0Var) {
        oi2 oi2Var = new oi2(ao1Var, gu0Var.e());
        oi2Var.a(i0Var);
        this.f6434q = new mi2(new yi2(gu0Var, context, oi2Var, v03Var), v03Var.G());
    }

    @Override // s2.o0
    public final void U0(s2.b5 b5Var) {
        this.f6434q.b(b5Var, 1);
    }

    @Override // s2.o0
    public final synchronized String e() {
        return this.f6434q.c();
    }

    @Override // s2.o0
    public final synchronized boolean f() {
        return this.f6434q.a();
    }

    @Override // s2.o0
    public final synchronized String g() {
        return this.f6434q.d();
    }

    @Override // s2.o0
    public final synchronized void w7(s2.b5 b5Var, int i7) {
        this.f6434q.b(b5Var, i7);
    }
}
