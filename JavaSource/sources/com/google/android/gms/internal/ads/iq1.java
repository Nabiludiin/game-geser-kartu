package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class iq1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yw1 f10122a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ lq1 f10123b;

    iq1(lq1 lq1Var, yw1 yw1Var) {
        this.f10122a = yw1Var;
        Objects.requireNonNull(lq1Var);
        this.f10123b = lq1Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        this.f10123b.d().e().putLong(this.f10122a.c(), r2.t.o().a());
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
