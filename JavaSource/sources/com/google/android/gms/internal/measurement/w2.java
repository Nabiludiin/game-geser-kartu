package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class w2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ s1 f21419u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p3 f21420v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w2(p3 p3Var, s1 s1Var) {
        super(p3Var, true);
        this.f21419u = s1Var;
        Objects.requireNonNull(p3Var);
        this.f21420v = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21420v.j())).generateEventId(this.f21419u);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    protected final void b() {
        this.f21419u.P0(null);
    }
}
