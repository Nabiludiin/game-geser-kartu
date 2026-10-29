package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class fg3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8245a;

    private fg3(w85 w85Var) {
        this.f8245a = w85Var;
    }

    public static fg3 a(w85 w85Var) {
        return new fg3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        final Context a8 = ((mu0) this.f8245a).a();
        q6.i.e(a8, "context");
        g0.e b8 = g0.f.b(g0.f.f23829a, dg3.f7101a, null, null, null, new p6.a() { // from class: com.google.android.gms.internal.ads.eg3
            @Override // p6.a
            public final /* synthetic */ Object a() {
                return f0.a.a(a8, "ad_quality_data.pb");
            }
        }, 14, null);
        v85.b(b8);
        return b8;
    }
}
