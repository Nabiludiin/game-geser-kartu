package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class a51 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m64 f4763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h51 f4764b;

    a51(h51 h51Var, m64 m64Var) {
        this.f4763a = m64Var;
        Objects.requireNonNull(h51Var);
        this.f4764b = h51Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f4763a.a(th);
        this.f4764b.f();
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f4764b.e(((z41) obj).f20006a, this.f4763a);
    }
}
