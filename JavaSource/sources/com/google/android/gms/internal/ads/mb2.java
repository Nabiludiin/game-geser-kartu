package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class mb2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12167a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12168b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12169c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f12170d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f12171e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f12172f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f12173g;

    private mb2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f12167a = w85Var;
        this.f12168b = w85Var2;
        this.f12169c = w85Var3;
        this.f12170d = w85Var4;
        this.f12171e = w85Var5;
        this.f12172f = w85Var6;
        this.f12173g = w85Var7;
    }

    public static mb2 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new mb2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lb2 b() {
        return new lb2((n31) this.f12167a.b(), (Context) this.f12168b.b(), (Executor) this.f12169c.b(), (ku1) this.f12170d.b(), ((n91) this.f12171e).a(), (hx3) this.f12172f.b(), (lx1) this.f12173g.b());
    }
}
