package com.google.android.gms.internal.ads;

import java.util.Objects;
import m2.a;

/* compiled from: MyApplication */
final class o12 extends a.AbstractC0112a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z12 f13159b;

    o12(z12 z12Var, String str) {
        this.f13158a = str;
        Objects.requireNonNull(z12Var);
        this.f13159b = z12Var;
    }

    @Override // k2.e
    public final void a(k2.m mVar) {
        String s8;
        z12 z12Var = this.f13159b;
        s8 = z12.s8(mVar);
        z12Var.a0(s8);
    }

    @Override // k2.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f13159b.m8(this.f13158a, (m2.a) obj);
    }
}
