package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class lk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11633a;

    private lk1(wj1 wj1Var, w85 w85Var) {
        this.f11633a = w85Var;
    }

    public static lk1 a(wj1 wj1Var, w85 w85Var) {
        return new lk1(wj1Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new hi1((m81) this.f11633a.b(), cm0.f6506g));
        v85.b(singleton);
        return singleton;
    }
}
