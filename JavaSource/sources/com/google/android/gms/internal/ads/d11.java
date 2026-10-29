package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class d11 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6905a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6906b;

    private d11(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f6905a = w85Var;
        this.f6906b = w85Var2;
    }

    public static d11 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new d11(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        dr drVar = (dr) this.f6905a.b();
        return new v01(drVar.d(), (ya0) this.f6906b.b(), x33.c());
    }
}
