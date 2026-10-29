package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class fq3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8411a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8412b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f8413c;

    private fq3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f8411a = w85Var;
        this.f8412b = w85Var2;
        this.f8413c = w85Var3;
    }

    public static fq3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new fq3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new jq3((File) this.f8411a.b(), (gc3) this.f8412b.b(), (nu3) this.f8413c.b());
    }
}
