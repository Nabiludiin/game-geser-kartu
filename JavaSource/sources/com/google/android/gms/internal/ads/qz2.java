package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class qz2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14673a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14674b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f14675c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f14676d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f14677e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f14678f;

    private qz2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f14673a = w85Var;
        this.f14674b = w85Var2;
        this.f14675c = w85Var3;
        this.f14676d = w85Var4;
        this.f14677e = w85Var5;
        this.f14678f = w85Var7;
    }

    public static qz2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new qz2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new pz2((Context) this.f14673a.b(), (Executor) this.f14674b.b(), (gu0) this.f14675c.b(), ((vx2) this.f14676d).b(), (fz2) this.f14677e.b(), new v03(), (p03) this.f14678f.b());
    }
}
