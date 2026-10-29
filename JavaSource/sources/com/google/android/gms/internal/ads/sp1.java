package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class sp1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15736a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15737b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f15738c;

    private sp1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f15736a = w85Var;
        this.f15737b = w85Var2;
        this.f15738c = w85Var3;
    }

    public static sp1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new sp1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new rp1(((io1) this.f15736a).a(), ((nm1) this.f15737b).b(), (Executor) this.f15738c.b(), z33.c());
    }
}
