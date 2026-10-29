package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class g02 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8576a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8577b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8578c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f8579d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f8580e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f8581f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f8582g;

    /* renamed from: h, reason: collision with root package name */
    private final w85 f8583h;

    /* renamed from: i, reason: collision with root package name */
    private final w85 f8584i;

    private g02(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        this.f8576a = w85Var;
        this.f8577b = w85Var2;
        this.f8578c = w85Var3;
        this.f8579d = w85Var5;
        this.f8580e = w85Var6;
        this.f8581f = w85Var7;
        this.f8582g = w85Var8;
        this.f8583h = w85Var9;
        this.f8584i = w85Var10;
    }

    public static g02 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        return new g02(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8, w85Var9, w85Var10);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new f02((Executor) this.f8576a.b(), ((ou0) this.f8577b).a(), ((pu0) this.f8578c).a(), z33.c(), (ev1) this.f8579d.b(), (ScheduledExecutorService) this.f8580e.b(), (cy1) this.f8581f.b(), ((ev0) this.f8582g).a(), ((oh1) this.f8583h).b(), (e63) this.f8584i.b());
    }
}
