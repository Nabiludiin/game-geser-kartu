package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class pe2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13858a;

    /* renamed from: b, reason: collision with root package name */
    private final st1 f13859b;

    public pe2(Context context, st1 st1Var) {
        this.f13858a = context;
        this.f13859b = st1Var;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            id0 id0Var = (id0) na2Var.f12649b;
            id0Var.O0(c03Var.Z);
            w03 w03Var = o03Var.f13136a.f11326a;
            if (w03Var.f17970p.f10839a == 3) {
                id0Var.Q4(c03Var.U, c03Var.f6192v.toString(), w03Var.f17958d, w3.b.C1(this.f13858a), new oe2(this, na2Var, null), (qb0) na2Var.f12650c);
            } else {
                id0Var.E1(c03Var.U, c03Var.f6192v.toString(), w03Var.f17958d, w3.b.C1(this.f13858a), new oe2(this, na2Var, null), (qb0) na2Var.f12650c);
            }
        } catch (RemoteException e8) {
            v2.n1.l("Remote exception loading a rewarded RTB ad", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        kc2 kc2Var = new kc2(c03Var, (id0) na2Var.f12649b, k2.c.REWARDED);
        ot1 e8 = this.f13859b.e(new i51(o03Var, c03Var, na2Var.f12648a), new pt1(kc2Var));
        kc2Var.c(e8.d());
        ((ac2) na2Var.f12650c).k8(e8.n());
        return e8.h();
    }
}
