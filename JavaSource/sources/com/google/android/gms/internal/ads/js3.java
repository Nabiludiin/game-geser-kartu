package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class js3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10739a;

    private js3(w85 w85Var) {
        this.f10739a = w85Var;
    }

    public static js3 a(w85 w85Var) {
        return new js3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f10739a.b(), "dgd"), "pcopt");
    }
}
