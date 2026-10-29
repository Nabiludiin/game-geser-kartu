package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class lj0 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a5.d f11622a;

    lj0(qj0 qj0Var, a5.d dVar) {
        this.f11622a = dVar;
        Objects.requireNonNull(qj0Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        List list;
        list = qj0.f14448l;
        list.remove(this.f11622a);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list;
        list = qj0.f14448l;
        list.remove(this.f11622a);
    }
}
