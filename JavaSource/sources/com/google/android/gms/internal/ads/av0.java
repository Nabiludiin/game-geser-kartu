package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: MyApplication */
public final class av0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5299a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5300b;

    private av0(w85 w85Var, w85 w85Var2) {
        this.f5299a = w85Var;
        this.f5300b = w85Var2;
    }

    public static av0 a(w85 w85Var, w85 w85Var2) {
        return new av0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return u3.e.a(((ou0) this.f5299a).a()).f(((ApplicationInfo) this.f5300b.b()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
