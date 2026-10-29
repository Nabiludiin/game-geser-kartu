package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class qy0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14665a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14666b;

    private qy0(w85 w85Var, w85 w85Var2) {
        this.f14665a = w85Var;
        this.f14666b = w85Var2;
    }

    public static qy0 c(w85 w85Var, w85 w85Var2) {
        return new qy0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final py0 b() {
        return new py0(((r85) this.f14665a).b(), ((r85) this.f14666b).b());
    }
}
