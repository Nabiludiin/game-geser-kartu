package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class c31 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6235a;

    private c31(o21 o21Var, w85 w85Var) {
        this.f6235a = w85Var;
    }

    public static c31 a(o21 o21Var, w85 w85Var) {
        return new c31(o21Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new hi1((g41) this.f6235a.b(), cm0.f6506g));
        v85.b(singleton);
        return singleton;
    }
}
