package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class tc extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ uc f22666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tc(uc ucVar, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(ucVar);
        this.f22666e = ucVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        uc ucVar = this.f22666e;
        ucVar.n();
        ucVar.f22928a.a().w().a("Starting upload from DelayedRunnable");
        ucVar.f22755b.r();
    }
}
