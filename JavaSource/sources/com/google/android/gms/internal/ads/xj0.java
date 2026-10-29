package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class xj0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18848a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18849b;

    private xj0(w85 w85Var, w85 w85Var2) {
        this.f18848a = w85Var;
        this.f18849b = w85Var2;
    }

    public static xj0 a(w85 w85Var, w85 w85Var2) {
        return new xj0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new wj0((Context) this.f18848a.b(), (v2.p1) this.f18849b.b());
    }
}
