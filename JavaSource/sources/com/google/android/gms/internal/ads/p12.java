package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class p12 extends k2.d {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f13630q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ k2.k f13631r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ z12 f13632s;

    p12(z12 z12Var, String str, k2.k kVar) {
        this.f13630q = str;
        this.f13631r = kVar;
        Objects.requireNonNull(z12Var);
        this.f13632s = z12Var;
    }

    @Override // k2.d
    public final void e(k2.m mVar) {
        String s8;
        z12 z12Var = this.f13632s;
        s8 = z12.s8(mVar);
        z12Var.a0(s8);
    }

    @Override // k2.d
    public final void h() {
        this.f13632s.m8(this.f13630q, this.f13631r);
    }
}
