package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ur1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16922a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16923b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16924c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f16925d;

    private ur1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f16922a = w85Var;
        this.f16923b = w85Var2;
        this.f16924c = w85Var3;
        this.f16925d = w85Var4;
    }

    public static ur1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new ur1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new mr1((Executor) this.f16922a.b(), (l11) this.f16923b.b(), (ji1) this.f16924c.b(), (d01) this.f16925d.b());
    }
}
