package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class ny1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13106a;

    private ny1(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        this.f13106a = w85Var;
    }

    public static ny1 a(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        return new ny1(gy1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set f8 = gy1.f((ry1) this.f13106a.b(), z33.c());
        v85.b(f8);
        return f8;
    }
}
