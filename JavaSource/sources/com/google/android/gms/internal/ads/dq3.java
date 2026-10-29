package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class dq3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7232a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7233b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7234c;

    private dq3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f7232a = w85Var;
        this.f7233b = w85Var2;
        this.f7234c = w85Var3;
    }

    public static dq3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new dq3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new zp3((Context) this.f7232a.b(), (ExecutorService) this.f7233b.b(), (ik3) this.f7234c.b());
    }
}
