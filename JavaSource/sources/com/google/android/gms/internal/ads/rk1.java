package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class rk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14961a;

    private rk1(w85 w85Var) {
        this.f14961a = w85Var;
    }

    public static rk1 a(w85 w85Var) {
        return new rk1(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new hi1((ll1) this.f14961a.b(), cm0.f6506g));
        v85.b(singleton);
        return singleton;
    }
}
