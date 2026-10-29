package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class ck1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6481a;

    private ck1(wj1 wj1Var, w85 w85Var) {
        this.f6481a = w85Var;
    }

    public static ck1 a(wj1 wj1Var, w85 w85Var) {
        return new ck1(wj1Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new hi1((m81) this.f6481a.b(), cm0.f6506g));
        v85.b(singleton);
        return singleton;
    }
}
