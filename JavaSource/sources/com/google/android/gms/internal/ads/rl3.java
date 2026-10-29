package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class rl3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15003a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15004b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f15005c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f15006d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f15007e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f15008f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f15009g;

    private rl3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f15003a = w85Var;
        this.f15004b = w85Var2;
        this.f15005c = w85Var3;
        this.f15006d = w85Var4;
        this.f15007e = w85Var5;
        this.f15008f = w85Var6;
        this.f15009g = w85Var7;
    }

    public static rl3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new rl3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ol3((ExecutorService) this.f15003a.b(), m85.c(this.f15004b), m85.c(this.f15005c), (ft3) this.f15006d.b(), m85.c(this.f15007e), this.f15008f, (li3) this.f15009g.b());
    }
}
