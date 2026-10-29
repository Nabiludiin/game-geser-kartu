package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class tn2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16264a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16265b;

    private tn2(w85 w85Var, w85 w85Var2) {
        this.f16264a = w85Var;
        this.f16265b = w85Var2;
    }

    public static tn2 a(w85 w85Var, w85 w85Var2) {
        return new tn2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        g14 l7;
        so2 b8 = ((uo2) this.f16264a).b();
        Context a8 = ((ou0) this.f16265b).a();
        if (((Boolean) s2.b0.c().d(uy.tc)).booleanValue()) {
            r2.t.g();
            if (v2.f2.f(a8)) {
                l7 = g14.m(b8);
                v85.b(l7);
                return l7;
            }
        }
        l7 = g14.l();
        v85.b(l7);
        return l7;
    }
}
