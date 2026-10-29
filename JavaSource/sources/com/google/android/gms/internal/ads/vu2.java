package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class vu2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17775a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17776b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17777c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f17778d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f17779e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f17780f;

    private vu2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8) {
        this.f17775a = w85Var;
        this.f17776b = w85Var2;
        this.f17777c = w85Var5;
        this.f17778d = w85Var6;
        this.f17779e = w85Var7;
        this.f17780f = w85Var8;
    }

    public static vu2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8) {
        return new vu2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new tu2((ql0) this.f17775a.b(), ((mu2) this.f17776b).b().booleanValue(), my0.a(), z33.c(), ((ju2) this.f17777c).a(), (ScheduledExecutorService) this.f17778d.b(), ((ou2) this.f17779e).b().intValue(), ((pu2) this.f17780f).b().intValue());
    }
}
