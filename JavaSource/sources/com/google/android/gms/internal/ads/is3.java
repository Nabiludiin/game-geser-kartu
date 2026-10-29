package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class is3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10177a;

    private is3(w85 w85Var) {
        this.f10177a = w85Var;
    }

    public static is3 a(w85 w85Var) {
        return new is3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f10177a.b(), "dgd"), "pmtd");
    }
}
