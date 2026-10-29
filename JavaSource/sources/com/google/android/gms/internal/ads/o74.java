package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class o74 extends w64 {

    /* renamed from: s, reason: collision with root package name */
    private final Callable f13220s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ p74 f13221t;

    o74(p74 p74Var, Callable callable) {
        Objects.requireNonNull(p74Var);
        this.f13221t = p74Var;
        callable.getClass();
        this.f13220s = callable;
    }

    @Override // com.google.android.gms.internal.ads.w64
    final Object a() {
        return this.f13220s.call();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final String c() {
        return this.f13220s.toString();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final boolean d() {
        return this.f13221t.isDone();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final void e(Object obj) {
        this.f13221t.l(obj);
    }

    @Override // com.google.android.gms.internal.ads.w64
    final void f(Throwable th) {
        this.f13221t.m(th);
    }
}
