package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class zb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f20112a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f20113b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f20114c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f20115d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f20116e;

    private zb2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f20112a = w85Var;
        this.f20113b = w85Var2;
        this.f20114c = w85Var3;
        this.f20115d = w85Var4;
        this.f20116e = w85Var5;
    }

    public static zb2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new zb2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new yb2((Context) this.f20112a.b(), (Executor) this.f20113b.b(), (al1) this.f20114c.b(), (b03) this.f20115d.b(), (rx1) this.f20116e.b());
    }
}
