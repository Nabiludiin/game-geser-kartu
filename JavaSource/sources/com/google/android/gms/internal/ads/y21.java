package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class y21 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final o21 f19341a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f19342b;

    private y21(o21 o21Var, w85 w85Var) {
        this.f19341a = o21Var;
        this.f19342b = w85Var;
    }

    public static y21 a(o21 o21Var, w85 w85Var) {
        return new y21(o21Var, w85Var);
    }

    public static Set c(o21 o21Var, g41 g41Var) {
        Set singleton = Collections.singleton(new hi1(g41Var, cm0.f6506g));
        v85.b(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return c(this.f19341a, (g41) this.f19342b.b());
    }
}
