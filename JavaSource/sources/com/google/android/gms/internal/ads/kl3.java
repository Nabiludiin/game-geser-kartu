package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class kl3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11110a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11111b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11112c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f11113d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f11114e;

    private kl3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f11110a = w85Var;
        this.f11111b = w85Var2;
        this.f11112c = w85Var3;
        this.f11113d = w85Var4;
        this.f11114e = w85Var5;
    }

    public static kl3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new kl3(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        li3 li3Var = (li3) this.f11110a.b();
        w85 w85Var = this.f11112c;
        return new jl3(li3Var, (fl3) this.f11111b.b(), (zk3) w85Var.b(), (ExecutorService) this.f11113d.b(), (nu3) this.f11114e.b());
    }
}
