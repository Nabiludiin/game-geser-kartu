package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class ws2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18407a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18408b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f18409c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f18410d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f18411e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f18412f;

    private ws2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f18407a = w85Var;
        this.f18408b = w85Var2;
        this.f18409c = w85Var4;
        this.f18410d = w85Var5;
        this.f18411e = w85Var6;
        this.f18412f = w85Var7;
    }

    public static ws2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new ws2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new us2(((ju0) this.f18407a).b(), ((ou0) this.f18408b).a(), z33.c(), (ScheduledExecutorService) this.f18409c.b(), ((ja2) this.f18410d).b(), ((n91) this.f18411e).a(), ((ev0) this.f18412f).a());
    }
}
