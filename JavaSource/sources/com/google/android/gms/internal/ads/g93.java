package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class g93 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8723a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8724b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8725c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f8726d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f8727e;

    private g93(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f8723a = w85Var;
        this.f8724b = w85Var2;
        this.f8725c = w85Var3;
        this.f8726d = w85Var4;
        this.f8727e = w85Var5;
    }

    public static g93 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new g93(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new f93(((ou0) this.f8723a).a(), ((ev0) this.f8724b).a(), (ScheduledExecutorService) this.f8725c.b(), ((ay0) this.f8726d).b(), (com.google.android.gms.common.util.e) this.f8727e.b());
    }
}
