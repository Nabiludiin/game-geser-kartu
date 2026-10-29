package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class hk3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9561a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9562b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f9563c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f9564d;

    private hk3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f9561a = w85Var;
        this.f9562b = w85Var2;
        this.f9563c = w85Var3;
        this.f9564d = w85Var4;
    }

    public static hk3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new hk3(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new gk3(m85.c(this.f9561a), m85.c(this.f9562b), (ExecutorService) this.f9563c.b(), m85.c(this.f9564d));
    }
}
