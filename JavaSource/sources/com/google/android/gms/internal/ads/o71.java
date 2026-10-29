package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class o71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13215a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13216b;

    private o71(w85 w85Var, w85 w85Var2) {
        this.f13215a = w85Var;
        this.f13216b = w85Var2;
    }

    public static o71 a(w85 w85Var, w85 w85Var2) {
        return new o71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f13215a.b(), (Executor) this.f13216b.b());
    }
}
