package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class za2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20101a;

    /* renamed from: b, reason: collision with root package name */
    private final u11 f20102b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20103c;

    za2(Context context, u11 u11Var, Executor executor) {
        this.f20101a = context;
        this.f20102b = u11Var;
        this.f20103c = executor;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        v13 v13Var = (v13) na2Var.f12649b;
        w03 w03Var = o03Var.f13136a.f11326a;
        String jSONObject = c03Var.f6192v.toString();
        v13Var.D(this.f20101a, w03Var.f17958d, jSONObject, (qb0) na2Var.f12650c);
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        r11 e8 = this.f20102b.e(new i51(o03Var, c03Var, na2Var.f12648a), new wj1(new ya2(this, na2Var, c03Var), null), new s11(c03Var.f6151a0));
        e8.a().y0(new sz0((v13) na2Var.f12649b), this.f20103c);
        ((ac2) na2Var.f12650c).k8(e8.f());
        return e8.h();
    }
}
