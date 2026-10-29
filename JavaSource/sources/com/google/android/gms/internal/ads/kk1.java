package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class kk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final wj1 f11085a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11086b;

    private kk1(wj1 wj1Var, w85 w85Var) {
        this.f11085a = wj1Var;
        this.f11086b = w85Var;
    }

    public static kk1 a(wj1 wj1Var, w85 w85Var) {
        return new kk1(wj1Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set e8 = this.f11085a.e((m81) this.f11086b.b());
        v85.b(e8);
        return e8;
    }
}
