package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class r2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f21324u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p3 f21325v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(p3 p3Var, String str) {
        super(p3Var, true);
        this.f21324u = str;
        Objects.requireNonNull(p3Var);
        this.f21325v = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21325v.j())).endAdUnitExposure(this.f21324u, this.f20939r);
    }
}
