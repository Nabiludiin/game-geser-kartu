package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class xu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19038a;

    private xu0(w85 w85Var, w85 w85Var2) {
        this.f19038a = w85Var;
    }

    public static xu0 a(w85 w85Var, w85 w85Var2) {
        return new xu0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = ((Boolean) s2.b0.c().d(uy.U1)).booleanValue() ? Collections.singleton(new hi1((h02) this.f19038a.b(), z33.c())) : Collections.EMPTY_SET;
        v85.b(singleton);
        return singleton;
    }
}
