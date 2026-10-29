package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ad2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4887a;

    /* renamed from: b, reason: collision with root package name */
    private final wl1 f4888b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f4889c;

    public ad2(Context context, wl1 wl1Var, Executor executor) {
        this.f4887a = context;
        this.f4888b = wl1Var;
        this.f4889c = executor;
    }

    private static final boolean c(o03 o03Var, int i7) {
        return o03Var.f13136a.f11326a.f17962h.contains(Integer.toString(i7));
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        v13 v13Var = (v13) na2Var.f12649b;
        w03 w03Var = o03Var.f13136a.f11326a;
        String jSONObject = c03Var.f6192v.toString();
        String m7 = v2.r0.m(c03Var.f6186s);
        v13Var.t(this.f4887a, w03Var.f17958d, jSONObject, m7, (qb0) na2Var.f12650c, w03Var.f17964j, w03Var.f17962h);
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        pn1 H;
        v13 v13Var = (v13) na2Var.f12649b;
        ub0 d8 = v13Var.d();
        vb0 e8 = v13Var.e();
        yb0 z7 = v13Var.z();
        if (z7 != null && c(o03Var, 6)) {
            H = pn1.G(z7);
        } else if (d8 != null && c(o03Var, 6)) {
            H = pn1.J(d8);
        } else if (d8 != null && c(o03Var, 2)) {
            H = pn1.I(d8);
        } else if (e8 != null && c(o03Var, 6)) {
            H = pn1.K(e8);
        } else {
            if (e8 == null || !c(o03Var, 1)) {
                throw new ce2(1, "No native ad mappers");
            }
            H = pn1.H(e8);
        }
        if (H != null) {
            w03 w03Var = o03Var.f13136a.f11326a;
            if (w03Var.f17962h.contains(Integer.toString(H.k0()))) {
                rn1 e9 = this.f4888b.e(new i51(o03Var, c03Var, na2Var.f12648a), new bo1(H), new vp1(e8, d8, z7));
                ((ac2) na2Var.f12650c).k8(e9.f());
                e9.a().y0(new sz0(v13Var), this.f4889c);
                return e9.h();
            }
        }
        throw new ce2(1, "No corresponding native ad listener");
    }
}
