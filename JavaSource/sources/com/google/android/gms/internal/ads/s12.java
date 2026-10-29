package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class s12 extends g3.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15429a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z12 f15430b;

    s12(z12 z12Var, String str) {
        this.f15429a = str;
        Objects.requireNonNull(z12Var);
        this.f15430b = z12Var;
    }

    @Override // k2.e
    public final void a(k2.m mVar) {
        String s8;
        z12 z12Var = this.f15430b;
        s8 = z12.s8(mVar);
        z12Var.a0(s8);
    }

    @Override // k2.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f15430b.m8(this.f15429a, (g3.a) obj);
    }
}
