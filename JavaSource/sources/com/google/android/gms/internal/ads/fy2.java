package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class fy2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8539a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8540b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8541c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f8542d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f8543e;

    private fy2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        this.f8539a = w85Var;
        this.f8540b = w85Var2;
        this.f8541c = w85Var3;
        this.f8542d = w85Var4;
        this.f8543e = w85Var5;
    }

    public static fy2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        return new fy2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ey2((Context) this.f8539a.b(), (Executor) this.f8540b.b(), (gu0) this.f8541c.b(), (ai2) this.f8542d.b(), (fz2) this.f8543e.b(), new v03());
    }
}
