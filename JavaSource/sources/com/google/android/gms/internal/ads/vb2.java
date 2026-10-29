package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class vb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17518a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17519b;

    private vb2(w85 w85Var, w85 w85Var2) {
        this.f17518a = w85Var;
        this.f17519b = w85Var2;
    }

    public static vb2 c(w85 w85Var, w85 w85Var2) {
        return new vb2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ub2 b() {
        return new ub2((Context) this.f17518a.b(), (n31) this.f17519b.b());
    }
}
