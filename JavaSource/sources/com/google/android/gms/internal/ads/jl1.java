package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class jl1 implements qb1, u2.c0, ra1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f10600q;

    /* renamed from: r, reason: collision with root package name */
    private final mr0 f10601r;

    /* renamed from: s, reason: collision with root package name */
    private final c03 f10602s;

    /* renamed from: t, reason: collision with root package name */
    private final w2.a f10603t;

    /* renamed from: u, reason: collision with root package name */
    private final da2 f10604u;

    /* renamed from: v, reason: collision with root package name */
    fa2 f10605v;

    public jl1(Context context, mr0 mr0Var, c03 c03Var, w2.a aVar, da2 da2Var) {
        this.f10600q = context;
        this.f10601r = mr0Var;
        this.f10602s = c03Var;
        this.f10603t = aVar;
        this.f10604u = da2Var;
    }

    private final boolean a() {
        return ((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && this.f10604u.b();
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        mr0 mr0Var;
        if (a()) {
            this.f10604u.d();
        } else {
            if (this.f10605v == null || (mr0Var = this.f10601r) == null) {
                return;
            }
            if (((Boolean) s2.b0.c().d(uy.V5)).booleanValue()) {
                mr0Var.B("onSdkImpression", new r.a());
            }
        }
    }

    @Override // u2.c0
    public final void V5(int i7) {
        this.f10605v = null;
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        mr0 mr0Var;
        ca2 ca2Var;
        ba2 ba2Var;
        c03 c03Var = this.f10602s;
        if (!c03Var.T || (mr0Var = this.f10601r) == null) {
            return;
        }
        if (r2.t.y().h(this.f10600q)) {
            if (a()) {
                this.f10604u.c();
                return;
            }
            w2.a aVar = this.f10603t;
            int i7 = aVar.f27052r;
            int i8 = aVar.f27053s;
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
            sb.append(i7);
            sb.append(".");
            sb.append(i8);
            String sb2 = sb.toString();
            z03 z03Var = c03Var.V;
            String a8 = z03Var.a();
            if (z03Var.c() == 1) {
                ba2Var = ba2.VIDEO;
                ca2Var = ca2.DEFINED_BY_JAVASCRIPT;
            } else {
                ca2Var = c03Var.Y == 2 ? ca2.UNSPECIFIED : ca2.BEGIN_TO_RENDER;
                ba2Var = ba2.HTML_DISPLAY;
            }
            fa2 g8 = r2.t.y().g(sb2, mr0Var.Q(), "", "javascript", a8, ca2Var, ba2Var, c03Var.f6173l0);
            this.f10605v = g8;
            if (g8 != null) {
                m93 a9 = g8.a();
                if (((Boolean) s2.b0.c().d(uy.R5)).booleanValue()) {
                    r2.t.y().a(a9, mr0Var.Q());
                    Iterator it = mr0Var.D().iterator();
                    while (it.hasNext()) {
                        r2.t.y().c(a9, (View) it.next());
                    }
                } else {
                    r2.t.y().a(a9, mr0Var.Z());
                }
                mr0Var.j1(this.f10605v);
                r2.t.y().b(a9);
                mr0Var.B("onSdkLoaded", new r.a());
            }
        }
    }

    @Override // u2.c0
    public final void g() {
        mr0 mr0Var;
        if (((Boolean) s2.b0.c().d(uy.V5)).booleanValue() || (mr0Var = this.f10601r) == null) {
            return;
        }
        if (this.f10605v != null || a()) {
            if (this.f10605v != null) {
                mr0Var.B("onSdkImpression", new r.a());
            } else {
                this.f10604u.d();
            }
        }
    }

    @Override // u2.c0
    public final void C7() {
    }

    @Override // u2.c0
    public final void H2() {
    }

    @Override // u2.c0
    public final void M5() {
    }

    @Override // u2.c0
    public final void P4() {
    }

    @Override // u2.c0
    public final void T5() {
    }

    @Override // u2.c0
    public final void Z4() {
    }

    @Override // u2.c0
    public final void a4() {
    }

    @Override // u2.c0
    public final void t7() {
    }

    @Override // u2.c0
    public final void v3() {
    }
}
