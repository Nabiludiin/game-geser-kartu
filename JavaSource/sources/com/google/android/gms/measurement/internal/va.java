package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class va extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vb f22746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    va(vb vbVar, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(vbVar);
        this.f22746e = vbVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        vb vbVar = this.f22746e;
        vbVar.h();
        if (vbVar.W()) {
            vbVar.f22928a.a().w().a("Inactivity, disconnecting from the service");
            vbVar.A();
        }
    }
}
