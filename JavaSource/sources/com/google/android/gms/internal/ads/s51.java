package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class s51 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w51 f15465a;

    s51(w51 w51Var) {
        Objects.requireNonNull(w51Var);
        this.f15465a = w51Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        this.f15465a.k().y(false);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f15465a.k().y(true);
    }
}
