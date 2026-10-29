package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class p7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22474a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f22475b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y7 f22476c;

    p7(y7 y7Var, ae aeVar, Bundle bundle) {
        this.f22474a = aeVar;
        this.f22475b = bundle;
        Objects.requireNonNull(y7Var);
        this.f22476c = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22476c;
        y7Var.u4().E();
        return y7Var.u4().q0(this.f22474a, this.f22475b);
    }
}
