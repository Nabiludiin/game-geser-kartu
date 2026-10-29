package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z42 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f20007a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f20008b;

    private z42(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f20007a = w85Var;
        this.f20008b = w85Var3;
    }

    public static z42 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new z42(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y42 b() {
        return new y42(((u85) this.f20007a).d(), z33.c(), ((id1) this.f20008b).b());
    }
}
