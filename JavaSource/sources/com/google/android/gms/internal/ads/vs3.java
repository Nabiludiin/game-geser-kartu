package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
public final class vs3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17753a;

    private vs3(w85 w85Var) {
        this.f17753a = w85Var;
    }

    public static vs3 a(w85 w85Var) {
        return new vs3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new File(new File((File) this.f17753a.b(), "ocs"), "pmtd");
    }
}
