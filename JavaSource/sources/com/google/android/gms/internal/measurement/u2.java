package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class u2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ s1 f21394u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p3 f21395v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2(p3 p3Var, s1 s1Var) {
        super(p3Var, true);
        this.f21394u = s1Var;
        Objects.requireNonNull(p3Var);
        this.f21395v = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21395v.j())).getGmpAppId(this.f21394u);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    protected final void b() {
        this.f21394u.P0(null);
    }
}
