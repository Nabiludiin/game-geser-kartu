package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class qb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14354a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14355b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f14356c;

    private qb2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f14354a = w85Var;
        this.f14355b = w85Var2;
        this.f14356c = w85Var3;
    }

    public static qb2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new qb2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new pb2((Context) this.f14354a.b(), (n31) this.f14355b.b(), (Executor) this.f14356c.b());
    }
}
