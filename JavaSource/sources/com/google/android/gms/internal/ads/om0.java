package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class om0 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mm0 f13386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ km0 f13387b;

    om0(pm0 pm0Var, mm0 mm0Var, km0 km0Var) {
        this.f13386a = mm0Var;
        this.f13387b = km0Var;
        Objects.requireNonNull(pm0Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f13387b.a();
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        this.f13386a.d(obj);
    }
}
