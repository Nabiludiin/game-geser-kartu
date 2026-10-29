package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class fd2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8199a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8200b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8201c;

    private fd2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f8199a = w85Var;
        this.f8200b = w85Var2;
        this.f8201c = w85Var3;
    }

    public static fd2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new fd2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ed2((Context) this.f8199a.b(), (wl1) this.f8200b.b(), ((ev0) this.f8201c).a());
    }
}
