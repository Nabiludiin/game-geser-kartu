package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class zv1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f20367a;

    private zv1(w85 w85Var, w85 w85Var2) {
        this.f20367a = w85Var2;
    }

    public static zv1 a(w85 w85Var, w85 w85Var2) {
        return new zv1(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        z64 c8 = z33.c();
        Set singleton = ((Boolean) s2.b0.c().d(uy.J5)).booleanValue() ? Collections.singleton(new hi1(((tw1) this.f20367a).b(), c8)) : Collections.EMPTY_SET;
        v85.b(singleton);
        return singleton;
    }
}
