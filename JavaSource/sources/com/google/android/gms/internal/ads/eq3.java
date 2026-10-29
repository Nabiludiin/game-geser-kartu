package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class eq3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7755a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7756b;

    private eq3(w85 w85Var, w85 w85Var2) {
        this.f7755a = w85Var;
        this.f7756b = w85Var2;
    }

    public static eq3 a(w85 w85Var, w85 w85Var2) {
        return new eq3(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        mq b8 = jd3.b((Context) this.f7755a.b(), (lc3) this.f7756b.b());
        v85.b(b8);
        return b8;
    }
}
