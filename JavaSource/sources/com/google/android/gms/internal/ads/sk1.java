package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class sk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final wj1 f15661a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15662b;

    private sk1(wj1 wj1Var, w85 w85Var) {
        this.f15661a = wj1Var;
        this.f15662b = w85Var;
    }

    public static sk1 a(wj1 wj1Var, w85 w85Var) {
        return new sk1(wj1Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f15661a.g((Executor) this.f15662b.b());
    }
}
