package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class db2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7041a;

    /* renamed from: b, reason: collision with root package name */
    private final u11 f7042b;

    db2(Context context, u11 u11Var) {
        this.f7041a = context;
        this.f7042b = u11Var;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            id0 id0Var = (id0) na2Var.f12649b;
            id0Var.O0(c03Var.Z);
            id0Var.D1(c03Var.U, c03Var.f6192v.toString(), o03Var.f13136a.f11326a.f17958d, w3.b.C1(this.f7041a), new cb2(na2Var, null), (qb0) na2Var.f12650c);
        } catch (RemoteException e8) {
            v2.n1.l("Remote exception loading an app open RTB ad", e8);
            throw new d13(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        kc2 kc2Var = new kc2(c03Var, (id0) na2Var.f12649b, k2.c.APP_OPEN_AD);
        r11 e8 = this.f7042b.e(new i51(o03Var, c03Var, na2Var.f12648a), new wj1(kc2Var, null), new s11(c03Var.f6151a0));
        kc2Var.c(e8.d());
        ((ac2) na2Var.f12650c).k8(e8.g());
        return e8.h();
    }
}
