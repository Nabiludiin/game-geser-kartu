package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class tb1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16116a;

    private tb1(w85 w85Var) {
        this.f16116a = w85Var;
    }

    public static tb1 c(w85 w85Var) {
        return new tb1(w85Var);
    }

    public static sb1 d(Set set) {
        return new sb1(set);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sb1 b() {
        return new sb1(((z85) this.f16116a).b());
    }
}
