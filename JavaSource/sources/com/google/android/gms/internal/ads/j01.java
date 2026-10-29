package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class j01 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p01 f10279b;

    j01(p01 p01Var, String str) {
        this.f10278a = str;
        Objects.requireNonNull(p01Var);
        this.f10279b = p01Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        p01 p01Var = this.f10279b;
        p01Var.z().a(p01Var.y().b(p01Var.t(), p01Var.x(), false, this.f10278a, null, p01Var.o(), p01Var.C()), null);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f10278a;
        String str2 = (String) obj;
        p01 p01Var = this.f10279b;
        p01Var.z().a(p01Var.y().b(p01Var.t(), p01Var.x(), false, str, str2, p01Var.o(), p01Var.C()), p01Var.B());
    }
}
