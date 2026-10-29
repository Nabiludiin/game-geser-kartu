package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: MyApplication */
public final class nu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12925a;

    private nu0(w85 w85Var) {
        this.f12925a = w85Var;
    }

    public static nu0 a(w85 w85Var) {
        return new nu0(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ApplicationInfo applicationInfo = ((ou0) this.f12925a).a().getApplicationInfo();
        v85.b(applicationInfo);
        return applicationInfo;
    }
}
