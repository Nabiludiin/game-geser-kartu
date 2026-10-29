package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class r12 extends f3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14702a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z12 f14703b;

    r12(z12 z12Var, String str) {
        this.f14702a = str;
        Objects.requireNonNull(z12Var);
        this.f14703b = z12Var;
    }

    @Override // k2.e
    public final void a(k2.m mVar) {
        String s8;
        z12 z12Var = this.f14703b;
        s8 = z12.s8(mVar);
        z12Var.a0(s8);
    }

    @Override // k2.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f14703b.m8(this.f14702a, (f3.c) obj);
    }
}
