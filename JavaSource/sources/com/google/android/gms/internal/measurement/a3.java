package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class a3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f20797u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f20798v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ boolean f20799w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ s1 f20800x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ p3 f20801y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a3(p3 p3Var, String str, String str2, boolean z7, s1 s1Var) {
        super(p3Var, true);
        this.f20797u = str;
        this.f20798v = str2;
        this.f20799w = z7;
        this.f20800x = s1Var;
        Objects.requireNonNull(p3Var);
        this.f20801y = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f20801y.j())).getUserProperties(this.f20797u, this.f20798v, this.f20799w, this.f20800x);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    protected final void b() {
        this.f20800x.P0(null);
    }
}
