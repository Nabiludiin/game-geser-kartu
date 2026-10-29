package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class q71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14278a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14279b;

    private q71(w85 w85Var, w85 w85Var2) {
        this.f14278a = w85Var;
        this.f14279b = w85Var2;
    }

    public static q71 a(w85 w85Var, w85 w85Var2) {
        return new q71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f14278a.b(), (Executor) this.f14279b.b());
    }
}
