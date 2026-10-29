package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class ky1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11290a;

    private ky1(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        this.f11290a = w85Var;
    }

    public static ky1 a(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        return new ky1(gy1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set c8 = gy1.c((ry1) this.f11290a.b(), z33.c());
        v85.b(c8);
        return c8;
    }
}
