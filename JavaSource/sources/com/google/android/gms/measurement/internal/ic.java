package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ic extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kc f22252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ic(kc kcVar, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(kcVar);
        this.f22252e = kcVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        kc kcVar = this.f22252e;
        mc mcVar = kcVar.f22307d;
        mcVar.h();
        w6 w6Var = mcVar.f22928a;
        kcVar.d(false, false, w6Var.f().b());
        mcVar.f22928a.M().k(w6Var.f().b());
    }
}
