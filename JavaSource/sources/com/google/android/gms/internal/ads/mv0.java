package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class mv0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12448a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12449b;

    private mv0(w85 w85Var, w85 w85Var2) {
        this.f12448a = w85Var;
        this.f12449b = w85Var2;
    }

    public static mv0 c(w85 w85Var, w85 w85Var2) {
        return new mv0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yg0 b() {
        Context a8 = ((ou0) this.f12448a).a();
        e63 e63Var = (e63) this.f12449b.b();
        pa0 a9 = r2.t.v().a(a8, w2.a.M0(), e63Var);
        ja0 ja0Var = ma0.f12152b;
        a9.a("google.afma.request.getAdDictionary", ja0Var, ja0Var);
        return new ah0(a8, r2.t.v().a(a8, w2.a.M0(), e63Var).a("google.afma.sdkConstants.getSdkConstants", ja0Var, ja0Var), w2.a.M0());
    }
}
