package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class a64 extends b64 {

    /* renamed from: u, reason: collision with root package name */
    private final Callable f4769u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ c64 f4770v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a64(c64 c64Var, Callable callable, Executor executor) {
        super(c64Var, executor);
        Objects.requireNonNull(c64Var);
        this.f4770v = c64Var;
        this.f4769u = callable;
    }

    @Override // com.google.android.gms.internal.ads.w64
    final Object a() {
        return this.f4769u.call();
    }

    @Override // com.google.android.gms.internal.ads.w64
    final String c() {
        return this.f4769u.toString();
    }

    @Override // com.google.android.gms.internal.ads.b64
    final void h(Object obj) {
        this.f4770v.l(obj);
    }
}
