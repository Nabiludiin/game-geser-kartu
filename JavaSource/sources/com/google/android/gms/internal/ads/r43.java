package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class r43 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l43 f14738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w43 f14739b;

    r43(w43 w43Var, l43 l43Var) {
        this.f14738a = l43Var;
        Objects.requireNonNull(w43Var);
        this.f14739b = w43Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f14739b.f18029f.g().a0(this.f14738a, th);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        this.f14739b.f18029f.g().p0(this.f14738a);
    }
}
