package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o72 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13217a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13218b;

    private o72(w85 w85Var, w85 w85Var2) {
        this.f13217a = w85Var;
        this.f13218b = w85Var2;
    }

    public static o72 c(w85 w85Var, w85 w85Var2) {
        return new o72(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n72 b() {
        return new n72(((k72) this.f13217a).b(), (z64) this.f13218b.b());
    }
}
