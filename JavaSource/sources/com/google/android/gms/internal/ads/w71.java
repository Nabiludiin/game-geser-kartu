package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class w71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18096a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18097b;

    private w71(w85 w85Var, w85 w85Var2) {
        this.f18096a = w85Var;
        this.f18097b = w85Var2;
    }

    public static w71 a(w85 w85Var, w85 w85Var2) {
        return new w71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f18096a.b(), (Executor) this.f18097b.b());
    }
}
