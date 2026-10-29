package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class oz1 implements bz1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f13557a;

    /* renamed from: b, reason: collision with root package name */
    private final ji2 f13558b;

    oz1(long j7, Context context, fz1 fz1Var, gu0 gu0Var, String str) {
        this.f13557a = j7;
        hy2 v7 = gu0Var.v();
        v7.c(context);
        v7.b(new s2.g5());
        v7.W(str);
        ji2 a8 = v7.a().a();
        this.f13558b = a8;
        a8.L4(new nz1(this, fz1Var));
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void a(s2.b5 b5Var) {
        this.f13558b.U0(b5Var);
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void b() {
        this.f13558b.W1(w3.b.C1(null));
    }

    final /* synthetic */ long c() {
        return this.f13557a;
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void d() {
        this.f13558b.d();
    }
}
