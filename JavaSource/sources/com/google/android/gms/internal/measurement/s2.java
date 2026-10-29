package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class s2 extends a2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Runnable f21371q;

    s2(t2 t2Var, Runnable runnable) {
        this.f21371q = runnable;
        Objects.requireNonNull(t2Var);
    }

    @Override // com.google.android.gms.internal.measurement.b2
    public final void c() {
        this.f21371q.run();
    }
}
