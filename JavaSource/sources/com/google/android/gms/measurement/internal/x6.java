package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class x6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y7 f22848b;

    x6(y7 y7Var, String str) {
        this.f22847a = str;
        Objects.requireNonNull(y7Var);
        this.f22848b = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22848b;
        y7Var.u4().E();
        return y7Var.u4().F0().C0(this.f22847a);
    }
}
