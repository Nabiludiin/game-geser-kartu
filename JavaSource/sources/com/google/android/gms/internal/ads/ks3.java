package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class ks3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11223a;

    private ks3(w85 w85Var) {
        this.f11223a = w85Var;
    }

    public static ks3 a(w85 w85Var) {
        return new ks3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f11223a.b(), "dgd"), "pcbc");
    }
}
