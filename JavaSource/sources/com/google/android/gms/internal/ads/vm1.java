package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class vm1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17672a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17673b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17674c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f17675d;

    private vm1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f17672a = w85Var;
        this.f17673b = w85Var2;
        this.f17674c = w85Var3;
        this.f17675d = w85Var4;
    }

    public static vm1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new vm1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        dr drVar = (dr) this.f17672a.b();
        Executor executor = (Executor) this.f17673b.b();
        Context context = (Context) this.f17674c.b();
        return new l11(executor, new w01(context, drVar), (com.google.android.gms.common.util.e) this.f17675d.b());
    }
}
