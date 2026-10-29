package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class oy1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13551a;

    private oy1(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        this.f13551a = w85Var;
    }

    public static oy1 a(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        return new oy1(gy1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set g8 = gy1.g((ry1) this.f13551a.b(), z33.c());
        v85.b(g8);
        return g8;
    }
}
