package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class nm0 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pm0 f12803a;

    nm0(pm0 pm0Var) {
        Objects.requireNonNull(pm0Var);
        this.f12803a = pm0Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f12803a.f().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        this.f12803a.f().set(1);
    }
}
