package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class uj3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16792a;

    private uj3(w85 w85Var) {
        this.f16792a = w85Var;
    }

    public static uj3 a(w85 w85Var) {
        return new uj3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new dk3((ExecutorService) this.f16792a.b());
    }
}
