package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class c11 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6214a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6215b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6216c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f6217d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f6218e;

    private c11(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f6214a = w85Var;
        this.f6215b = w85Var2;
        this.f6216c = w85Var3;
        this.f6217d = w85Var4;
        this.f6218e = w85Var5;
    }

    public static c11 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new c11(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new b11((ya0) this.f6214a.b(), (w01) this.f6215b.b(), (Executor) this.f6216c.b(), (v01) this.f6217d.b(), (com.google.android.gms.common.util.e) this.f6218e.b());
    }
}
