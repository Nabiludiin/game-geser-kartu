package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class eq1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7752a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7753b;

    private eq1(vp1 vp1Var, w85 w85Var, w85 w85Var2) {
        this.f7752a = w85Var;
        this.f7753b = w85Var2;
    }

    public static eq1 a(vp1 vp1Var, w85 w85Var, w85 w85Var2) {
        return new eq1(vp1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1(((jt1) this.f7752a).b(), (Executor) this.f7753b.b());
    }
}
