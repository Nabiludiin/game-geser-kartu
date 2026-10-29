package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class c00 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6139a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6140b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6141c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f6142d;

    private c00(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f6139a = w85Var;
        this.f6140b = w85Var2;
        this.f6141c = w85Var3;
        this.f6142d = w85Var4;
    }

    public static c00 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new c00(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a00 b() {
        return new a00((ScheduledExecutorService) this.f6139a.b(), (b3.j1) this.f6140b.b(), (b3.a1) this.f6141c.b(), (wx1) this.f6142d.b());
    }
}
