package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class d93 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ e93 f6998q;

    d93(e93 e93Var) {
        Objects.requireNonNull(e93Var);
        this.f6998q = e93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e93 e93Var = this.f6998q;
        if (e93Var.a() != null) {
            m83 a8 = e93Var.a();
            com.google.android.gms.common.util.e b8 = e93Var.b();
            a8.j(b8.a(), e93Var.c(), e93Var.f7479e.f26192t, e93Var.Q());
        }
    }
}
