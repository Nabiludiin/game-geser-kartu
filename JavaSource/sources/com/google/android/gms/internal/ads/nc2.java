package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class nc2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12692a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12693b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12694c;

    private nc2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f12692a = w85Var;
        this.f12693b = w85Var2;
        this.f12694c = w85Var3;
    }

    public static nc2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new nc2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new mc2((Context) this.f12692a.b(), ((ev0) this.f12693b).a(), (al1) this.f12694c.b(), z33.c());
    }
}
