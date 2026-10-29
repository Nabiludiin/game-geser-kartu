package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class ys3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19766a;

    private ys3(w85 w85Var) {
        this.f19766a = w85Var;
    }

    public static ys3 a(w85 w85Var) {
        return new ys3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f19766a.b(), "ocs"), "pcam.jar");
    }
}
