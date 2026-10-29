package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class zh3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f20183a;

    private zh3(w85 w85Var) {
        this.f20183a = w85Var;
    }

    public static zh3 a(w85 w85Var) {
        return new zh3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        z64 b8 = g74.b((ExecutorService) this.f20183a.b());
        v85.b(b8);
        return b8;
    }
}
