package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class n71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12606a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12607b;

    private n71(w85 w85Var, w85 w85Var2) {
        this.f12606a = w85Var;
        this.f12607b = w85Var2;
    }

    public static n71 a(w85 w85Var, w85 w85Var2) {
        return new n71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f12606a.b(), (Executor) this.f12607b.b());
    }
}
