package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class bd2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5718a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5719b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f5720c;

    private bd2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f5718a = w85Var;
        this.f5719b = w85Var2;
        this.f5720c = w85Var3;
    }

    public static bd2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new bd2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ad2((Context) this.f5718a.b(), (wl1) this.f5719b.b(), (Executor) this.f5720c.b());
    }
}
