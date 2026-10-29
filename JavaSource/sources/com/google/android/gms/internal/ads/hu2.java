package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class hu2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9698a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9699b;

    private hu2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f9698a = w85Var2;
        this.f9699b = w85Var3;
    }

    public static hu2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new hu2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new fu2(iy0.a(), (ScheduledExecutorService) this.f9698a.b(), ((ou0) this.f9699b).a());
    }
}
