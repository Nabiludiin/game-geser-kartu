package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class n83 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12628a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12629b;

    private n83(w85 w85Var, w85 w85Var2) {
        this.f12628a = w85Var;
        this.f12629b = w85Var2;
    }

    public static n83 c(w85 w85Var, w85 w85Var2) {
        return new n83(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m83 b() {
        return new m83((rx1) this.f12628a.b(), ((ou0) this.f12629b).a());
    }
}
