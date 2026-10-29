package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class q12 extends x2.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14208a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z12 f14209b;

    q12(z12 z12Var, String str) {
        this.f14208a = str;
        Objects.requireNonNull(z12Var);
        this.f14209b = z12Var;
    }

    @Override // k2.e
    public final void a(k2.m mVar) {
        String s8;
        z12 z12Var = this.f14209b;
        s8 = z12.s8(mVar);
        z12Var.a0(s8);
    }

    @Override // k2.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f14209b.m8(this.f14208a, (x2.a) obj);
    }
}
