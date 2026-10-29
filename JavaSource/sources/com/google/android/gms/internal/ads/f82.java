package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class f82 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8061a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8062b;

    private f82(w85 w85Var, w85 w85Var2) {
        this.f8061a = w85Var;
        this.f8062b = w85Var2;
    }

    public static f82 c(w85 w85Var, w85 w85Var2) {
        return new f82(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e82 b() {
        return new e82((r72) this.f8061a.b(), ((x72) this.f8062b).b());
    }
}
