package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class k7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22297a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y7 f22298b;

    k7(y7 y7Var, ae aeVar) {
        this.f22297a = aeVar;
        Objects.requireNonNull(y7Var);
        this.f22298b = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22298b;
        y7Var.u4().E();
        return new t4.a(y7Var.u4().S0(this.f22297a.f21861q));
    }
}
