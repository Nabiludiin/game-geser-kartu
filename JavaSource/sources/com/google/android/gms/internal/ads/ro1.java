package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: MyApplication */
public final class ro1 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f15138a;

    ro1(rx1 rx1Var) {
        this.f15138a = rx1Var;
    }

    public final void a(View view, c03 c03Var) {
        if (!((Boolean) s2.b0.c().d(uy.Wd)).booleanValue() || view == null) {
            return;
        }
        String str = true != v2.c.a(view) ? "0" : "1";
        qx1 a8 = this.f15138a.a();
        a8.c("action", "hcp");
        a8.c("hcp", str);
        a8.b(c03Var);
        a8.d();
    }
}
