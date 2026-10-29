package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nk1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12765a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12766b;

    private nk1(wj1 wj1Var, w85 w85Var, w85 w85Var2) {
        this.f12765a = w85Var;
        this.f12766b = w85Var2;
    }

    public static nk1 c(wj1 wj1Var, w85 w85Var, w85 w85Var2) {
        return new nk1(wj1Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gk0 b() {
        return new gk0(((ou0) this.f12765a).a(), ((n91) this.f12766b).a().f17961g);
    }
}
