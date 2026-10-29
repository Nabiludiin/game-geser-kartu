package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ki1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11055a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11056b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11057c;

    private ki1(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f11055a = w85Var;
        this.f11056b = w85Var2;
        this.f11057c = w85Var3;
    }

    public static ki1 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new ki1(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ji1((Context) this.f11055a.b(), ((z85) this.f11056b).b(), ((j51) this.f11057c).a());
    }
}
