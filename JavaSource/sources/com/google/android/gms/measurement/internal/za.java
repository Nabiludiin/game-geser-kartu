package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class za extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vb f22937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    za(vb vbVar, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(vbVar);
        this.f22937e = vbVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        this.f22937e.f22928a.a().r().a("Tasks have been queued for a long time");
    }
}
