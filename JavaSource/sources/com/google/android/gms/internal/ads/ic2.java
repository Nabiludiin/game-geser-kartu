package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ic2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9979a;

    /* renamed from: b, reason: collision with root package name */
    private final ku1 f9980b;

    /* renamed from: c, reason: collision with root package name */
    private final al1 f9981c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f9982d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9983e;

    /* renamed from: f, reason: collision with root package name */
    private final w2.a f9984f;

    /* renamed from: g, reason: collision with root package name */
    private final c60 f9985g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9986h = ((Boolean) s2.b0.c().d(uy.T9)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final i92 f9987i;

    /* renamed from: j, reason: collision with root package name */
    private final lx1 f9988j;

    /* renamed from: k, reason: collision with root package name */
    private final rx1 f9989k;

    public ic2(Context context, w2.a aVar, w03 w03Var, Executor executor, al1 al1Var, ku1 ku1Var, c60 c60Var, i92 i92Var, lx1 lx1Var, rx1 rx1Var) {
        this.f9979a = context;
        this.f9982d = w03Var;
        this.f9981c = al1Var;
        this.f9983e = executor;
        this.f9984f = aVar;
        this.f9980b = ku1Var;
        this.f9985g = c60Var;
        this.f9987i = i92Var;
        this.f9988j = lx1Var;
        this.f9989k = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        h03 h03Var = c03Var.f6186s;
        return (h03Var == null || h03Var.f9277a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(final o03 o03Var, final c03 c03Var) {
        final ou1 ou1Var = new ou1();
        a5.d a8 = p64.a(null);
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.fc2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return ic2.this.c(c03Var, o03Var, ou1Var, obj);
            }
        };
        Executor executor = this.f9983e;
        a5.d j7 = p64.j(a8, w54Var, executor);
        j7.c(new Runnable(ou1Var) { // from class: com.google.android.gms.internal.ads.hc2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return j7;
    }

    final /* synthetic */ a5.d c(final c03 c03Var, o03 o03Var, ou1 ou1Var, Object obj) {
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f9988j.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_START.c(), r2.t.o().a());
        }
        ku1 ku1Var = this.f9980b;
        w03 w03Var = this.f9982d;
        final mr0 a8 = ku1Var.a(w03Var.f17960f, c03Var, o03Var.f13137b.f12530b);
        a8.l1(c03Var.W);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f9988j.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_END.c(), r2.t.o().a());
        }
        im0 im0Var = new im0();
        al1 al1Var = this.f9981c;
        i51 i51Var = new i51(o03Var, c03Var, null);
        Context context = this.f9979a;
        w2.a aVar = this.f9984f;
        boolean z7 = this.f9986h;
        c60 c60Var = this.f9985g;
        final sj1 d8 = al1Var.d(i51Var, new wj1(new gc2(context, aVar, im0Var, c03Var, a8, w03Var, z7, c60Var, this.f9987i, this.f9989k), a8));
        im0Var.b(d8);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f9988j.e().putLong(yw1.RENDERING_AD_COMPONENT_CREATION_END.c(), r2.t.o().a());
        }
        d8.d().y0(new ra1() { // from class: com.google.android.gms.internal.ads.dc2
            @Override // com.google.android.gms.internal.ads.ra1
            public final /* synthetic */ void E() {
                mr0 mr0Var = mr0.this;
                if (mr0Var.s0() != null) {
                    mr0Var.s0().m();
                }
            }
        }, cm0.f6506g);
        h03 h03Var = c03Var.f6186s;
        String str = h03Var.f9277a;
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && d8.l().a(true)) {
            str = ht0.a(str, ht0.b(c03Var));
        }
        ju1 k7 = d8.k();
        c60 c60Var2 = true != z7 ? null : c60Var;
        lx1 lx1Var = this.f9988j;
        k7.i(a8, true, c60Var2, lx1Var.e());
        d8.k();
        return p64.k(ju1.j(a8, h03Var.f9278b, str, lx1Var.e(), al1Var.c()), new hx3(this) { // from class: com.google.android.gms.internal.ads.ec2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj2) {
                mr0 mr0Var = a8;
                if (c03Var.M) {
                    mr0Var.u0();
                }
                sj1 sj1Var = d8;
                mr0Var.V();
                mr0Var.onPause();
                return sj1Var.h();
            }
        }, this.f9983e);
    }
}
