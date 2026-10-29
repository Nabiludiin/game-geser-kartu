package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class wt3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18420a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18421b;

    private wt3(w85 w85Var, w85 w85Var2) {
        this.f18420a = w85Var;
        this.f18421b = w85Var2;
    }

    public static wt3 a(w85 w85Var, w85 w85Var2) {
        return new wt3(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new vt3((Context) this.f18420a.b(), (ExecutorService) this.f18421b.b());
    }
}
