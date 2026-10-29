package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class ku3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11254a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11255b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11256c;

    private ku3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f11254a = w85Var;
        this.f11255b = w85Var2;
        this.f11256c = w85Var3;
    }

    public static ku3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new ku3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new iu3((Context) this.f11254a.b(), (sh3) this.f11255b.b(), (ExecutorService) this.f11256c.b(), iu3.f10196h);
    }
}
