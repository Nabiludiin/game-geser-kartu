package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class me2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12239a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12240b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f12241c;

    public me2(Context context, Executor executor, st1 st1Var) {
        this.f12239a = context;
        this.f12240b = executor;
        this.f12241c = st1Var;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            w03 w03Var = o03Var.f13136a.f11326a;
            if (w03Var.f17970p.f10839a == 3) {
                ((v13) na2Var.f12649b).C(this.f12239a, w03Var.f17958d, c03Var.f6192v.toString(), (qb0) na2Var.f12650c);
            } else {
                ((v13) na2Var.f12649b).A(this.f12239a, w03Var.f17958d, c03Var.f6192v.toString(), (qb0) na2Var.f12650c);
            }
        } catch (Exception e8) {
            String str = na2Var.f12648a;
            int i7 = v2.n1.f26802b;
            w2.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        ot1 e8 = this.f12241c.e(new i51(o03Var, c03Var, na2Var.f12648a), new pt1(new le2(this, na2Var, c03Var)));
        e8.a().y0(new sz0((v13) na2Var.f12649b), this.f12240b);
        ((ac2) na2Var.f12650c).k8(e8.m());
        return e8.h();
    }
}
