package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class q7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22533a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f22534b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y7 f22535c;

    q7(y7 y7Var, ae aeVar, Bundle bundle) {
        this.f22533a = aeVar;
        this.f22534b = bundle;
        Objects.requireNonNull(y7Var);
        this.f22535c = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22535c;
        y7Var.u4().E();
        return y7Var.u4().q0(this.f22533a, this.f22534b);
    }
}
