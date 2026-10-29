package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* compiled from: MyApplication */
final class l8 extends h8 {

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ m8 f21670x;

    l8(m8 m8Var) {
        Objects.requireNonNull(m8Var);
        this.f21670x = m8Var;
    }

    @Override // com.google.android.gms.internal.play_billing.h8
    protected final String a() {
        i8 i8Var = (i8) this.f21670x.f21691q.get();
        if (i8Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(i8Var.f21570a) + "]";
    }
}
