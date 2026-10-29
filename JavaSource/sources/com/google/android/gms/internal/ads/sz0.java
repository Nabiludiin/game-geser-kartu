package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class sz0 implements sa1 {

    /* renamed from: q, reason: collision with root package name */
    private final v13 f15892q;

    public sz0(v13 v13Var) {
        this.f15892q = v13Var;
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void d(Context context) {
        try {
            this.f15892q.k();
        } catch (d13 e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Cannot invoke onDestroy for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void h(Context context) {
        try {
            this.f15892q.n();
        } catch (d13 e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Cannot invoke onPause for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void j(Context context) {
        try {
            v13 v13Var = this.f15892q;
            v13Var.o();
            if (context != null) {
                v13Var.u(context);
            }
        } catch (d13 e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Cannot invoke onResume for the mediation adapter.", e8);
        }
    }
}
