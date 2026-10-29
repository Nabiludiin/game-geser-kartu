package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class iy1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10260a;

    private iy1(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        this.f10260a = w85Var;
    }

    public static iy1 a(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        return new iy1(gy1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set b8 = gy1.b((ry1) this.f10260a.b(), z33.c());
        v85.b(b8);
        return b8;
    }
}
