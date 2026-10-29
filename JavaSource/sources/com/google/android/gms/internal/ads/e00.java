package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class e00 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7372a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7373b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7374c;

    private e00(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f7372a = w85Var;
        this.f7373b = w85Var2;
        this.f7374c = w85Var4;
    }

    public static e00 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new e00(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new d00(((ou0) this.f7372a).a(), (ScheduledExecutorService) this.f7373b.b(), fx0.c(), (b63) this.f7374c.b());
    }
}
