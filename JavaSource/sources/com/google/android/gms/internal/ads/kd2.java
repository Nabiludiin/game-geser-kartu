package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class kd2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10982a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10983b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10984c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f10985d;

    private kd2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f10982a = w85Var2;
        this.f10983b = w85Var3;
        this.f10984c = w85Var4;
        this.f10985d = w85Var5;
    }

    public static kd2 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new kd2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final id2 b() {
        return new id2(z33.c(), (ScheduledExecutorService) this.f10982a.b(), (u41) this.f10983b.b(), (yd2) this.f10984c.b(), (t73) this.f10985d.b());
    }
}
