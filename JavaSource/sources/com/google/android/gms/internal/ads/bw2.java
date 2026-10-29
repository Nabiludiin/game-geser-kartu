package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class bw2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6039a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6040b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6041c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f6042d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f6043e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f6044f;

    private bw2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        this.f6039a = w85Var;
        this.f6040b = w85Var2;
        this.f6041c = w85Var3;
        this.f6042d = w85Var4;
        this.f6043e = w85Var5;
        this.f6044f = w85Var7;
    }

    public static bw2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7) {
        return new bw2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new aw2((Context) this.f6039a.b(), (Executor) this.f6040b.b(), (gu0) this.f6041c.b(), ((ux2) this.f6042d).b(), (yv2) this.f6043e.b(), new v03(), ((ev0) this.f6044f).a());
    }
}
