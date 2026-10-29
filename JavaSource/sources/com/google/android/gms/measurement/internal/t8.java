package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class t8 extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w9 f22658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t8(w9 w9Var, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(w9Var);
        this.f22658e = w9Var;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        w9 w9Var = this.f22658e;
        if (w9Var.f22928a.n()) {
            w9Var.c0().b(2000L);
        }
    }
}
