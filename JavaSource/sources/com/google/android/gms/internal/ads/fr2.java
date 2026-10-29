package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class fr2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8434a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8435b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8436c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f8437d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f8438e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f8439f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f8440g;

    /* renamed from: h, reason: collision with root package name */
    private final w85 f8441h;

    /* renamed from: i, reason: collision with root package name */
    private final w85 f8442i;

    private fr2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        this.f8434a = w85Var2;
        this.f8435b = w85Var3;
        this.f8436c = w85Var4;
        this.f8437d = w85Var5;
        this.f8438e = w85Var6;
        this.f8439f = w85Var7;
        this.f8440g = w85Var8;
        this.f8441h = w85Var9;
        this.f8442i = w85Var10;
    }

    public static fr2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9, w85 w85Var10) {
        return new fr2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8, w85Var9, w85Var10);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new dr2(z33.c(), (ScheduledExecutorService) this.f8434a.b(), (String) this.f8435b.b(), (ug2) this.f8436c.b(), (Context) this.f8437d.b(), ((n91) this.f8438e).a(), (pg2) this.f8439f.b(), (ev1) this.f8440g.b(), (h02) this.f8441h.b(), ((Integer) this.f8442i.b()).intValue());
    }
}
