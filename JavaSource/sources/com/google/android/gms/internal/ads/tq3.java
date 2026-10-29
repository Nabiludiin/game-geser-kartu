package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class tq3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16309a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16310b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16311c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f16312d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f16313e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f16314f;

    private tq3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        this.f16309a = w85Var;
        this.f16310b = w85Var2;
        this.f16311c = w85Var3;
        this.f16312d = w85Var4;
        this.f16313e = w85Var5;
        this.f16314f = w85Var6;
    }

    public static tq3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6) {
        return new tq3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new sq3((ge3) this.f16309a.b(), (as3) this.f16310b.b(), (at3) this.f16311c.b(), (nu3) this.f16312d.b(), (ExecutorService) this.f16313e.b(), (File) this.f16314f.b());
    }
}
