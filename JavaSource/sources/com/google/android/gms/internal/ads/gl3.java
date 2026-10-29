package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class gl3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9016a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9017b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f9018c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f9019d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f9020e;

    private gl3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f9016a = w85Var;
        this.f9017b = w85Var2;
        this.f9018c = w85Var3;
        this.f9019d = w85Var4;
        this.f9020e = w85Var5;
    }

    public static gl3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new gl3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fl3(m85.c(this.f9016a), m85.c(this.f9017b), m85.c(this.f9018c), (ExecutorService) this.f9019d.b(), (nu3) this.f9020e.b());
    }
}
