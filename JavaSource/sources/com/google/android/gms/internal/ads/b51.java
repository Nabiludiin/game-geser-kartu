package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class b51 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m64 f5580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h51 f5581b;

    b51(h51 h51Var, m64 m64Var) {
        this.f5580a = m64Var;
        Objects.requireNonNull(h51Var);
        this.f5581b = h51Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f5581b.f();
        this.f5580a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f5581b.f();
        this.f5580a.b((r41) obj);
    }
}
