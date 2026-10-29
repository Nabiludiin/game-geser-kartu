package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class c71 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6279a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6280b;

    private c71(b71 b71Var, w85 w85Var, w85 w85Var2) {
        this.f6279a = w85Var;
        this.f6280b = w85Var2;
    }

    public static c71 a(b71 b71Var, w85 w85Var, w85 w85Var2) {
        return new c71(b71Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new r2.b((Context) this.f6279a.b(), (vj0) this.f6280b.b(), null);
    }
}
