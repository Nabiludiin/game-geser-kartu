package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tw1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16472a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16473b;

    private tw1(w85 w85Var, w85 w85Var2) {
        this.f16472a = w85Var;
        this.f16473b = w85Var2;
    }

    public static tw1 c(w85 w85Var, w85 w85Var2) {
        return new tw1(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sw1 b() {
        return new sw1((iu) this.f16472a.b(), ((r85) this.f16473b).b());
    }
}
