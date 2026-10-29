package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class s91 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15503a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15504b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f15505c;

    private s91(r91 r91Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f15503a = w85Var;
        this.f15504b = w85Var2;
        this.f15505c = w85Var3;
    }

    public static s91 a(r91 r91Var, w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new s91(r91Var, w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return r91.a((Context) this.f15503a.b(), ((ev0) this.f15504b).a(), ((j51) this.f15505c).a(), hx0.c());
    }
}
