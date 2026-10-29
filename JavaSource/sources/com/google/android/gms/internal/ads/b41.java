package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class b41 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5550a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5551b;

    private b41(w85 w85Var, w85 w85Var2) {
        this.f5550a = w85Var;
        this.f5551b = w85Var2;
    }

    public static b41 c(w85 w85Var, w85 w85Var2) {
        return new b41(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a41 b() {
        return new a41(((g31) this.f5550a).a(), (Executor) this.f5551b.b());
    }
}
