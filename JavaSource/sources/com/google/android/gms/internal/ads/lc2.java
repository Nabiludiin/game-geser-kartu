package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class lc2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ na2 f11550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c03 f11551b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ mc2 f11552c;

    lc2(mc2 mc2Var, na2 na2Var, c03 c03Var) {
        this.f11550a = na2Var;
        this.f11551b = c03Var;
        Objects.requireNonNull(mc2Var);
        this.f11552c = mc2Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        try {
            v13 v13Var = (v13) this.f11550a.f12649b;
            v13Var.x(z7);
            if (this.f11552c.c().f27053s < ((Integer) s2.b0.c().d(uy.Z0)).intValue()) {
                v13Var.i();
            } else {
                v13Var.j(context);
            }
        } catch (d13 e8) {
            int i7 = v2.n1.f26802b;
            w2.p.e("Cannot show interstitial.");
            throw new hl1(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f11551b;
    }
}
