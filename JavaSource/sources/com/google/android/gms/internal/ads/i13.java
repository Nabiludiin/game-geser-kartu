package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class i13 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k13 f9804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f9805b;

    i13(k13 k13Var, int i7) {
        this.f9805b = i7;
        Objects.requireNonNull(k13Var);
        this.f9804a = k13Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r2.t.l().i(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f9804a.c((String) obj, this.f9805b, null);
    }
}
