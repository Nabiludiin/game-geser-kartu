package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o52 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13199a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13200b;

    private o52(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f13199a = w85Var2;
        this.f13200b = w85Var3;
    }

    public static o52 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new o52(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n52 b() {
        return new n52(z33.c(), ((t42) this.f13199a).b(), m85.c(this.f13200b));
    }
}
