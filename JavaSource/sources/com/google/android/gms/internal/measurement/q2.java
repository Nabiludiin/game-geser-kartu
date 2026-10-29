package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class q2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f21247u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p3 f21248v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(p3 p3Var, String str) {
        super(p3Var, true);
        this.f21247u = str;
        Objects.requireNonNull(p3Var);
        this.f21248v = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21248v.j())).beginAdUnitExposure(this.f21247u, this.f20939r);
    }
}
