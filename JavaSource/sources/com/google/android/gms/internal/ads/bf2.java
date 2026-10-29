package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class bf2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5742a;

    /* renamed from: b, reason: collision with root package name */
    private final ku1 f5743b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f5744c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f5745d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5746e;

    /* renamed from: f, reason: collision with root package name */
    private final w2.a f5747f;

    /* renamed from: g, reason: collision with root package name */
    private final c60 f5748g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5749h = ((Boolean) s2.b0.c().d(uy.T9)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final i92 f5750i;

    /* renamed from: j, reason: collision with root package name */
    private final lx1 f5751j;

    /* renamed from: k, reason: collision with root package name */
    private final rx1 f5752k;

    public bf2(Context context, w2.a aVar, w03 w03Var, Executor executor, st1 st1Var, ku1 ku1Var, c60 c60Var, i92 i92Var, lx1 lx1Var, rx1 rx1Var) {
        this.f5742a = context;
        this.f5745d = w03Var;
        this.f5744c = st1Var;
        this.f5746e = executor;
        this.f5747f = aVar;
        this.f5743b = ku1Var;
        this.f5748g = c60Var;
        this.f5750i = i92Var;
        this.f5751j = lx1Var;
        this.f5752k = rx1Var;
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
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.af2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return bf2.this.c(c03Var, o03Var, ou1Var, obj);
            }
        };
        Executor executor = this.f5746e;
        a5.d j7 = p64.j(a8, w54Var, executor);
        j7.c(new Runnable(ou1Var) { // from class: com.google.android.gms.internal.ads.ue2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return j7;
    }

    final /* synthetic */ a5.d c(final c03 c03Var, o03 o03Var, ou1 ou1Var, Object obj) {
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f5751j.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_START.c(), r2.t.o().a());
        }
        ku1 ku1Var = this.f5743b;
        w03 w03Var = this.f5745d;
        final mr0 a8 = ku1Var.a(w03Var.f17960f, c03Var, o03Var.f13137b.f12530b);
        a8.l1(c03Var.W);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f5751j.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_END.c(), r2.t.o().a());
        }
        im0 im0Var = new im0();
        st1 st1Var = this.f5744c;
        i51 i51Var = new i51(o03Var, c03Var, null);
        Context context = this.f5742a;
        w2.a aVar = this.f5747f;
        c60 c60Var = this.f5748g;
        boolean z7 = this.f5749h;
        i92 i92Var = this.f5750i;
        lx1 lx1Var = this.f5751j;
        final ot1 e8 = st1Var.e(i51Var, new pt1(new xe2(context, ku1Var, w03Var, aVar, c03Var, im0Var, a8, c60Var, z7, i92Var, lx1Var, this.f5752k), a8));
        im0Var.b(e8);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            lx1Var.e().putLong(yw1.RENDERING_AD_COMPONENT_CREATION_END.c(), r2.t.o().a());
        }
        s60.b(a8, e8.k());
        e8.d().y0(new ra1() { // from class: com.google.android.gms.internal.ads.ye2
            @Override // com.google.android.gms.internal.ads.ra1
            public final /* synthetic */ void E() {
                mr0 mr0Var = mr0.this;
                if (mr0Var.s0() != null) {
                    mr0Var.s0().m();
                }
            }
        }, cm0.f6506g);
        e8.l().i(a8, true, true != z7 ? null : c60Var, lx1Var.e());
        h03 h03Var = c03Var.f6186s;
        String str = h03Var.f9277a;
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && e8.o().a(true)) {
            str = ht0.a(str, ht0.b(c03Var));
        }
        e8.l();
        return p64.k(ju1.j(a8, h03Var.f9278b, str, lx1Var.e(), st1Var.h()), new hx3(this) { // from class: com.google.android.gms.internal.ads.ze2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj2) {
                mr0 mr0Var = a8;
                if (c03Var.M) {
                    mr0Var.u0();
                }
                ot1 ot1Var = e8;
                mr0Var.V();
                mr0Var.onPause();
                return ot1Var.h();
            }
        }, this.f5746e);
    }
}
