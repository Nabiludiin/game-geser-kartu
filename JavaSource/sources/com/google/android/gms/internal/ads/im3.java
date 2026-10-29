package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: MyApplication */
public final class im3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10090a;

    private im3(w85 w85Var) {
        this.f10090a = w85Var;
    }

    public static im3 a(w85 w85Var) {
        return new im3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        DisplayMetrics displayMetrics = ((Context) this.f10090a.b()).getResources().getDisplayMetrics();
        v85.b(displayMetrics);
        return displayMetrics;
    }
}
