package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class fu3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8501a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8502b;

    private fu3(w85 w85Var, w85 w85Var2) {
        this.f8501a = w85Var;
        this.f8502b = w85Var2;
    }

    public static fu3 a(w85 w85Var, w85 w85Var2) {
        return new fu3(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new eu3((Context) this.f8501a.b(), (ExecutorService) this.f8502b.b());
    }
}
