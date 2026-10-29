package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class n74 extends w64 {

    /* renamed from: s, reason: collision with root package name */
    private final v54 f12615s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ p74 f12616t;

    n74(p74 p74Var, v54 v54Var) {
        Objects.requireNonNull(p74Var);
        this.f12616t = p74Var;
        this.f12615s = v54Var;
    }

    @Override // com.google.android.gms.internal.ads.w64
    final /* bridge */ /* synthetic */ Object a() {
        v54 v54Var = this.f12615s;
        a5.d a8 = v54Var.a();
        rx3.l(a8, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", v54Var);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.w64
    final String c() {
        return this.f12615s.toString();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final boolean d() {
        return this.f12616t.isDone();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final /* synthetic */ void e(Object obj) {
        this.f12616t.v((a5.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.w64
    final void f(Throwable th) {
        this.f12616t.m(th);
    }
}
