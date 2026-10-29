package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class j71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10362a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10363b;

    private j71(w85 w85Var, w85 w85Var2) {
        this.f10362a = w85Var;
        this.f10363b = w85Var2;
    }

    public static j71 a(w85 w85Var, w85 w85Var2) {
        return new j71(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new hi1((we1) this.f10362a.b(), (Executor) this.f10363b.b());
    }
}
