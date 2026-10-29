package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class l71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11437a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11438b;

    private l71(w85 w85Var, w85 w85Var2) {
        this.f11437a = w85Var;
        this.f11438b = w85Var2;
    }

    public static l71 a(w85 w85Var, w85 w85Var2) {
        return new l71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f11437a.b(), (Executor) this.f11438b.b());
    }
}
