package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class rp1 implements ra1 {

    /* renamed from: q, reason: collision with root package name */
    private final pn1 f15142q;

    /* renamed from: r, reason: collision with root package name */
    private final un1 f15143r;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f15144s;

    /* renamed from: t, reason: collision with root package name */
    private final Executor f15145t;

    public rp1(pn1 pn1Var, un1 un1Var, Executor executor, Executor executor2) {
        this.f15142q = pn1Var;
        this.f15143r = un1Var;
        this.f15144s = executor;
        this.f15145t = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final mr0 mr0Var) {
        this.f15144s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qp1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mr0.this.B("onSdkImpression", new r.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        if (this.f15143r.d()) {
            pn1 pn1Var = this.f15142q;
            fa2 z7 = pn1Var.z();
            if (z7 == null && pn1Var.x() != null && ((Boolean) s2.b0.c().d(uy.W5)).booleanValue()) {
                a5.d x7 = pn1Var.x();
                im0 y7 = pn1Var.y();
                if (x7 == null || y7 == null) {
                    return;
                }
                p64.r(p64.q(x7, y7), new pp1(this), this.f15145t);
                return;
            }
            if (z7 != null) {
                mr0 w7 = pn1Var.w();
                mr0 t7 = pn1Var.t();
                if (w7 == null) {
                    w7 = t7 == null ? null : t7;
                }
                if (w7 != null) {
                    a(w7);
                }
            }
        }
    }
}
