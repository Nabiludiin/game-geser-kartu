package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class u22 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16549a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16550b;

    private u22(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f16549a = w85Var3;
        this.f16550b = w85Var4;
    }

    public static u22 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new u22(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t22 b() {
        return new t22(f43.c(), z33.c(), ((h32) this.f16549a).b(), m85.c(this.f16550b));
    }
}
