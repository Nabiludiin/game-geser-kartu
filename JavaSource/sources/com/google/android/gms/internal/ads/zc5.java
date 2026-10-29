package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class zc5 {

    /* renamed from: a, reason: collision with root package name */
    private final i95 f20137a;

    public zc5(Context context, vc5 vc5Var) {
        this.f20137a = new i95(context, vc5Var);
    }

    public final zc5 a(final gu5 gu5Var) {
        i95 i95Var = this.f20137a;
        rx3.h(!i95Var.f9925w);
        gu5Var.getClass();
        i95Var.f9907e = new jy3() { // from class: com.google.android.gms.internal.ads.f95
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return gu5.this;
            }
        };
        return this;
    }

    public final zc5 b(final kb5 kb5Var) {
        i95 i95Var = this.f20137a;
        rx3.h(!i95Var.f9925w);
        kb5Var.getClass();
        i95Var.f9908f = new jy3() { // from class: com.google.android.gms.internal.ads.g95
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return kb5.this;
            }
        };
        return this;
    }

    public final ad5 c() {
        i95 i95Var = this.f20137a;
        rx3.h(!i95Var.f9925w);
        i95Var.f9925w = true;
        return new ad5(i95Var);
    }
}
