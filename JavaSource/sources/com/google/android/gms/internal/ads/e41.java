package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class e41 implements qb1, ra1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f7415q;

    /* renamed from: r, reason: collision with root package name */
    private final mr0 f7416r;

    /* renamed from: s, reason: collision with root package name */
    private final c03 f7417s;

    /* renamed from: t, reason: collision with root package name */
    private final w2.a f7418t;

    /* renamed from: u, reason: collision with root package name */
    private fa2 f7419u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7420v;

    /* renamed from: w, reason: collision with root package name */
    private final da2 f7421w;

    public e41(Context context, mr0 mr0Var, c03 c03Var, w2.a aVar, da2 da2Var) {
        this.f7415q = context;
        this.f7416r = mr0Var;
        this.f7417s = c03Var;
        this.f7418t = aVar;
        this.f7421w = da2Var;
    }

    private final synchronized void a() {
        mr0 mr0Var;
        ca2 ca2Var;
        ba2 ba2Var;
        try {
            c03 c03Var = this.f7417s;
            if (c03Var.T && (mr0Var = this.f7416r) != null) {
                if (r2.t.y().h(this.f7415q)) {
                    w2.a aVar = this.f7418t;
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
                        int i9 = c03Var.f6158e;
                        ba2 ba2Var2 = ba2.HTML_DISPLAY;
                        ca2Var = i9 == 1 ? ca2.ONE_PIXEL : ca2.BEGIN_TO_RENDER;
                        ba2Var = ba2Var2;
                    }
                    fa2 g8 = r2.t.y().g(sb2, mr0Var.Q(), "", "javascript", a8, ca2Var, ba2Var, c03Var.f6173l0);
                    this.f7419u = g8;
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
                        mr0Var.j1(this.f7419u);
                        r2.t.y().b(a9);
                        this.f7420v = true;
                        mr0Var.B("onSdkLoaded", new r.a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean b() {
        return ((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && this.f7421w.b();
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final synchronized void E() {
        mr0 mr0Var;
        if (b()) {
            this.f7421w.d();
            return;
        }
        if (!this.f7420v) {
            a();
        }
        if (!this.f7417s.T || this.f7419u == null || (mr0Var = this.f7416r) == null) {
            return;
        }
        mr0Var.B("onSdkImpression", new r.a());
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void f() {
        if (b()) {
            this.f7421w.c();
        } else {
            if (this.f7420v) {
                return;
            }
            a();
        }
    }
}
