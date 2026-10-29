package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: MyApplication */
public final class vp2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17707a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17708b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17709c;

    private vp2(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f17707a = w85Var2;
        this.f17708b = w85Var3;
        this.f17709c = w85Var4;
    }

    public static vp2 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new vp2(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new tp2(z33.c(), ((n91) this.f17707a).a(), (PackageInfo) this.f17708b.b(), ((ju0) this.f17709c).b());
    }
}
