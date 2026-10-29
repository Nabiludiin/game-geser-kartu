package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class ms3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12402a;

    private ms3(w85 w85Var) {
        this.f12402a = w85Var;
    }

    public static ms3 a(w85 w85Var) {
        return new ms3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f12402a.b(), "dgd"), "pcam.jar.tmp");
    }
}
