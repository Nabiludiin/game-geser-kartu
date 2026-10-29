package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class va2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final u11 f17476a;

    /* renamed from: b, reason: collision with root package name */
    private final ku1 f17477b;

    /* renamed from: c, reason: collision with root package name */
    private final w03 f17478c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f17479d;

    /* renamed from: e, reason: collision with root package name */
    private final w2.a f17480e;

    /* renamed from: f, reason: collision with root package name */
    private final c60 f17481f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f17482g = ((Boolean) s2.b0.c().d(uy.T9)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    private final i92 f17483h;

    /* renamed from: i, reason: collision with root package name */
    private final lx1 f17484i;

    /* renamed from: j, reason: collision with root package name */
    private final rx1 f17485j;

    public va2(u11 u11Var, Context context, Executor executor, ku1 ku1Var, w03 w03Var, w2.a aVar, c60 c60Var, i92 i92Var, lx1 lx1Var, rx1 rx1Var) {
        this.f17476a = u11Var;
        this.f17479d = executor;
        this.f17477b = ku1Var;
        this.f17478c = w03Var;
        this.f17480e = aVar;
        this.f17481f = c60Var;
        this.f17483h = i92Var;
        this.f17484i = lx1Var;
        this.f17485j = rx1Var;
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
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.ta2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return va2.this.c(c03Var, o03Var, ou1Var, obj);
            }
        };
        Executor executor = this.f17479d;
        a5.d j7 = p64.j(a8, w54Var, executor);
        j7.c(new Runnable(ou1Var) { // from class: com.google.android.gms.internal.ads.ua2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return j7;
    }

    final /* synthetic */ a5.d c(final c03 c03Var, o03 o03Var, ou1 ou1Var, Object obj) {
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f17484i.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_START.c(), r2.t.o().a());
        }
        ku1 ku1Var = this.f17477b;
        w03 w03Var = this.f17478c;
        final mr0 a8 = ku1Var.a(w03Var.f17960f, c03Var, o03Var.f13137b.f12530b);
        a8.l1(c03Var.W);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f17484i.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_END.c(), r2.t.o().a());
        }
        im0 im0Var = new im0();
        u11 u11Var = this.f17476a;
        i51 i51Var = new i51(o03Var, c03Var, null);
        w2.a aVar = this.f17480e;
        boolean z7 = this.f17482g;
        c60 c60Var = this.f17481f;
        final r11 e8 = u11Var.e(i51Var, new wj1(new xa2(aVar, im0Var, c03Var, a8, w03Var, z7, c60Var, this.f17483h, this.f17485j), a8), new s11(c03Var.f6151a0));
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f17484i.e().putLong(yw1.RENDERING_AD_COMPONENT_CREATION_END.c(), r2.t.o().a());
        }
        ju1 i7 = e8.i();
        c60 c60Var2 = true == z7 ? c60Var : null;
        lx1 lx1Var = this.f17484i;
        i7.i(a8, false, c60Var2, lx1Var.e());
        im0Var.b(e8);
        e8.d().y0(new ra1() { // from class: com.google.android.gms.internal.ads.ra2
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
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && e8.k().a(true)) {
            str = ht0.a(str, ht0.b(c03Var));
        }
        e8.i();
        return p64.k(ju1.j(a8, h03Var.f9278b, str, lx1Var.e(), u11Var.h()), new hx3(this) { // from class: com.google.android.gms.internal.ads.sa2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj2) {
                mr0 mr0Var = a8;
                if (c03Var.M) {
                    mr0Var.u0();
                }
                r11 r11Var = e8;
                mr0Var.V();
                mr0Var.onPause();
                return r11Var.h();
            }
        }, this.f17479d);
    }
}
