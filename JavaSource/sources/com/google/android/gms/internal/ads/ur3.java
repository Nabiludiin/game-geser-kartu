package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class ur3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16927a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16928b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16929c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f16930d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f16931e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f16932f;

    private ur3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        this.f16927a = w85Var;
        this.f16928b = w85Var2;
        this.f16929c = w85Var3;
        this.f16930d = w85Var4;
        this.f16931e = w85Var5;
        this.f16932f = w85Var6;
    }

    public static ur3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        return new ur3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new tr3((Context) this.f16927a.b(), (ExecutorService) this.f16928b.b(), (li3) this.f16929c.b(), (lj3) this.f16930d.b(), (nu3) this.f16931e.b(), (xr3) this.f16932f.b());
    }
}
