package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class cp2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6555a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6556b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6557c;

    private cp2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f6555a = w85Var2;
        this.f6556b = w85Var3;
        this.f6557c = w85Var4;
    }

    public static cp2 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new cp2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ap2 b() {
        return new ap2(z33.c(), ((f21) this.f6555a).a(), (Context) this.f6556b.b(), ((z85) this.f6557c).b());
    }
}
