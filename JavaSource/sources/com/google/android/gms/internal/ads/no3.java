package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class no3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final DisplayMetrics f12826f;

    /* renamed from: g, reason: collision with root package name */
    private final View f12827g;

    no3(ak akVar, dn3 dn3Var, DisplayMetrics displayMetrics, View view, nu3 nu3Var) {
        super("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", akVar, dn3Var, nu3Var.a(f.j.K0));
        this.f12826f = displayMetrics;
        this.f12827g = view;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        View view = this.f12827g;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke("", this.f12826f, view);
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        vk d02 = wk.d0();
        d02.F(lArr[2].longValue());
        d02.G(lArr[1].longValue());
        d02.H(lArr[0].longValue());
        d02.E(lArr[3].longValue());
        d02.I(lArr[4].longValue());
        akVar.Q((wk) d02.A());
    }
}
