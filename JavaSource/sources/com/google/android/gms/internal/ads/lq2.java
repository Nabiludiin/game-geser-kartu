package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: MyApplication */
public final class lq2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f11735a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11736b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f11737c;

    private lq2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f11735a = w85Var;
        this.f11736b = w85Var2;
        this.f11737c = w85Var3;
    }

    public static lq2 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new lq2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jq2 b() {
        return new jq2((ApplicationInfo) this.f11735a.b(), (PackageInfo) this.f11736b.b(), ((ou0) this.f11737c).a());
    }
}
