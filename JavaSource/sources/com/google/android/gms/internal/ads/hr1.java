package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hr1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9625a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9626b;

    private hr1(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f9625a = w85Var2;
        this.f9626b = w85Var3;
    }

    public static hr1 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new hr1(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gr1 b() {
        return new gr1(z33.c(), ((br1) this.f9625a).b(), (lx1) this.f9626b.b());
    }
}
