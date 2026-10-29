package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class mc2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12196a;

    /* renamed from: b, reason: collision with root package name */
    private final al1 f12197b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.a f12198c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f12199d;

    public mc2(Context context, w2.a aVar, al1 al1Var, Executor executor) {
        this.f12196a = context;
        this.f12198c = aVar;
        this.f12197b = al1Var;
        this.f12199d = executor;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        v13 v13Var = (v13) na2Var.f12649b;
        w03 w03Var = o03Var.f13136a.f11326a;
        String jSONObject = c03Var.f6192v.toString();
        String m7 = v2.r0.m(c03Var.f6186s);
        v13Var.m(this.f12196a, w03Var.f17958d, jSONObject, m7, (qb0) na2Var.f12650c);
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        sj1 d8 = this.f12197b.d(new i51(o03Var, c03Var, na2Var.f12648a), new wj1(new lc2(this, na2Var, c03Var), null));
        d8.a().y0(new sz0((v13) na2Var.f12649b), this.f12199d);
        ((ac2) na2Var.f12650c).k8(d8.f());
        return d8.h();
    }

    final /* synthetic */ w2.a c() {
        return this.f12198c;
    }
}
