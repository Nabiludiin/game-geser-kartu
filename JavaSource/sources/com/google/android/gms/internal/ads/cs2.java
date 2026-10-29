package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cs2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6600a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6601b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f6602c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f6603d;

    private cs2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f6600a = w85Var;
        this.f6601b = w85Var3;
        this.f6602c = w85Var4;
        this.f6603d = w85Var5;
    }

    public static cs2 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new cs2(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bs2 b() {
        return new bs2(((ou0) this.f6600a).a(), z33.c(), ((z85) this.f6601b).b(), (b63) this.f6602c.b(), (rx1) this.f6603d.b());
    }
}
