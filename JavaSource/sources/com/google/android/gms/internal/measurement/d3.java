package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class d3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f20868u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ s1 f20869v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ p3 f20870w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d3(p3 p3Var, String str, s1 s1Var) {
        super(p3Var, true);
        this.f20868u = str;
        this.f20869v = s1Var;
        Objects.requireNonNull(p3Var);
        this.f20870w = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f20870w.j())).getMaxUserProperties(this.f20868u, this.f20869v);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    protected final void b() {
        this.f20869v.P0(null);
    }
}
