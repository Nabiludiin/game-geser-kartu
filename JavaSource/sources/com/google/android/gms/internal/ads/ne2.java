package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ne2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12720a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12721b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12722c;

    private ne2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f12720a = w85Var;
        this.f12721b = w85Var2;
        this.f12722c = w85Var3;
    }

    public static ne2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new ne2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new me2((Context) this.f12720a.b(), (Executor) this.f12721b.b(), (st1) this.f12722c.b());
    }
}
