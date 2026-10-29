package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class pc2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13816a;

    /* renamed from: b, reason: collision with root package name */
    private final al1 f13817b;

    public pc2(Context context, al1 al1Var) {
        this.f13816a = context;
        this.f13817b = al1Var;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            id0 id0Var = (id0) na2Var.f12649b;
            id0Var.O0(c03Var.Z);
            id0Var.S6(c03Var.U, c03Var.f6192v.toString(), o03Var.f13136a.f11326a.f17958d, w3.b.C1(this.f13816a), new oc2(this, na2Var, null), (qb0) na2Var.f12650c);
        } catch (RemoteException e8) {
            v2.n1.l("Remote exception loading a interstitial RTB ad", e8);
            throw new d13(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        kc2 kc2Var = new kc2(c03Var, (id0) na2Var.f12649b, k2.c.INTERSTITIAL);
        sj1 d8 = this.f13817b.d(new i51(o03Var, c03Var, na2Var.f12648a), new wj1(kc2Var, null));
        kc2Var.c(d8.d());
        ((ac2) na2Var.f12650c).k8(d8.g());
        return d8.h();
    }
}
