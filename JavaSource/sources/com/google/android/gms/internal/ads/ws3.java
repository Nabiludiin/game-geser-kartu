package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class ws3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18413a;

    private ws3(w85 w85Var) {
        this.f18413a = w85Var;
    }

    public static ws3 a(w85 w85Var) {
        return new ws3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f18413a.b(), "ocs"), "pcbc");
    }
}
