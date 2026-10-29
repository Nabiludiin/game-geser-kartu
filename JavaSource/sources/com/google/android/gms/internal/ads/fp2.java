package com.google.android.gms.internal.ads;

import android.content.Intent;

/* compiled from: MyApplication */
public final class fp2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8378a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8379b;

    private fp2(w85 w85Var, w85 w85Var2) {
        this.f8378a = w85Var;
        this.f8379b = w85Var2;
    }

    public static fp2 c(w85 w85Var, w85 w85Var2) {
        return new fp2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dp2 b() {
        return new dp2(((ou0) this.f8378a).a(), (Intent) this.f8379b.b());
    }
}
