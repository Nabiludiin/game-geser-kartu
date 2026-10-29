package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class n2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f21144u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f21145v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ s1 f21146w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ p3 f21147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(p3 p3Var, String str, String str2, s1 s1Var) {
        super(p3Var, true);
        this.f21144u = str;
        this.f21145v = str2;
        this.f21146w = s1Var;
        Objects.requireNonNull(p3Var);
        this.f21147x = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21147x.j())).getConditionalUserProperties(this.f21144u, this.f21145v, this.f21146w);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    protected final void b() {
        this.f21146w.P0(null);
    }
}
