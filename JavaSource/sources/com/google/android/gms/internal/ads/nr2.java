package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nr2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12872a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12873b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12874c;

    private nr2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f12872a = w85Var2;
        this.f12873b = w85Var3;
        this.f12874c = w85Var4;
    }

    public static nr2 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new nr2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lr2 b() {
        return new lr2(z33.c(), ((ou0) this.f12872a).a(), ((ev0) this.f12873b).a(), ((vu0) this.f12874c).b());
    }
}
