package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class ed2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7565a;

    /* renamed from: b, reason: collision with root package name */
    private final wl1 f7566b;

    /* renamed from: c, reason: collision with root package name */
    private yb0 f7567c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f7568d;

    public ed2(Context context, wl1 wl1Var, w2.a aVar) {
        this.f7565a = context;
        this.f7566b = wl1Var;
        this.f7568d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            id0 id0Var = (id0) na2Var.f12649b;
            id0Var.O0(c03Var.Z);
            if (this.f7568d.f27053s < ((Integer) s2.b0.c().d(uy.Y1)).intValue()) {
                id0Var.I5(c03Var.U, c03Var.f6192v.toString(), o03Var.f13136a.f11326a.f17958d, w3.b.C1(this.f7565a), new dd2(this, na2Var, null), (qb0) na2Var.f12650c);
                return;
            }
            String str = c03Var.U;
            String jSONObject = c03Var.f6192v.toString();
            w03 w03Var = o03Var.f13136a.f11326a;
            id0Var.t3(str, jSONObject, w03Var.f17958d, w3.b.C1(this.f7565a), new dd2(this, na2Var, null), (qb0) na2Var.f12650c, w03Var.f17964j);
        } catch (RemoteException e8) {
            throw new d13(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        ArrayList arrayList = o03Var.f13136a.f11326a.f17962h;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new ce2(2, "Unified must be used for RTB.");
        }
        pn1 G = pn1.G(this.f7567c);
        if (!arrayList.contains(Integer.toString(G.k0()))) {
            throw new ce2(1, "No corresponding native ad listener");
        }
        rn1 e8 = this.f7566b.e(new i51(o03Var, c03Var, na2Var.f12648a), new bo1(G), new vp1(null, null, this.f7567c));
        ((ac2) na2Var.f12650c).k8(e8.g());
        return e8.h();
    }

    final /* synthetic */ void c(yb0 yb0Var) {
        this.f7567c = yb0Var;
    }
}
