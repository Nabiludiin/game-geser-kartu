package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class lb2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final n31 f11508a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11509b;

    /* renamed from: c, reason: collision with root package name */
    private final ku1 f11510c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f11511d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f11512e;

    /* renamed from: f, reason: collision with root package name */
    private final hx3 f11513f;

    /* renamed from: g, reason: collision with root package name */
    private final lx1 f11514g;

    public lb2(n31 n31Var, Context context, Executor executor, ku1 ku1Var, w03 w03Var, hx3 hx3Var, lx1 lx1Var) {
        this.f11509b = context;
        this.f11508a = n31Var;
        this.f11512e = executor;
        this.f11510c = ku1Var;
        this.f11511d = w03Var;
        this.f11513f = hx3Var;
        this.f11514g = lx1Var;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        h03 h03Var = c03Var.f6186s;
        return (h03Var == null || h03Var.f9277a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(final o03 o03Var, final c03 c03Var) {
        return p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.kb2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return lb2.this.c(o03Var, c03Var, obj);
            }
        }, this.f11512e);
    }

    final /* synthetic */ a5.d c(o03 o03Var, c03 c03Var, Object obj) {
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f11514g.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_START.c(), r2.t.o().a());
        }
        Context context = this.f11509b;
        s2.g5 a8 = c13.a(context, c03Var.f6190u);
        final mr0 a9 = this.f11510c.a(a8, c03Var, o03Var.f13137b.f12530b);
        a9.l1(c03Var.W);
        View a10 = (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) ? d41.a(context, a9.Z(), c03Var) : new nu1(context, a9.Z(), (v2.u) this.f11513f.apply(c03Var));
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f11514g.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_END.c(), r2.t.o().a());
        }
        n31 n31Var = this.f11508a;
        final i21 e8 = n31Var.e(new i51(o03Var, c03Var, null), new o21(a10, a9, new p41() { // from class: com.google.android.gms.internal.ads.gb2
            @Override // com.google.android.gms.internal.ads.p41
            public final /* synthetic */ s2.b3 a() {
                return mr0.this.g();
            }
        }, c13.b(a8)));
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f11514g.e().putLong(yw1.RENDERING_AD_COMPONENT_CREATION_END.c(), r2.t.o().a());
        }
        ju1 i7 = e8.i();
        lx1 lx1Var = this.f11514g;
        i7.i(a9, false, null, lx1Var.e());
        pa1 d8 = e8.d();
        ra1 ra1Var = new ra1() { // from class: com.google.android.gms.internal.ads.hb2
            @Override // com.google.android.gms.internal.ads.ra1
            public final /* synthetic */ void E() {
                mr0 mr0Var = mr0.this;
                if (mr0Var.s0() != null) {
                    mr0Var.s0().m();
                }
            }
        };
        z64 z64Var = cm0.f6506g;
        d8.y0(ra1Var, z64Var);
        h03 h03Var = c03Var.f6186s;
        String str = h03Var.f9277a;
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && e8.l().a(true)) {
            str = ht0.a(str, ht0.b(c03Var));
        }
        e8.i();
        a5.d j7 = ju1.j(a9, h03Var.f9278b, str, lx1Var.e(), n31Var.d());
        if (c03Var.M) {
            j7.c(new Runnable() { // from class: com.google.android.gms.internal.ads.fb2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    mr0.this.u0();
                }
            }, this.f11512e);
        }
        j7.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ib2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                lb2.this.d(a9);
            }
        }, this.f11512e);
        return p64.k(j7, new hx3() { // from class: com.google.android.gms.internal.ads.jb2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj2) {
                return i21.this.h();
            }
        }, z64Var);
    }

    final /* synthetic */ void d(mr0 mr0Var) {
        mr0Var.V();
        w03 w03Var = this.f11511d;
        us0 g8 = mr0Var.g();
        s2.u4 u4Var = w03Var.f17955a;
        if (u4Var != null && g8 != null) {
            g8.k8(u4Var);
        }
        if (!((Boolean) s2.b0.c().d(uy.A1)).booleanValue() || mr0Var.isAttachedToWindow()) {
            return;
        }
        mr0Var.onPause();
        mr0Var.f1(true);
    }
}
