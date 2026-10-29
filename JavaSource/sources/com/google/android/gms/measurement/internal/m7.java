package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class m7 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ g0 f22361q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22362r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ y7 f22363s;

    m7(y7 y7Var, g0 g0Var, String str) {
        this.f22361q = g0Var;
        this.f22362r = str;
        Objects.requireNonNull(y7Var);
        this.f22363s = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f22363s;
        y7Var.u4().E();
        y7Var.u4().i(this.f22361q, this.f22362r);
    }
}
