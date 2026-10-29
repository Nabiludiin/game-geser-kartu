package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class s90 implements mm0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u90 f15502a;

    s90(u90 u90Var) {
        Objects.requireNonNull(u90Var);
        this.f15502a = u90Var;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        v2.n1.k("Releasing engine reference.");
        this.f15502a.h().h();
    }
}
