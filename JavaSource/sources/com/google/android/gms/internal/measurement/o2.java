package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class o2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ j2 f21198u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f21199v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ String f21200w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ p3 f21201x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o2(p3 p3Var, j2 j2Var, String str, String str2) {
        super(p3Var, true);
        this.f21198u = j2Var;
        this.f21199v = str;
        this.f21200w = str2;
        Objects.requireNonNull(p3Var);
        this.f21201x = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21201x.j())).setCurrentScreenByScionActivityInfo(this.f21198u, this.f21199v, this.f21200w, this.f20938q);
    }
}
