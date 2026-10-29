package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class mu3 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lu3 f12440a;

    mu3(nu3 nu3Var, lu3 lu3Var) {
        this.f12440a = lu3Var;
        Objects.requireNonNull(nu3Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        lu3 lu3Var = this.f12440a;
        lu3Var.b(th);
        lu3Var.c();
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        this.f12440a.c();
    }
}
