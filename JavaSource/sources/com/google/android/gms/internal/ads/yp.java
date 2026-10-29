package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: MyApplication */
public final class yp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private final View f19704h;

    public yp(ko koVar, String str, String str2, ak akVar, int i7, int i8, View view) {
        super(koVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", akVar, i7, 57);
        this.f19704h = view;
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        View view = this.f19704h;
        if (view != null) {
            Boolean bool = (Boolean) s2.b0.c().d(uy.U3);
            Boolean bool2 = (Boolean) s2.b0.c().d(uy.Yb);
            oo ooVar = new oo((String) this.f5899e.invoke(null, view, this.f5895a.b().getResources().getDisplayMetrics(), bool, bool2));
            vk d02 = wk.d0();
            d02.F(ooVar.f13416b.longValue());
            d02.G(ooVar.f13417c.longValue());
            d02.H(ooVar.f13418d.longValue());
            if (bool2.booleanValue()) {
                d02.E(ooVar.f13420f.longValue());
            }
            if (bool.booleanValue()) {
                d02.I(ooVar.f13419e.longValue());
            }
            this.f5898d.Q((wk) d02.A());
        }
    }
}
