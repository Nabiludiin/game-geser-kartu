package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class os1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y50 f13465b;

    os1(xs1 xs1Var, String str, y50 y50Var) {
        this.f13464a = str;
        this.f13465b = y50Var;
        Objects.requireNonNull(xs1Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((mr0) obj).s1(this.f13464a, this.f13465b);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
