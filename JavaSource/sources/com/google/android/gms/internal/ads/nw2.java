package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class nw2 implements ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13070a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13071b;

    /* renamed from: c, reason: collision with root package name */
    private final gu0 f13072c;

    /* renamed from: d, reason: collision with root package name */
    private final ai2 f13073d;

    /* renamed from: e, reason: collision with root package name */
    private final ei2 f13074e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f13075f;

    /* renamed from: g, reason: collision with root package name */
    private qz f13076g;

    /* renamed from: h, reason: collision with root package name */
    private final ed1 f13077h;

    /* renamed from: i, reason: collision with root package name */
    private final e63 f13078i;

    /* renamed from: j, reason: collision with root package name */
    private final lf1 f13079j;

    /* renamed from: k, reason: collision with root package name */
    private final v03 f13080k;

    /* renamed from: l, reason: collision with root package name */
    private a5.d f13081l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13082m;

    /* renamed from: n, reason: collision with root package name */
    private s2.x2 f13083n;

    /* renamed from: o, reason: collision with root package name */
    private qi2 f13084o;

    public nw2(Context context, Executor executor, s2.g5 g5Var, gu0 gu0Var, ai2 ai2Var, ei2 ei2Var, v03 v03Var, lf1 lf1Var) {
        this.f13070a = context;
        this.f13071b = executor;
        this.f13072c = gu0Var;
        this.f13073d = ai2Var;
        this.f13074e = ei2Var;
        this.f13080k = v03Var;
        this.f13077h = gu0Var.l();
        this.f13078i = gu0Var.G();
        this.f13075f = new FrameLayout(context);
        this.f13079j = lf1Var;
        v03Var.B(g5Var);
        this.f13082m = true;
        this.f13083n = null;
        this.f13084o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void n() {
        this.f13081l = null;
        final s2.x2 x2Var = this.f13083n;
        this.f13083n = null;
        if (((Boolean) s2.b0.c().d(uy.a9)).booleanValue() && x2Var != null) {
            this.f13071b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kw2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    nw2.this.m(x2Var);
                }
            });
        }
        qi2 qi2Var = this.f13084o;
        if (qi2Var != null) {
            qi2Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean a(s2.b5 b5Var, String str, pi2 pi2Var, qi2 qi2Var) {
        n31 g8;
        if (str == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Ad unit ID should not be null for banner ad.");
            this.f13071b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lw2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    nw2.this.l();
                }
            });
            return false;
        }
        if (!b()) {
            if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && b5Var.f26061v) {
                this.f13072c.F().d(true);
            }
            Bundle a8 = ax1.a(new Pair(yw1.PUBLIC_API_CALL.c(), Long.valueOf(b5Var.P)), new Pair(yw1.DYNAMITE_ENTER.c(), Long.valueOf(r2.t.o().a())));
            v03 v03Var = this.f13080k;
            v03Var.F(str);
            v03Var.z(b5Var);
            v03Var.U(a8);
            Context context = this.f13070a;
            w03 Y = v03Var.Y();
            r53 b8 = q53.b(context, a63.g(Y), 3, b5Var);
            b63 b63Var = null;
            if (!((Boolean) c10.f6210d.e()).booleanValue() || !v03Var.E().A) {
                if (((Boolean) s2.b0.c().d(uy.a9)).booleanValue()) {
                    m31 q7 = this.f13072c.q();
                    d91 d91Var = new d91();
                    d91Var.a(context);
                    d91Var.b(Y);
                    q7.i(d91Var.e());
                    fg1 fg1Var = new fg1();
                    ai2 ai2Var = this.f13073d;
                    Executor executor = this.f13071b;
                    fg1Var.p(ai2Var, executor);
                    fg1Var.h(ai2Var, executor);
                    q7.p(fg1Var.q());
                    q7.d(new gg2(this.f13076g));
                    q7.q(new rl1(ao1.f5183h, null));
                    q7.l(new j41(this.f13077h, this.f13079j));
                    q7.j(new e21(this.f13075f));
                    g8 = q7.g();
                } else {
                    m31 q8 = this.f13072c.q();
                    d91 d91Var2 = new d91();
                    d91Var2.a(context);
                    d91Var2.b(Y);
                    q8.i(d91Var2.e());
                    fg1 fg1Var2 = new fg1();
                    ai2 ai2Var2 = this.f13073d;
                    Executor executor2 = this.f13071b;
                    fg1Var2.p(ai2Var2, executor2);
                    fg1Var2.i(ai2Var2, executor2);
                    fg1Var2.i(this.f13074e, executor2);
                    fg1Var2.j(ai2Var2, executor2);
                    fg1Var2.k(ai2Var2, executor2);
                    fg1Var2.d(ai2Var2, executor2);
                    fg1Var2.e(ai2Var2, executor2);
                    fg1Var2.f(ai2Var2, executor2);
                    fg1Var2.h(ai2Var2, executor2);
                    fg1Var2.n(ai2Var2, executor2);
                    q8.p(fg1Var2.q());
                    q8.d(new gg2(this.f13076g));
                    q8.q(new rl1(ao1.f5183h, null));
                    q8.l(new j41(this.f13077h, this.f13079j));
                    q8.j(new e21(this.f13075f));
                    g8 = q8.g();
                }
                if (((Boolean) p00.f13596c.e()).booleanValue()) {
                    b63Var = g8.d();
                    b63Var.i(3);
                    b63Var.c(b5Var.F);
                    b63Var.d(b5Var.C);
                }
                this.f13084o = qi2Var;
                w51 b9 = g8.b();
                a5.d c8 = b9.c(b9.b());
                this.f13081l = c8;
                p64.r(c8, new jw2(this, b63Var, b8, g8), this.f13071b);
                return true;
            }
            ai2 ai2Var3 = this.f13073d;
            if (ai2Var3 != null) {
                ai2Var3.o(z13.d(7, null, null));
            }
        } else if (!this.f13080k.a()) {
            this.f13082m = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean b() {
        a5.d dVar = this.f13081l;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                a5.d dVar = this.f13081l;
                if (dVar != null && dVar.isDone()) {
                    try {
                        h21 h21Var = (h21) this.f13081l.get();
                        this.f13081l = null;
                        ViewGroup viewGroup = this.f13075f;
                        viewGroup.removeAllViews();
                        h21Var.k();
                        ViewParent parent = h21Var.k().getParent();
                        if (parent instanceof ViewGroup) {
                            String c8 = h21Var.d() != null ? h21Var.d().c() : "";
                            StringBuilder sb = new StringBuilder(String.valueOf(c8).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(c8);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i7 = v2.n1.f26802b;
                            w2.p.f(sb2);
                            ((ViewGroup) parent).removeView(h21Var.k());
                        }
                        ly lyVar = uy.a9;
                        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                            ud1 g8 = h21Var.g();
                            g8.a(this.f13073d);
                            g8.b(this.f13074e);
                        }
                        viewGroup.addView(h21Var.k());
                        qi2 qi2Var = this.f13084o;
                        if (qi2Var != null) {
                            qi2Var.b(h21Var);
                        }
                        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                            Executor executor = this.f13071b;
                            final ai2 ai2Var = this.f13073d;
                            Objects.requireNonNull(ai2Var);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mw2
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    ai2.this.f();
                                }
                            });
                        }
                        if (h21Var.r() >= 0) {
                            this.f13082m = false;
                            ed1 ed1Var = this.f13077h;
                            ed1Var.W0(h21Var.r());
                            ed1Var.X0(h21Var.q());
                        } else {
                            this.f13082m = true;
                            this.f13077h.W0(h21Var.q());
                        }
                    } catch (InterruptedException e8) {
                        e = e8;
                        n();
                        v2.n1.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f13082m = true;
                        this.f13077h.d();
                    } catch (ExecutionException e9) {
                        e = e9;
                        n();
                        v2.n1.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f13082m = true;
                        this.f13077h.d();
                    }
                } else if (this.f13081l != null) {
                    v2.n1.k("Show timer went off but there is an ongoing ad request.");
                    this.f13082m = true;
                } else {
                    v2.n1.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f13082m = true;
                    this.f13077h.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup d() {
        return this.f13075f;
    }

    public final void e(qz qzVar) {
        this.f13076g = qzVar;
    }

    public final void f(s2.f0 f0Var) {
        this.f13074e.a(f0Var);
    }

    public final v03 g() {
        return this.f13080k;
    }

    public final boolean h() {
        Object parent = this.f13075f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        r2.t.g();
        return v2.f2.D(view, view.getContext());
    }

    public final void i(zc1 zc1Var) {
        this.f13077h.y0(zc1Var, this.f13071b);
    }

    public final void j() {
        this.f13077h.W0(this.f13079j.a());
    }

    public final void k() {
        this.f13077h.X0(this.f13079j.b());
    }

    final /* synthetic */ void l() {
        this.f13073d.o(z13.d(6, null, null));
    }

    final /* synthetic */ void m(s2.x2 x2Var) {
        this.f13073d.o(x2Var);
    }

    final /* synthetic */ ed1 o() {
        return this.f13077h;
    }

    final /* synthetic */ e63 p() {
        return this.f13078i;
    }

    final /* synthetic */ lf1 q() {
        return this.f13079j;
    }

    final /* synthetic */ boolean r() {
        return this.f13082m;
    }

    final /* synthetic */ void s(s2.x2 x2Var) {
        this.f13083n = x2Var;
    }
}
